package com.example.zadanie


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.widget.Toolbar

class Completed : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.completed)

        val autorization:Toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(autorization)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.filters)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.alltasks-> {
                val alltasks=Intent(this, AllTasks::class.java)
                startActivity(alltasks)
            }

            R.id.completed-> {
                val completed=Intent(this, Completed::class.java)
                startActivity(completed)
            }
            R.id.profile-> {
                val profile=Intent(this, Profile::class.java)
                startActivity(profile)
            }
            R.id.today-> {
                val today=Intent(this, Today::class.java)
                startActivity(today)
            }
            R.id.favorites-> {
                val favorites=Intent(this, Favorites::class.java)
                startActivity(favorites)
            }
        }
        return super.onOptionsItemSelected(item)

    }
}