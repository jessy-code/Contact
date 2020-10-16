package com.example.contact


import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET

data class Questions(
    @SerializedName("has_more")
    val hasMore: Boolean?,
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("quota_max")
    val quotaMax: Int?,
    @SerializedName("quota_remaining")
    val quotaRemaining: Int?
)

interface StackService{
    @GET("question?order=desc&sort=activity&site=stackoverflow")
    fun getQuestion() : Call<Questions>
}