package com.hemanth.runfitness.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.hemanth.runfitness.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(
    mainRepository: MainRepository
) : ViewModel() {
}