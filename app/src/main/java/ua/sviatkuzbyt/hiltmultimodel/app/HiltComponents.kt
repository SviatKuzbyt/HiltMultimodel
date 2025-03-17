package ua.sviatkuzbyt.hiltmultimodel.app

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ActivityComponent
import ua.sviatkuzbyt.hiltmultimodel.domain.GetUsersUseCase
import ua.sviatkuzbyt.hiltmultimodel.domain.UserRepository

@HiltAndroidApp
class MyApp: Application()

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    fun provideGetUsersUseCase(repository: UserRepository): GetUsersUseCase {
        return GetUsersUseCase(repository)
    }

}