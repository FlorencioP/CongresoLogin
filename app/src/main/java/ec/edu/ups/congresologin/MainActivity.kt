package ec.edu.ups.congresologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import ec.edu.ups.congresologin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLogout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLogout = binding.drawerLayout

        var navController = this.findNavController(R.id.navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLogout)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLogout)

    }


    override fun onSupportNavigateUp(): Boolean {
        var navController = this.findNavController(R.id.navigation_fragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}