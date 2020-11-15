package com.egiwon.randomusers.data.source

import com.egiwon.randomusers.Result
import com.egiwon.randomusers.data.entity.RandomUserResponse
import com.egiwon.randomusers.data.randomuser.RandomUserRemoteDataSource
import com.egiwon.randomusers.data.randomuser.RandomUserService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RandomRemoteDataSourceImpl @Inject constructor(
    private val randomUserService: RandomUserService
) : RandomUserRemoteDataSource {

    override suspend fun getRandomUsers(numUser: Int): Result<RandomUserResponse> =
        withContext(Dispatchers.IO) {
            try {
                Result.Success(randomUserService.getRandomUsers(numUser))
            } catch (ex: Exception) {
                Result.Failure(ex)
            }
        }

}
