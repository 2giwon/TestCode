package com.egiwon.randomusers

sealed class Result<out R> {
    class Success<out T>(val data: T) : Result<T>()
    class Failure(val throwable: Exception) : Result<Nothing>()
}
