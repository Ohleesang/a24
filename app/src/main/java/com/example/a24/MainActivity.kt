package com.example.a24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(seoul: Array<String>): String {
                var answer =""
                var index = seoul.indexOf("Kim")
                answer= "김서방은 ${index}에 있다"
                return answer
            }
        }
        val a =Solution()
        a.solution(arrayOf<String>("Jane","Kim"))
    }
}