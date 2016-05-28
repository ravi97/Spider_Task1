package com.example.ravikiran.spidertask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int number=0;
    TextView numberDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberDisplay=(TextView)findViewById(R.id.textView);

        if(savedInstanceState!=null){
            number=savedInstanceState.getInt("number");
        }
    }

    public void increment(View view)
    {
      number++;
      numberDisplay.setText(String.valueOf(number));
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("number",number);
    }
}
