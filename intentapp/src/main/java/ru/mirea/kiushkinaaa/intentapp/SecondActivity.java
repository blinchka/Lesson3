package ru.mirea.kiushkinaaa.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView _timeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        _timeText = findViewById(R.id.timeText);


        String text = (String) getIntent().getSerializableExtra("time");

        _timeText.setText("«КВАДРАТ ЗНАЧЕНИЯ\n МОЕГО НОМЕРА\n  ПО СПИСКУ В ГРУППЕ\n СОСТАВЛЯЕТ ЧИСЛО\n  441\n  " + "а текущее время:\n  " + text);


    }
}