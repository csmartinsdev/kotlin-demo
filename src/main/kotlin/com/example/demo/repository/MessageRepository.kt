package com.example.demo.repository

import com.example.demo.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository: CrudRepository<Message, String>