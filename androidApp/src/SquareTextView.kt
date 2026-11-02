package com.example.mefirsthomework

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class SquareTextView(context: Context, attrs: AttributeSet?) : TextView(context, attrs) {

    // Height always equals width, so the view is a square
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }
}
