package com.jean.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("삶이 있는 한 희망은 있다.")
        sentenceList.add("산다는것 그것은 치열한 전투이다.")
        sentenceList.add("하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다.")
        sentenceList.add("언제나 현재에 집중할수 있다면 행복할것이다.")
        sentenceList.add("진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해 ")
        sentenceList.add("직업에서 행복을 찾아라. 아니면 행복이 무엇인지 절대 모를 것이다.")
        sentenceList.add("신은 용기있는자를 결코 버리지 않는다.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listView = findViewById<ListView>(R.id.sentenceListView)
        listView.adapter = sentenceAdapter

    }
}