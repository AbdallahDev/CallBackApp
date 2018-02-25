package com.example.user.callbackapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun ok(v: View) {
        var i = Intent()
        i.putExtra("name", editText.text.toString())
        setResult(7, i)
        finish()
    }
}
