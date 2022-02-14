package com.ideasoft.lovecalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name1;
    EditText name2;
    TextView textView;
    Button cal;
    FinalCal finalCal = new FinalCal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.txt_name1);
        name2 = findViewById(R.id.txt_name2);
        textView = findViewById(R.id.textView);
        cal = findViewById(R.id.btn_cal);

        cal.setOnClickListener(v -> {
            String str1 = name1.getText().toString().toLowerCase();
            String str2 = name2.getText().toString().toLowerCase();

            if (str1.isEmpty() && str2.isEmpty()) {
                name1.setError("Enter Your Crush Name");
                name2.setError("Enter Your Name");
            } else {
                textView.setText(finalCal.calculate(str1, str2));
            }

        });

    }
}