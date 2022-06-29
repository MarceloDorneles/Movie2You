package com.example.movie2you.m2u

import android.provider.MediaStore

data class MovieDetails(
    val overview: String?,
    val genres: List<Genero>,
    val title: String?,
    val runtime: Int?
)

//Gêneros de Filmes
data class Genero(
    val name: String?
    ) {

    val generoAcao = Genero("Ação")
    val generoAventura = Genero("Aventura")
    val generoComedia = Genero("Comédia")
    val generoDrama = Genero("Drama")
    val generoInfantil = Genero("Infantil")
    val generoSuperHeroi = Genero("Super Herói")
    val generoTerro = Genero("Terror")
}


data class ResponseDaReview(
    val results: List<ItemDaListaDeReview>
)

data class ItemDaListaDeReview(
    val author: String?,
    val content: String?
    )




