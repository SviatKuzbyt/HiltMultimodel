package ua.sviatkuzbyt.hiltmultimodel.data

import dagger.hilt.android.scopes.ViewModelScoped
import ua.sviatkuzbyt.hiltmultimodel.domain.UserDataDomain
import ua.sviatkuzbyt.hiltmultimodel.domain.UserRepository
import javax.inject.Inject

@ViewModelScoped
class UserRepositoryImpl @Inject constructor (
    private val roomManager: RoomManager
): UserRepository {

    override fun getUsers(): List<UserDataDomain> {
        return roomManager.users.map {
            mapUser(it)
        }
    }

    private fun mapUser(user: UserData): UserDataDomain{
        return UserDataDomain(user.id, user.name, user.age)
    }
}