import android.content.Context
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.google.gson.Gson
import com.ilya.nordmap.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Date
import java.util.Locale



@RequiresApi(Build.VERSION_CODES.O)
fun showAddMarkerDialog(
    latLng: LatLng,
    context: Context,
    uid_main: String,
    activity: FragmentActivity // добавлен параметр
) {

   // val addmarker = Map_Activity()

    // Раздуйте макет диалога
    val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_add_marker, null)
    var access = false // Переменная для хранения состояния Switch
    // Найдите элементы внутри макета диалога
    val selectDateButton_start = dialogView.findViewById<Button>(R.id.selectDateButtonstart)
    val selectDateButton_end = dialogView.findViewById<Button>(R.id.selectDateButtonend)
    val selectTimeButtonstart = dialogView.findViewById<Button>(R.id.selectTimeButton_start)
    val selectTimeButtonend = dialogView.findViewById<Button>(R.id.selectTimeButton_end)
    val editName = dialogView.findViewById<EditText>(R.id.editname)
    val editobout = dialogView.findViewById<EditText>(R.id.editobout)
    val seekBar = dialogView.findViewById<SeekBar>(R.id.seekBar)
    val textView = dialogView.findViewById<TextView>(R.id.textView)
    val publicSwitch = dialogView.findViewById<Switch>(R.id.switch2) // Найдите ваш Switch
    var selectedDate_start: String? = null
    var selectedDate_end: String? = null
    var selectedTime: Pair<Int, Int>? = null
    var startTime: String? = null
    var endTime: String? = null
    publicSwitch.text = if (!access) "Публичная метка" else "Приватная метка"
    publicSwitch.setOnCheckedChangeListener { _, isChecked ->
        access = isChecked
        publicSwitch.text = if (!access) "Публичная метка" else "Приватная метка"
    }

    selectDateButton_start.setOnClickListener {
        val datePicker = MaterialDatePicker.Builder.datePicker()
            .build()

        datePicker.show(activity.supportFragmentManager, "DATE_PICKER")

        datePicker.addOnPositiveButtonClickListener {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            selectedDate_start = dateFormat.format(Date(it))
            selectDateButton_start.text = selectedDate_start
        }
    }

    selectDateButton_end.setOnClickListener {
        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTitleText("Выберите дату")
            .build()

        datePicker.show(activity.supportFragmentManager, "DATE_PICKER")

        datePicker.addOnPositiveButtonClickListener {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            selectedDate_end = dateFormat.format(Date(it))
            selectDateButton_end.text = selectedDate_end
        }
    }

    selectTimeButtonstart.setOnClickListener {
        val is24HourFormat = true
        val timeFormat = if (is24HourFormat) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H

        val timePicker = MaterialTimePicker.Builder()
            .setTimeFormat(timeFormat)
            .setTitleText("Выберите время")
            .build()

        timePicker.show(activity.supportFragmentManager, "TIME_PICKER")

        timePicker.addOnPositiveButtonClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            val formattedTime = String.format("%02d:%02d", hour, minute)
            selectedTime = Pair(hour, minute)
            selectTimeButtonstart.text = formattedTime
            startTime = formattedTime // Сохраняем выбранное время в переменной
        }
    }

    selectTimeButtonend.setOnClickListener {
        val is24HourFormat = true
        val timeFormat = if (is24HourFormat) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H

        val timePicker = MaterialTimePicker.Builder()
            .setTimeFormat(timeFormat)
            .setTitleText("Выберите время")
            .build()

        timePicker.show(activity.supportFragmentManager, "TIME_PICKER")

        timePicker.addOnPositiveButtonClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            val formattedTime = String.format("%02d:%02d", hour, minute)
            selectedTime = Pair(hour, minute)
            selectTimeButtonend.text = formattedTime
            endTime = formattedTime // Сохраняем выбранное время в переменной
        }
    }

    // Создаем диалоговое окно с инфлейтированным макетом
    val builder = AlertDialog.Builder(context)
    builder.setView(dialogView)
        .setPositiveButton("Да") { dialog, _ ->
            // Получаем текст из EditText
            val editText = dialogView.findViewById<EditText>(R.id.editname)
            val markerDescription = editobout.text.toString() // Получаем текст из поля editAbout
            val markerTitle = editText.text.toString()

            if (markerTitle.isNotEmpty()) {
                val participants = seekBar.progress + 1


                    // Теперь создаем MarkerData после получения улицы
                    val markerData = MarkerData(
                        key = "",
                        username ="Ilya",
                        imguser = "Photo",
                        photomark = "photo",
                        street = "",
                        id = generateUID(),
                        lat = latLng.latitude,
                        lon = latLng.longitude,
                        name = markerTitle,
                        whatHappens = markerDescription,
                        startDate = selectedDate_start?.let { LocalDate.parse(it) }.toString(),
                        endDate = selectedDate_end?.let { LocalDate.parse(it) }.toString(),
                        startTime = startTime.toString(),
                        endTime = endTime.toString(),
                        participants = participants,
                        access = access
                    )

                }
            }




    val dialog = builder.create()
    dialog.window?.setBackgroundDrawableResource(R.drawable.rounded_background)
    dialog.show()
}
