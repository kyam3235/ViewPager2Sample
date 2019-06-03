package jp.kyamlab.viewpager2sample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.view.*

class PageFragment : Fragment() {

    private var text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            text = it.getString(KEY_TEXT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        view.text_view.text = text

        return view
    }

    companion object {
        private const val KEY_TEXT = "key-text"

        fun newInstance(text: String): PageFragment =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putString(KEY_TEXT, text)
                }
            }
    }
}
