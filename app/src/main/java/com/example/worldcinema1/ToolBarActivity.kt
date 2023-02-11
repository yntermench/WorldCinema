package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class ToolBarActivity : AppCompatActivity() {
    lateinit var tb:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Кино"

        val frame_res:RecyclerView = findViewById((R.id.rec_view1))
        frame_res.adapter=Frame_adapter(this, FrameList().list)

        val character_res:RecyclerView = findViewById((R.id.rec_view2))
        character_res.adapter=Character_adapter(this, CharacterList().list)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==android.R.id.home){
            val inte = Intent(this, Patch::class.java)
            startActivity(inte)
            finish()
        }

        return true
    }
}