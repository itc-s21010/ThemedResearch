package jp.ac.it_college.std.s21010.themedresearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import jp.ac.it_college.std.s21010.themedresearch.databinding.ActivityPictorialBookBinding

class PictorialBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPictorialBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPictorialBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuList = listOf(
            mapOf("name" to "から揚げ定食", "price" to "800円"),
            mapOf("name" to "ハンバーグ定食", "price" to "850円"),
            mapOf("name" to "生姜焼き定食", "price" to "850円"),
            mapOf("name" to "ステーキ定食", "price" to "1000円"),
            mapOf("name" to "野菜炒め定食", "price" to "750円"),
            mapOf("name" to "とんかつ定食", "price" to "900円"),
            mapOf("name" to "ミンチかつ定食", "price" to "850円"),
            mapOf("name" to "チキンカツ定食", "price" to "900円"),
            mapOf("name" to "コロッケ定食", "price" to "850円"),
            mapOf("name" to "回鍋肉定食", "price" to "750円"),
            mapOf("name" to "麻婆豆腐定食", "price" to "800円"),
            mapOf("name" to "青椒肉絲定食", "price" to "900円"),
            mapOf("name" to "焼き魚定食", "price" to "850円"),
            mapOf("name" to "焼肉定食", "price" to "950円"),
        )
        val list = findViewById<ListView>(R.id.lvmenu)
        list.adapter = SimpleAdapter(
            this,
            menuList,
            android.R.layout.simple_list_item_2,
            arrayOf("name", "price"),
            intArrayOf(android.R.id.text1, android.R.id.text2)
        )
    }
}