package com.hussainmehboob.swbapp.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.hussainmehboob.swbapp.Fragments.FragEventList
import com.hussainmehboob.swbapp.Fragments.dummy.DummyContent
import com.hussainmehboob.swbapp.R
import com.hussainmehboob.swbapp.UTILS
import com.hussainmehboob.swbapp.UTILS.Companion.showOptionsDialog

import kotlinx.android.synthetic.main.activity_event_list.*

class ActivityEventList : AppCompatActivity(), FragEventList.OnListFragmentInteractionListener {

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        showOptionsDialog(this, layoutInflater, R.layout.dialog_option_menu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_activity_event_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       // Handle action bar item clicks here. The action bar will
       // automatically handle clicks on the Home/Up button, so long
       // as you specify a parent activity in AndroidManifest.xml.
       when (item.itemId) {
           R.id.action_sync_now ->{
               UTILS.showToastMessage(this, "Sync Successful")
               return true
           }
           else -> return super.onOptionsItemSelected(item)
       }
   }

}
