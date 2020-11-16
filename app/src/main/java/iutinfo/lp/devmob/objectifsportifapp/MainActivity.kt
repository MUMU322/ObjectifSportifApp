package iutinfo.lp.devmob.objectifsportifapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import iutinfo.lp.devmob.objectifsportifapp.model.dao.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.AppDatabaseProvider.getAppDatabase(this)


    }
}