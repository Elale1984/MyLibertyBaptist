package us.libertybaptistchurch.mylibertybaptist.ui


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import us.libertybaptistchurch.mylibertybaptist.R

sealed class Screens(val route: String, val title: String) {

    sealed class HomeScreens(
        route: String,
        title: String,
        val icon: Int
    ) : Screens (
        route,
        title
    ) {
        object Home : HomeScreens("home", "Home", R.drawable.ic_menu_home)
        object Notifications : HomeScreens("notifications", "Notifications", R.drawable.ic_menu_notifications)
        object Bible : HomeScreens("bible", "Bible", R.drawable.ic_menu_bible)
    }

    sealed class DrawerScreens(
        route: String,
        title: String,
        val icon: Int
    ) : Screens(route, title) {

        object Home : DrawerScreens("home", "Home", R.drawable.ic_menu_home)
        object Profile : DrawerScreens("profile", "Profile", R.drawable.ic_menu_profile)
        object Notifications : DrawerScreens("notifications", "Notifications", R.drawable.ic_menu_notifications)
        object Bible : DrawerScreens("bible", "Bible", R.drawable.ic_menu_bible)
        object Calender : DrawerScreens("calender", "Calender", R.drawable.ic_menu_calender)
        object Media : DrawerScreens("media", "Media", R.drawable.ic_menu_video)
        object Events : DrawerScreens("events", "Events", R.drawable.ic_menu_events)
        object Settings : DrawerScreens("settings", "Settings", R.drawable.ic_menu_settings)

    }
}

val screensInHomeFromBottomNav = listOf(
    Screens.HomeScreens.Home,
    Screens.HomeScreens.Notifications,
    Screens.HomeScreens.Bible
)

val screensFromDrawer = listOf(
    Screens.DrawerScreens.Home,
    Screens.DrawerScreens.Profile,
    Screens.DrawerScreens.Notifications,
    Screens.DrawerScreens.Bible,
    Screens.DrawerScreens.Calender,
    Screens.DrawerScreens.Media,
    Screens.DrawerScreens.Events,
    Screens.DrawerScreens.Settings
)

@Composable
fun Home(modifier: Modifier = Modifier, viewModel: MainViewModel) {
    viewModel.setCurrentScreen(Screens.DrawerScreens.Home)
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home", style = MaterialTheme.typography.h4)
    }
}

