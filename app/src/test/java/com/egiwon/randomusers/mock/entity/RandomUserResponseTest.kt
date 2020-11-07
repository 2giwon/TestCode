package com.egiwon.randomusers.mock.entity

import com.egiwon.randomusers.data.entity.RandomUserResponse
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomUserResponseTest {

    @Test
    fun `랜덤 유저의 정보에 대한 Json 을 엔티티로 변환합니다`() {
        val response =
            Json.decodeFromString<RandomUserResponse>(Mock.MOCK_USER_DATA)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }
}