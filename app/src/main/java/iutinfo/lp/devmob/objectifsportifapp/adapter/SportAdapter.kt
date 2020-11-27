package iutinfo.lp.devmob.objectifsportifapp.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.DrawableCompat
import androidx.recyclerview.widget.RecyclerView
import iutinfo.lp.devmob.objectifsportifapp.R
import iutinfo.lp.devmob.objectifsportifapp.model.Sport
import iutinfo.lp.devmob.objectifsportifapp.model.dao.AppDatabase
import kotlinx.android.synthetic.main.sport_element.view.*


class SportAdapter(
    private val context: Context,

    ): RecyclerView.Adapter<SportAdapter.ItemViewHolder>(){

    private var database = AppDatabase.AppDatabaseProvider.getAppDatabase(context).sportDao()
    private var sportList: List<Sport> = database.getAll()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sport_element, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemView.sportNameField.text = sportList[position].name

        if(sportList[position].distanceOption){
            var drawable : Drawable? = AppCompatResources.getDrawable(context,R.drawable.ic_baseline_timeline_24)
            if (drawable != null) {
                DrawableCompat.wrap(drawable).setTint(Color.GREEN)
            }
        }
        if(sportList[position].durationOption){
            var drawable : Drawable? = AppCompatResources.getDrawable(context,R.drawable.ic_baseline_timer_24)
            if(drawable != null){
                DrawableCompat.wrap(drawable).setTint(Color.GREEN)
            }
        }
        holder.itemView.deleteSportImage.setOnClickListener {
            database.delete(sportList[position])
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return sportList.size
    }


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
    }
}
