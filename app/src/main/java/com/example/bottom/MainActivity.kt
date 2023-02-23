package com.example.bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottom.databinding.ActivityMainBinding
import com.example.bottom.databinding.DemoBinding
import com.example.bottomsheet.BottomSheetFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var binding2:DemoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding2 = DemoBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            val bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.setTitle("<p>Lorem ipsum dolor sit amet. Et ratione magni rem maxime quasi est provident repellendus quo animi nemo est beatae esse. Ea molestiae cupiditate ea nulla iusto eos commodi amet et sunt neque quo quisquam impedit rem dolorem dolor. Non adipisci dignissimos sed sunt excepturi et magnam voluptatum! Qui asperiores fugiat non iure praesentium et ratione libero est ipsam consectetur qui nostrum commodi! </p><p>Non rerum maiores ut voluptas consequatur est suscipit Quis a minima optio? Quo sint Quis ut dolorum perferendis vel architecto quaerat id numquam quia quo dicta commodi ea debitis fugit cum voluptas quia. Aut consequuntur quia et eligendi saepe et accusantium recusandae aut eius officia ab autem veritatis ut internos doloribus et pariatur molestiae. Ut pariatur commodi aut dignissimos nihil et ullam dolor. </p><p>Sit assumenda doloribus ea sapiente voluptatibus eos vero similique hic quia consequatur est doloremque reprehenderit. Est autem nihil id quisquam omnis est voluptatem doloribus quo cumque aspernatur qui quis fugit hic fugiat ipsam ut debitis quas! </p>\n")
            bottomSheetFragment.show(supportFragmentManager, "BottomSheet")
        }

        setContentView(binding.root)
    }
}