package com.hussainmehboob.swbapp.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hussainmehboob.swbapp.R
import com.hussainmehboob.swbapp.UTILS
import kotlinx.android.synthetic.main.activity_dummy_attendance.*

class DummyActivityAttendance : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy_attendance)
        btnMarkAttendance.setOnClickListener{
            UTILS.showToastMessage(this, "Attendance Marked Successfully")
            finish()
        }
    }
}
