package iutinfo.lp.devmob.objectifsportifapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import iutinfo.lp.devmob.objectifsportifapp.adapter.SportAdapter
import iutinfo.lp.devmob.objectifsportifapp.model.Sport
import iutinfo.lp.devmob.objectifsportifapp.model.dao.AppDatabase
import kotlinx.android.synthetic.main.activity_sport_list.*

class SportListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_list)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        val sportAdapter : SportAdapter = SportAdapter(this)
        sportList.adapter =  sportAdapter
        val db = AppDatabase.AppDatabaseProvider.getAppDatabase(this).sportDao()
        addSportButton.setOnClickListener {
            val singleSport = Sport("karaté", duration = true, distance = false)
            db.insert(singleSport)
        }
        super.onCreate(savedInstanceState, persistentState)
    }


}