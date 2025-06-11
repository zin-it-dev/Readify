package com.example.readify

fun main(args: Array<String>) {
    println("Welcome to Readify !!!")

    val books = listOf(Book("Doraemon", 39.5f, "Truyen Tranh"), Book("Conan", 99.5f, "Truyen Tranh"), Book("Bien Dong", 25.5f, "News"))

    for (book in books) {
        book.show()
    }
}

class Book(var title: String, var price: Float = 0.00f, var category: String) {
    fun show() {
        println("Title: ${title}")
        println("Price: $${price}")
        println("Category: ${category}")
    }
}