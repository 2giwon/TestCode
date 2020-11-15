package com.egiwon.randomusers.mock.data.randomuser

import com.egiwon.randomusers.Result
import com.egiwon.randomusers.data.RandomUserRepository
import com.egiwon.randomusers.data.entity.RandomUserResponse
import com.egiwon.randomusers.data.randomuser.RandomUserRemoteDataSource
import com.egiwon.randomusers.data.randomuser.RandomUserRepositoryImpl
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@ExtendWith(MockKExtension::class)
class RandomUserRepositoryTest {

    @RelaxedMockK
    private lateinit var randomUserRemoteDataSource: RandomUserRemoteDataSource
    private lateinit var repository: RandomUserRepository

    @BeforeEach
    fun setup() {
        repository = RandomUserRepositoryImpl(
            randomUserRemoteDataSource
        )
    }

    @ParameterizedTest
    @ValueSource(ints = [10, 100, 1000])
    fun `임의의 유저를 전달된 갯수만큼 가져온다`(users: Int) = runBlocking {
        val mock: Result<RandomUserResponse> = mockk()

        coEvery {
            randomUserRemoteDataSource.getRandomUsers(users)
        } returns mock

        val result = repository.getRandomUsers(users)
        coVerify {
            repository.getRandomUsers(users)
        }
        assertEquals(mock, result)
    }

}
