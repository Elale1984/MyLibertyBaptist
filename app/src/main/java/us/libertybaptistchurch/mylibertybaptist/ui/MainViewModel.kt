package us.libertybaptistchurch.mylibertybaptist.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _currentScreen = MutableLiveData<Screens>(Screens.DrawerScreens.Home)

}