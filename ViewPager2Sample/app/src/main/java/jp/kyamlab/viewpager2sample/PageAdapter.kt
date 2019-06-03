package jp.kyamlab.viewpager2sample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {
    private val items = listOf(1, 2)

    override fun getItem(position: Int): Fragment {
        return PageFragment.newInstance(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}