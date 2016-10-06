package com.sridevi.speakapplication.Activities;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sridevi.speakapplication.R;
import com.sridevi.speakapplication.Models.Data;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public Button b1;
    public Button b2;
    TextToSpeech t1;
    public Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        data = new Data();

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.US);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,ListNames.class);
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tospeak[] = data.getDays();
                String days = Arrays.toString(tospeak);//
                Log.i("array", Arrays.toString(tospeak));
                days = days.substring(1, days.length()-1);
                Log.i("array", days);

                t1.speak(days,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

    }
}
