package com.sahilpc.ktorandroidchat.presentation.chat

import com.sahilpc.ktorandroidchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)