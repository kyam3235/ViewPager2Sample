package jp.kyamlab.viewpager2sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager.adapter = Adapter(supportFragmentManager, this.lifecycle)
    }

    class Adapter(
        fragmentManager: FragmentManager,
        owner: Lifecycle
    ) : FragmentStateAdapter(fragmentManager, owner) {

        private val items = listOf(1, 2)

        override fun getItem(position: Int): Fragment {
            return PageFragment.newInstance(items[position])
        }

        override fun getItemCount(): Int {
            return items.size
        }
    }
}
