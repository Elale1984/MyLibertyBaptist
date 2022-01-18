package us.libertybaptistchurch.mylibertybaptist.ui

import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import us.libertybaptistchurch.mylibertybaptist.R

sealed class Screens(val route: String, val title: String) {

    sealed class HomeScreens(
        route: String,
        title: String,
        val icon: drawable
    ) : Screens (
        route,
        title
    ) {
        object Home : HomeScreens("home", "Home", R.drawable.ic_menu_home)
        object
    }
}
