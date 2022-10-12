package br.com.avilez.oop

data class DataProduct(
    val name: String,
    var price: Double,
    var onSale: Boolean = false
)