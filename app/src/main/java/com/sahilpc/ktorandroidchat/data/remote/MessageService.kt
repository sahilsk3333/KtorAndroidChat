package com.sahilpc.ktorandroidchat.data.remote

import com.sahilpc.ktorandroidchat.domain.model.Message

interface MessageService {
    suspend fun getAllMessages():List<Message>

    companion object{
        // use your local ip instead of 192.168.51
        // don't use http:localhost because it doesn't work for emulator
        const val BASE_URL = "http://192.168.51.162:8080"
    }
    sealed class  Endpoints(val url:String){
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}