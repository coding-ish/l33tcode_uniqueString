package com.example.uniquestring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(Solution().firstUniqChar("test"))
    }
}

class Solution {
    fun firstUniqChar(s: String): Int {
        var firstUnique = -1
        for(i in 0 until s.length){
            println(s.substring(i, i+1))
            if(!s.contains(s.substring(i, i+1))){
                firstUnique = i
                break
            }
        }
        return firstUnique
    }
}