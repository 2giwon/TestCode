package com.egiwon.randomusers.data.randomuser

import com.egiwon.randomusers.Result
import com.egiwon.randomusers.data.RandomUserRepository
import com.egiwon.randomusers.data.entity.RandomUserResponse
import javax.inject.Inject

class RandomUserRepositoryImpl @Inject constructor(
    private val randomUserRemoteDataSource: RandomUserRemoteDataSource
) : RandomUserRepository {

    override suspend fun getRandomUsers(): Result<RandomUserResponse> =
        randomUserRemoteDataSource.getRandomUsers()


}
