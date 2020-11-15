package com.egiwon.randomusers.data.randomuser

import com.egiwon.randomusers.data.entity.RandomUserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserService {

    @GET
    suspend fun getRandomUsers(
        @Query("results") results: Int = 10
    ): RandomUserResponse
}
