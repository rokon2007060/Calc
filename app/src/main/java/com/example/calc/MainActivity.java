package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private TextView resultTextView;
    private Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultTextView = findViewById(R.id.result);
        addButton = findViewById(R.id.add);
        
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                String num1Str = num1.getText().toString().trim();
                String num2Str = num2.getText().toString().trim();

                
                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    
                    int sum = num1 + num2;
                    
                    resultTextView.setText(String.valueOf(sum));
                } else {
                    resultTextView.setText("Please enter both numbers");
                }
            }
        });
    }
}