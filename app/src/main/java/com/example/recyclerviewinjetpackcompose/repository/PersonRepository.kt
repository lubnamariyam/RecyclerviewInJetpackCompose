package com.example.recyclerviewinjetpackcompose.repository

import com.example.recyclerviewinjetpackcompose.model.Person

class PersonRepository {

    fun getAllData() : List<Person>{
        return listOf(
            Person(
                id = 0,
                firstName = "Hina",
                lastName = "preist",
                age = 20
            ),
            Person(
                id = 1,
                firstName = "Maria",
                lastName = "karla",
                age = 21
            ),
            Person(
                id = 2,
                firstName = "Jones",
                lastName = "Johnson",
                age = 22
            ),
            Person(
                id = 3,
                firstName = "life",
                lastName = "style",
                age = 23
            ),
            Person(
                id = 4,
                firstName = "Rehort",
                lastName = "Davis",
                age = 24
            ),
            Person(
                id = 5,
                firstName = "Jeni",
                lastName = "Mortie",
                age = 25
            ),
            Person(
                id = 6,
                firstName = "Sarah",
                lastName = "Loperz",
                age = 26
            ),
            Person(
                id = 7,
                firstName = "Charles",
                lastName = "Wilson",
                age = 27
            ),
            Person(
                id = 8,
                firstName = "Daniel",
                lastName = "Taylor",
                age = 28
            ),
            Person(
                id = 10,
                firstName = "Mark",
                lastName = "Town",
                age = 29
            ),
            Person(
                id = 11,
                firstName = "Karl",
                lastName = "Dimple",
                age = 29
            ),
            Person(
                id = 12,
                firstName = "Luisifer",
                lastName = "Macara",
                age = 29
            ),
            Person(
                id = 13,
                firstName = "Toest",
                lastName = "Timp",
                age = 29
            ),
            Person(
                id = 14,
                firstName = "lie",
                lastName = "Mirza",
                age = 29
            ),
        )

    }
}