package id.ac.polbeng.ardianto.kalkulatoruts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ardianto.kalkulatoruts.databinding.ActivityMainBinding
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            val radius = binding.etRadius.text.toString().toDoubleOrNull()
            val height = binding.etHeight.text.toString().toDoubleOrNull()

            if (radius != null && height != null) {
                val volume = PI * radius * radius * height
                binding.tvResult.text = getString(R.string.result_volume) + "%.2f".format(volume)
            } else {
                binding.tvResult.text = getString(R.string.error_invalid_input)
            }
        }

        binding.btnCalculateArea.setOnClickListener {
            val radius = binding.etRadius.text.toString().toDoubleOrNull()

            if (radius != null) {
                val area = PI * radius * radius
                binding.tvResult.text = getString(R.string.result_area) + "%.2f".format(area)
            } else {
                binding.tvResult.text = getString(R.string.error_invalid_input)
            }
        }
    }
}
