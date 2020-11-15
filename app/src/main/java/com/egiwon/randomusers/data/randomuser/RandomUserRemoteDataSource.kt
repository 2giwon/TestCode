package com.egiwon.randomusers.data.randomuser

import com.egiwon.randomusers.Result
import com.egiwon.randomusers.data.entity.RandomUserResponse

interface RandomUserRemoteDataSource {

    suspend fun getRandomUsers(): Result<RandomUserResponse>
}
