package com.example.student2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;


    // вложенные классы сделали, далее ими пользуемся
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        editText.setText("666");
        spinner.setOnItemSelectedListener(new Listener());
    }

    class Listener implements AdapterView.OnItemSelectedListener{


        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            String choice = adapterView.getItemAtPosition(i).toString();
            String num = editText.getText().toString();
            String res = Integer.toBinaryString(Integer.parseInt(num));
            switch (choice) {
                case "8":
                    res = Integer.toOctalString(Integer.parseInt(num));
                    break;
                case "16":
                    res = Integer.toHexString(Integer.parseInt(num));
                    break;
            }

            textView.setText(res);

        }

            public void onNothingSelected(AdapterView<?> adapterView) {

        }


        }

    }

