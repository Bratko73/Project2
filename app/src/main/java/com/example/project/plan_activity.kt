package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class planActivity : AppCompatActivity() {
    private lateinit var radioMR : RadioButton
    private lateinit var radioME : RadioButton
    private lateinit var radioMT : RadioButton
    private lateinit var radioML : RadioButton
    private lateinit var radioTUR : RadioButton
    private lateinit var radioTUE : RadioButton
    private lateinit var radioTUT : RadioButton
    private lateinit var radioTUL : RadioButton
    private lateinit var radioWR : RadioButton
    private lateinit var radioWE : RadioButton
    private lateinit var radioWT : RadioButton
    private lateinit var radioWL : RadioButton
    private lateinit var radioTHR : RadioButton
    private lateinit var radioTHE : RadioButton
    private lateinit var radioTHT : RadioButton
    private lateinit var radioTHL : RadioButton
    private lateinit var radioFR : RadioButton
    private lateinit var radioFE : RadioButton
    private lateinit var radioFT : RadioButton
    private lateinit var radioFL : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plan)

        radioMR = findViewById(R.id.radioButtonMondayRestore)
        radioME = findViewById(R.id.radioButtonMondayEasy)
        radioMT = findViewById(R.id.radioButtonMOndayTemp)
        radioML = findViewById(R.id.radioButtonMondayLong)
        radioMR.setOnClickListener{ view: View ->
            radioME.isChecked = false; radioMT.isChecked = false; radioML.isChecked = false
        }
        radioME.setOnClickListener{ view: View ->
            radioMR.isChecked = false; radioMT.isChecked = false; radioML.isChecked = false
        }
        radioMT.setOnClickListener{ view: View ->
            radioME.isChecked = false; radioMR.isChecked = false; radioML.isChecked = false
        }
        radioML.setOnClickListener{ view: View ->
            radioME.isChecked = false; radioMT.isChecked = false; radioMR.isChecked = false
        }
        radioTUR = findViewById(R.id.radioButtonTuesdayRestore)
        radioTUE = findViewById(R.id.radioButtonTuesdayEasy)
        radioTUT = findViewById(R.id.radioButtonTuesdayTemp)
        radioTUL = findViewById(R.id.radioButtonTuesdayLong)
        radioTUR.setOnClickListener{ view: View ->
            radioTUE.isChecked = false; radioTUT.isChecked = false; radioTUL.isChecked = false
        }
        radioTUE.setOnClickListener{ view: View ->
            radioTUR.isChecked = false; radioTUT.isChecked = false; radioTUL.isChecked = false
        }
        radioTUT.setOnClickListener{ view: View ->
            radioTUE.isChecked = false; radioTUR.isChecked = false; radioTUL.isChecked = false
        }
        radioTUL.setOnClickListener{ view: View ->
            radioTUE.isChecked = false; radioTUT.isChecked = false; radioTUR.isChecked = false
        }
        radioWR = findViewById(R.id.radioButtonWednesdayRestore)
        radioWE = findViewById(R.id.radioButtonWednesdayEasy)
        radioWT = findViewById(R.id.radioButtonWednesdayTemp)
        radioWL = findViewById(R.id.radioButtonWednesdayLong)
        radioWR.setOnClickListener{ view: View ->
            radioWE.isChecked = false; radioWT.isChecked = false; radioWL.isChecked = false
        }
        radioWE.setOnClickListener{ view: View ->
            radioWR.isChecked = false; radioWT.isChecked = false; radioWL.isChecked = false
        }
        radioWT.setOnClickListener{ view: View ->
            radioWE.isChecked = false; radioWR.isChecked = false; radioWL.isChecked = false
        }
        radioWL.setOnClickListener{ view: View ->
            radioWE.isChecked = false; radioWT.isChecked = false; radioWR.isChecked = false
        }
        radioTHR = findViewById(R.id.radioButtonThursdayRestore)
        radioTHE = findViewById(R.id.radioButtonThursdayEasy)
        radioTHT = findViewById(R.id.radioButtonThursdayTemp)
        radioTHL = findViewById(R.id.radioButtonThursdayLong)
        radioTHR.setOnClickListener{ view: View ->
            radioTHE.isChecked = false; radioTHT.isChecked = false; radioTHL.isChecked = false
        }
        radioTHE.setOnClickListener{ view: View ->
            radioTHR.isChecked = false; radioTHT.isChecked = false; radioTHL.isChecked = false
        }
        radioTHT.setOnClickListener{ view: View ->
            radioTHE.isChecked = false; radioTHR.isChecked = false; radioTHL.isChecked = false
        }
        radioTHL.setOnClickListener{ view: View ->
            radioTHE.isChecked = false; radioTHT.isChecked = false; radioTHR.isChecked = false
        }
        radioFR = findViewById(R.id.radioButtonFridayRestore)
        radioFE = findViewById(R.id.radioButtonFridayEasy)
        radioFT = findViewById(R.id.radioButtonFridayTemp)
        radioFL = findViewById(R.id.radioButtonFridayLong)
        radioFR.setOnClickListener{ view: View ->
            radioFE.isChecked = false; radioFT.isChecked = false; radioFL.isChecked = false
        }
        radioFE.setOnClickListener{ view: View ->
            radioFR.isChecked = false; radioFT.isChecked = false; radioFL.isChecked = false
        }
        radioFT.setOnClickListener{ view: View ->
            radioFE.isChecked = false; radioFR.isChecked = false; radioFL.isChecked = false
        }
        radioFL.setOnClickListener{ view: View ->
            radioFE.isChecked = false; radioFT.isChecked = false; radioFR.isChecked = false
        }


    }

    fun save(){

    }
}


