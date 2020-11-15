package com.egiwon.randomusers.mock.data.entity

import com.egiwon.randomusers.data.entity.RandomUserResponse
import com.google.gson.Gson
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomUserResponseTest {

    @Test
    fun `랜덤 유저의 정보에 대한 Json 을 엔티티로 변환합니다`() {
        val response =
            Gson().fromJson(Mock.MOCK_USER_DATA, RandomUserResponse::class.java)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }
}
