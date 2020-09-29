package com.anwesh.uiprojects.arrowlinecreatorview

/**
 * Created by anweshmishra on 30/09/20.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas

val colors : Array<Int> = arrayOf(
        "#F44336",
        "#009688",
        "#3F51B5",
        "#FFC107",
        "#4CAF50"
).map({Color.parseColor(it)}).toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / 4
val strokeFactor : Int = 90
val sizeFacotor : Float = 3.9f
val mainLineFactor : Float = 2.9f
val backColor : Int = Color.parseColor("#BDBDBD")
