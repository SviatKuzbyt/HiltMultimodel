package ua.sviatkuzbyt.hiltmultimodel.domain

class GetUsersUseCase(private val repository: UserRepository) {
    fun invoke() = repository.getUsers()
}