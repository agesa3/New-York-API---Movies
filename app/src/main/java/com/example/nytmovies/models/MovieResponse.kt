package com.example.nytmovies.models


data class MovieResponse(
    val results: List<Result>,
    val copyright: String,
    val has_more: Boolean,
    val num_results: Int,
    val status: String
)


data class Result(
    val id: Int,
    val display_title: String,
    val link: Link,
    val mpaa_rating: String,
    val multimedia: Multimedia,
    val publication_date: String,
    val summary_short: String
)



data class Link(
    val suggested_link_text: String,
    val type: String,
    val url: String
)

data class Multimedia(
    val height: Int,
    val src: String,
    val type: String,
    val width: Int
)