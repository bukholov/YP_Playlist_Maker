package com.example.yp_playlist_maker.data

import com.example.yp_playlist_maker.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response
}