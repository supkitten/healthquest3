package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enable(View a) {setContentView(R.layout.patord);}
    public void patient(View a)
    {
        setContentView(R.layout.patientpage1);
    }
    public void map(View a)
    {
        setContentView(R.layout.map);
    }
    public void info(View a)
    {
        setContentView(R.layout.info);
        TextView tv1 = (TextView)findViewById(R.id.textView7);
        TextView tv2 = (TextView)findViewById(R.id.textView8);
        tv1.setText("Room: " );
        tv2.setText("Estemated wait time: " +50);
    }
    public void start(View a) {setContentView(R.layout.patord);}
    public void checkbox(View b) {}
    public void doc(View a) { setContentView(R.layout.doctor); }

}