package com.egiwon.randomusers.mock.data.randomuser

import com.egiwon.randomusers.data.randomuser.RandomUserRemoteDataSource
import com.egiwon.randomusers.data.randomuser.RandomUserService
import com.egiwon.randomusers.data.source.RandomRemoteDataSourceImpl
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class RandomUserRemoteDataSourceImplTest {

    @RelaxedMockK
    private lateinit var randomUserService: RandomUserService
    private lateinit var randomUserRemoteDataSource: RandomUserRemoteDataSource

    @BeforeEach
    fun setup() {
        randomUserRemoteDataSource = RandomRemoteDataSourceImpl(randomUserService)
    }

    @Test
    fun `랜덤으로 다수의 유저를 가져옵니다`() = runBlocking {
        randomUserRemoteDataSource.getRandomUsers(10)

        coVerify {
            randomUserService.getRandomUsers(10)
        }
    }
}
