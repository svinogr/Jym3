package info.upump.jym.adapters.cycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import info.upump.jym.adapters.viewholders.cycle.AbstractCycleViewHolder
import info.upump.jym.adapters.viewholders.cycle.CycleDefaultViewHolder
import info.upump.jym.databinding.CycleCardLayoutBinding
import info.upump.jym.databinding.CycleDefaultCardLayoutBinding
import info.upump.jym.models.Cycle
import info.upump.jym.util.Constants

class CycleAdapter(var list: List<Cycle>, val type: Int) :
    RecyclerView.Adapter<CycleDefaultViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleDefaultViewHolder {
        var holder: CycleDefaultViewHolder? = null
        when (type) {
            Constants.LOADER_BY_DEFAULT_TYPE -> {
               val inflate = CycleDefaultCardLayoutBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
                holder = CycleDefaultViewHolder(inflate)
            }
        }
         return holder!!
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CycleDefaultViewHolder, position: Int) {
        holder.bind(list[position])
    }
}