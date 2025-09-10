package com.example.demo.service

import com.example.demo.model.Message
import com.example.demo.repository.MessageRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MessageService(private val repository: MessageRepository) {
    fun findMessages(): List<Message> = repository.findAll().toList()

    fun findById(messageId: String): Message? = repository.findByIdOrNull(messageId);

    fun save(message: Message): Message = repository.save(message);
}