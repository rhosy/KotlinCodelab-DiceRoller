package id.ronggosukowati.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_button.setOnClickListener {
            rollDice()
        }

        countup_button.setOnClickListener {
            countUp()
        }

        reset_button.setOnClickListener {
            reset()
        }

    }

    private fun rollDice(){
        val randomInt = (1..6).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        Toast.makeText(this, "$randomInt", Toast.LENGTH_SHORT).show()
        dice_image.setImageResource(drawableResource)
    }

    private fun countUp(){

        /*if (result_text.text == "Hello World!"){
            result_text.text = "1"
        }else{
            var resultInt = result_text.text.toString().toInt()
            if (resultInt < 6){
                resultInt++
                result_text.text = resultInt.toString()
            }else if (resultInt >= 6){
                Toast.makeText(this, "You have reached maximal number", Toast.LENGTH_SHORT).show()
            }
        }*/
    }

    private fun reset(){
       /* if (result_text.text == "Hello World!"){
            result_text.text = "0"
        }else{
            var resultInt = result_text.text.toString().toInt()
            if (resultInt <= 6){
                resultInt = 0
                result_text.text = resultInt.toString()
            }else if (resultInt <= 0){
                Toast.makeText(this, "You have reached minimum number", Toast.LENGTH_SHORT).show()
            }
        }*/
    }
}