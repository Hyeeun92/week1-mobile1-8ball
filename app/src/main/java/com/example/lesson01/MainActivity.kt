package com.example.lesson01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var predictionList = arrayListOf(

            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Tes - definitely"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Log.i("PREDICTION", predictionList[0])
        //Log.i("PREDICTION", predictionList[1])
        //Log.i("PREDICTION", predictionList[2])
        //Log.i("PREDICTION", predictionList[3])
        Log.i("PREDICTION", "Build 004")

        val countPredictions = "there are ${predictionList.count()} prediction available"
        Log.i("PREDICTION", countPredictions)

        Log.i("PREDICTION", getPrediction())
        Log.i("PREDICTION",getPredictionByIndex(1))
        Log.i("PREDICTION", getRandomPrediction())
        Log.i("PREDICTION", getRandomPrediction())
        Log.i("PREDICTION", getRandomPrediction())

        val btnPrediction : Button = findViewById(R.id.button)
        btnPrediction.setOnClickListener{generateRandomPrediction()}
    }

    fun getPrediction(): String {
        return predictionList[2]

    }

    fun getPredictionByIndex(index:Int): String {
        return predictionList[index]
    }

    fun getRandomPrediction(): String {
        val predictionIndex = Random.nextInt(predictionList.count())

        val selectedPrediction = predictionList[predictionIndex]

        return selectedPrediction
    }

    fun generateRandomPrediction() {

        val messageTextView: TextView = findViewById(R.id.textViewMessage)
        Log.i("PREDICTION",messageTextView.text.toString())
        messageTextView.text = getRandomPrediction()

    }
}