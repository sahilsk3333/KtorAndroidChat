package com.sahilpc.ktorandroidchat.domain.model

data class Message(
    val text: String,
    val formattedTime: String,
    val username: String
)
