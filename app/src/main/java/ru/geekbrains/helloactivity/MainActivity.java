package ru.geekbrains.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import ru.geekbrains.helloactivity.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.hello_tv);

        String hello_str = getResources().getString(R.string.hello_geekbrains);
        hello_str +="!!!!";

        greeting.setText(hello_str);

    }
}