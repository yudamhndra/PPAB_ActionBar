package com.example.tugas_actionbar

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val actionBar = supportActionBar

        actionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        actionBar?.setCustomView(R.layout.action_bar)
        val colorDrawable = ColorDrawable(Color.parseColor("#3c59ff"))

        actionBar?.setBackgroundDrawable(colorDrawable)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_homepage, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_signout -> {
                val intentToHome = Intent(this@HomePageActivity, AuthActivity::class.java)
                startActivity(intentToHome)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
