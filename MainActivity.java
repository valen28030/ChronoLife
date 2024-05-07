package com.example.ejercicio20;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView text_respuesta, text_fecha_seleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.text_respuesta);
        text_fecha_seleccionada = findViewById(R.id.text_fecha_seleccionada);

        // Mostrar el calendario automáticamente
        showDatePicker();
    }

    @SuppressLint("SetTextI18n")
    private void showDatePicker() {
        DatePicker datePicker = findViewById(R.id.datePicker);
        datePicker.init(
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                (view, year, month, dayOfMonth) -> {
                    // Obtener la fecha seleccionada
                    String fechaSeleccionada = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year);
                    // Actualizar el texto de la fecha seleccionada
                    text_fecha_seleccionada.setText("Fecha Seleccionada: " + fechaSeleccionada);
                    // Calcular automáticamente los días vividos
                    calcularDias(fechaSeleccionada);
                });
    }

    @SuppressLint("SetTextI18n")
    private void calcularDias(String fechaSeleccionada) {
        // Convertir la fecha seleccionada a un objeto Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar fechaSeleccionadaCal = Calendar.getInstance();
        try {
            fechaSeleccionadaCal.setTime(Objects.requireNonNull(sdf.parse(fechaSeleccionada)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Obtener la fecha actual
        Calendar fechaActualCal = Calendar.getInstance();

        // Calcular la diferencia en días entre la fecha actual y la fecha seleccionada
        long diferenciaEnMilisegundos = fechaActualCal.getTimeInMillis() - fechaSeleccionadaCal.getTimeInMillis();
        long diferenciaEnDias = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);

        // Mostrar la respuesta en el TextView
        text_respuesta.setText("Días vividos: " + diferenciaEnDias);
    }
}
