package ua.sviatkuzbyt.hiltmultimodel.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import ua.sviatkuzbyt.hiltmultimodel.app.ui.theme.HiltMultimodelTheme
import ua.sviatkuzbyt.hiltmultimodel.domain.GetUsersUseCase
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.printUsers()
    }
}

@HiltViewModel
class UserViewModel @Inject constructor (private val getUsersUseCase: GetUsersUseCase){
    fun printUsers(){
        getUsersUseCase.invoke().forEach {
            println("SKLT $it")
        }
    }
}