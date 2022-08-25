package kr.co.alm.mobile_tutorial.remote.retrofit

import kr.co.alm.mobile_tutorial.remote.service.GithubService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class GithubRetrofitModule {

    val githubService: GithubService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create()

    companion object {

        private const val BASE_URL = "https://api.github.com"
    }
}
