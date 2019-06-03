package jp.kyamlab.viewpager2sample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.view.*

class PageFragment : Fragment() {

    private var id: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            id = it.getInt(KEY_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        view.text_view.text = id.toString()

        return view
    }

    companion object {
        private const val KEY_ID = "id"

        fun newInstance(id: Int): PageFragment =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putInt(KEY_ID, id)
                }
            }
    }
}
