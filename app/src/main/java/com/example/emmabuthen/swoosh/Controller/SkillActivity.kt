package com.example.emmabuthen.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emmabuthen.swoosh.Controller.FinishActivity
import com.example.emmabuthen.swoosh.Utilities.EXTRA_LEAGUE
import com.example.emmabuthen.swoosh.Utilities.EXTRA_SKILL
import com.example.jonnyb.swoosh.BaseActivity
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league: String? = null
    var selectedSkill: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)


    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        selectedSkill = beginnerSkillBtn.text.toString().toLowerCase()
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        selectedSkill = ballerSkillBtn.text.toString().toLowerCase()
    }


    fun onSkillFinishClicked(view: View) {

        if (selectedSkill != null) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }


    }
}
