package com.example.taskmanager.presentation.signUpScreen

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskmanager.data.repository.UserRepository
import com.example.taskmanager.model.User
import com.example.taskmanager.utils.Resource
import com.example.taskmanager.utils.State
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SignUpVm(private val userRepository: UserRepository) : ViewModel() {
    private val userRecourse=Resource<User>(State.LOADING,null,null)
    private val state= mutableStateOf(Resource<User>(State.LOADING,null,null))

    fun insertUserDB(username:String,password:String){
        val user=User(username=username,password=password)
        viewModelScope.launch(Dispatchers.IO){
            userRepository.insert(user)
            state.setValue(Resource.success(user))
        }
    }
}