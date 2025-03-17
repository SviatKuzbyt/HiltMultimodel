package ua.sviatkuzbyt.hiltmultimodel.domain

interface UserRepository {
    fun getUsers(): List<UserDataDomain>
    fun addUser(user: UserDataDomain)
}