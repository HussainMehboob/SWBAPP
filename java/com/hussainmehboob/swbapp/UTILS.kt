package com.hussainmehboob.swbapp

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.widget.Toast
import com.hussainmehboob.swbapp.Activities.DummyActivityAttendance
import com.hussainmehboob.swbapp.Activities.DummyActivityRegister
import kotlinx.android.synthetic.main.dialog_option_menu.view.*

class UTILS {
    companion object {

        fun openActivity(context: Context, calledActivity: Class<*>, finish: Boolean) {
            if (finish)
                (context as Activity).finish()
            val myIntent = Intent(context, calledActivity)
            myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(myIntent)
            //hello
        }


        fun showOptionsDialog(context: Context, layoutInflater: LayoutInflater, resource:Int) {
            val dialogBuilder = AlertDialog.Builder(context, R.style.TransparentDialog)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(resource, null)
            dialogBuilder.setView(dialogView)

            val dialog = dialogBuilder.create()

            dialogView.btnRegister.setOnClickListener {
                openActivity(context, DummyActivityRegister::class.java, false)
                dialog.dismiss()
            }
            dialogView.btnAttendance.setOnClickListener {
                openActivity(context, DummyActivityAttendance::class.java, false)
                dialog.dismiss()
            }

            dialog.show()
        }

        fun showToastMessage(context: Context, message: String) {
            try {
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                e.printStackTrace();
            }
        }

    }
}