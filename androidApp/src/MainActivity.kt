package com.example.mefirsthomework

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {
    private lateinit var adapter: SquaresAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val count = savedInstanceState?.getInt(KEY_COUNT)
            ?: resources.getInteger(R.integer.initial_count)
        adapter = SquaresAdapter(count)

        val list = findViewById<RecyclerView>(R.id.list)
        list.adapter = adapter

        findViewById<Button>(R.id.add_button).setOnClickListener {
            adapter.addItem()
            list.scrollToPosition(adapter.itemCount - 1)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY_COUNT, adapter.itemCount)
    }

    private companion object {
        const val KEY_COUNT = "count"
    }
}
