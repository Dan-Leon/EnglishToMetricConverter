package com.example.android.firstapp.englishtometricconverterdanl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double enteredMeasurement;
    double convertedMeasure;
    double inToCm = 2.5;
    double miToKm = 1.6;
    double sqFtToSqMe = 0.09;
    double ozToGm = 28.0;
    double lbToKg = 0.45;
    double tspToMl = 5.0;
    double tbsToMl = 15.0;
    double flOzToMl = 30.0;
    double qrtToLi = 0.96;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton inToCenti = (RadioButton)findViewById(R.id.radInchToCm);
        final RadioButton miToKilo = (RadioButton)findViewById(R.id.radMiToKiloM);
        final RadioButton sqFtToSqMet = (RadioButton)findViewById(R.id.radSqFtToSqMeter);
        final RadioButton ozToGra = (RadioButton)findViewById(R.id.radOzToGrams);
        final RadioButton lbToKil = (RadioButton)findViewById(R.id.radLbToKiloG);
        final RadioButton tspToMili = (RadioButton)findViewById(R.id.radTspToMl);
        final RadioButton tbsToMili = (RadioButton)findViewById(R.id.radTbsToMl);
        final RadioButton flOzToMili = (RadioButton)findViewById(R.id.radFlOzToMl);
        final RadioButton qrtToLit = (RadioButton)findViewById(R.id.radQrtToLiter);
        final RadioButton fahToCels = (RadioButton)findViewById(R.id.radFahToCel);
        final EditText measurementInput = (EditText)findViewById(R.id.txtMeasureInput);
        final TextView result = (TextView)findViewById(R.id.txtResult);
        Button convert = (Button)findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredMeasurement=Double.parseDouble(measurementInput.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");
                if(inToCenti.isChecked()){
                    convertedMeasure = enteredMeasurement * inToCm;
                    result.setText(tenth.format(convertedMeasure) + " centimeters");
                }
                if(miToKilo.isChecked()){
                    convertedMeasure = enteredMeasurement * miToKm;
                    result.setText(tenth.format(convertedMeasure) + " kilometers");
                }
                if(sqFtToSqMet.isChecked()) {
                    convertedMeasure = enteredMeasurement * sqFtToSqMe;
                    result.setText(tenth.format(convertedMeasure) + " square meters");
                }
                if(ozToGra.isChecked()) {
                    convertedMeasure = enteredMeasurement * ozToGm;
                    result.setText(tenth.format(convertedMeasure) + " grams");
                }
                if(lbToKil.isChecked()) {
                    convertedMeasure = enteredMeasurement * lbToKg;
                    result.setText(tenth.format(convertedMeasure) + " kilograms");
                }
                if(tspToMili.isChecked()) {
                    convertedMeasure = enteredMeasurement * tspToMl;
                    result.setText(tenth.format(convertedMeasure) + " milliliters");
                }
                if(tbsToMili.isChecked()) {
                    convertedMeasure = enteredMeasurement * tbsToMl;
                    result.setText(tenth.format(convertedMeasure) + " milliliters ");
                }
                if(flOzToMili.isChecked()) {
                    convertedMeasure = enteredMeasurement * flOzToMl;
                    result.setText(tenth.format(convertedMeasure) + " milliliters");
                }
                if(qrtToLit.isChecked()) {
                    convertedMeasure = enteredMeasurement * qrtToLi;
                    result.setText(tenth.format(convertedMeasure) + " liters");
                }
                if(fahToCels.isChecked()) {
                    convertedMeasure = (enteredMeasurement - 32) * 5/9 ;
                    result.setText(tenth.format(convertedMeasure) + " Celsius");
                } else {
                    Toast.makeText(MainActivity.this,"Something has gone wrong", Toast.LENGTH_LONG);
                }
            }
        });

    }
}
