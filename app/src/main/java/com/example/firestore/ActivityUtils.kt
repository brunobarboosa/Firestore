package com.example.firestore

import android.app.Activity
import android.content.Intent

fun Activity.goHome() {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
}