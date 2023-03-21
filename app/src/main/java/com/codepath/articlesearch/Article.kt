package com.example.flixter2
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val docs: List<Movies>?
)
@Keep
@Serializable
data class Movies(
    @SerialName("poster_path")
    val poster: String?,
    @SerialName("adult")
    val rating: Boolean?,
    @SerialName("overview")
    val overview: String?,
    @SerialName("original_title")
    val Original: String?,
    @SerialName("backdrop_path")
    val backdrop: String?
): java.io.Serializable{
    val mediaImageUrl = "https://image.tmdb.org/t/p/w500${poster}"
    val mediaBackup =  "https://image.tmdb.org/t/p/w500${backdrop}"
}