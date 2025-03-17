package ua.sviatkuzbyt.hiltmultimodel.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ua.sviatkuzbyt.hiltmultimodel.domain.UserRepository

@Module
@InstallIn(ActivityComponent::class)
object DataModule {
    @Provides
    fun provideUserRepository(roomManager: RoomManager): UserRepository {
        return UserRepositoryImpl(roomManager)
    }
}