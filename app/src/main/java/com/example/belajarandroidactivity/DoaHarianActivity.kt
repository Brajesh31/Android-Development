package com.example.belajarandroidactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Doa.DoaAdapter
import com.example.adapter.DoaHarianAdapter
import com.example.model.DoaHarian
import com.example.myapplication.R

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi"),
            DoaHarian("Doa sebelum makan", "اَلْحَمْدُ لِلّٰهِ الَّذِي عَافَانِي فِي جَسَدِي وَرَدَّ عَلَيَّ رُوْحِيْ وَأَذِنَ لِيْ بِذِكْرِه", "Alhamdulillahilladzi \\'aafaani fii jasadi warodda ilaiya ruuhi wa adzinaa lii bidzikrihi")
        )
        val adapter = DoaHarianAdapter(data)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}