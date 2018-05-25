package com.example.emmabuthen.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emmabuthen.swoosh.Controller.FinishActivity
import com.example.emmabuthen.swoosh.Model.Player
import com.example.emmabuthen.swoosh.Utilities.EXTRA_PLAYER
import com.example.jonnyb.swoosh.BaseActivity
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = beginnerSkillBtn.text.toString().toLowerCase()
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = ballerSkillBtn.text.toString().toLowerCase()
    }


    fun onSkillFinishClicked(view: View) {

        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }


    }
}
