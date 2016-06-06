package com.example.ravikiran.spidertask1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private int number1 = 0;
    private int number2 = 0;
    TextView numberDisplay1;
    TextView numberDisplay2;
    ImageView button1;
    ImageView button2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberDisplay1 = (TextView) findViewById(R.id.textView1);
        numberDisplay2 = (TextView) findViewById(R.id.textView2);

        if (savedInstanceState != null) {
            number1 = savedInstanceState.getInt("number1");
            number2 = savedInstanceState.getInt("number2");
            numberDisplay1.setText(String.valueOf(number1));
            numberDisplay2.setText(String.valueOf(number2));
        }
        longClickListener();

    }

    public void increment1(View view) {
        number1++;
        numberDisplay1.setText(String.valueOf(number1));
    }

    public void increment2(View view) {
        number2++;
        numberDisplay2.setText(String.valueOf(number2));
    }


       public void longClickListener() {
        button1 = (ImageView) findViewById(R.id.imageView1);
        button2 = (ImageView) findViewById(R.id.imageView2);

        button1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                number2++;
                numberDisplay2.setText(String.valueOf(number2));
                return true;
            }
        });

        button2.setOnLongClickListener(new View.OnLongClickListener(){
                                           public boolean onLongClick(View v){
                                               number1++;
                                               numberDisplay1.setText(String.valueOf(number1));
                                               return true;
                                           }
                                       }
        );


    }



    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("number1", number1);
        savedInstanceState.putInt("number2", number2);
    }


}
