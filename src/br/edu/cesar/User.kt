package br.edu.cesar

data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("Alex", 1)
}

fun main() {
    val user = getUser()
    println("(${user.name}, ${user.id})")

    val (name, id) = getUser()
    println("name = $name id = $id")
}