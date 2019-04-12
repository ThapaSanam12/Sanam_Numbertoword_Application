package com.sanam_numbertoword_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText etnumber;
    TextView tvwords;
    Button btnconvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnumber= findViewById(R.id.etnumber);
        tvwords= findViewById(R.id.tvwords);
        btnconvert= findViewById(R.id.btnconvert);


        btnconvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                int num;
                if(TextUtils.isEmpty(etnumber.getText().toString())){
                    etnumber.setText("Please enter a number.");
                    return;
                }
                num= Integer.parseInt(etnumber.getText().toString());

                Convert converts= new Convert(num);
                tvwords.setText(converts.Words());

            }
        });
    }
}
