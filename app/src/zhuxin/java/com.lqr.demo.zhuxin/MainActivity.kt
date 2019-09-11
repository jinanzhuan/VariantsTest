package com.lqr.demo.zhuxin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.variantstest.R
import kotlinx.android.synthetic.zhuxin.activity_main_zhuxin.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_zhuxin)
        initListener()
    }

    private fun initListener() {
        btn_skip.setOnClickListener { startActivity<ZhuxinActivity>() }
    }
}
