package com.egiwon.randomusers.data

import com.egiwon.randomusers.Result
import com.egiwon.randomusers.data.entity.RandomUserResponse

interface RandomUserRepository {

    suspend fun getRandomUsers(numUser: Int): Result<RandomUserResponse>
}
