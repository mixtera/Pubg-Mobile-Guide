package com.f.pubgmobileguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_menu.view.*

class MenuAdapter(
    val sectionList: ArrayList<MenuSection>
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_menu, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val section = sectionList[position]
        holder.bind(section)
    }

    override fun getItemCount(): Int {
        return sectionList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind (section: MenuSection){
            itemView.textViewParts.text = section.title
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailsActivity::class.java)
                intent.putExtra("section", section)
                itemView.context.startActivity(intent)
            }
        }
    }


}