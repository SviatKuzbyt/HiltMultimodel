package ua.sviatkuzbyt.hiltmultimodel.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RoomManager @Inject constructor() {
    val users = listOf(
        UserData(1, "Alice", 25),
        UserData(2, "Bob", 30),
        UserData(3, "Charlie", 28),
        UserData(4, "David", 22),
        UserData(5, "Emma", 27),
        UserData(6, "Frank", 35),
        UserData(7, "Grace", 29),
        UserData(8, "Henry", 26),
        UserData(9, "Ivy", 24),
        UserData(10, "Jack", 31)
    )
}