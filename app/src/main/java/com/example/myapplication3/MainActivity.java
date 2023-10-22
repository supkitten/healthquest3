package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
CheckBox chk1, chk2,chk3,chk4,chk5,chk6,chk7,chk8,chk9,chk10,chk11,chk12,chk13;

int us;
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
    @SuppressLint("MissingInflatedId")
    public void info(View a)
    {
        chk1 = (CheckBox)findViewById(R.id.checkBox1);
        chk2 = (CheckBox)findViewById(R.id.checkBox2);
        chk3 = (CheckBox)findViewById(R.id.checkBox3);
        chk4 = (CheckBox)findViewById(R.id.checkBox4);
        chk5 = (CheckBox)findViewById(R.id.checkBox5);
        chk6 = (CheckBox)findViewById(R.id.checkBox6);
        chk7 = (CheckBox)findViewById(R.id.checkBox7);
        chk8 = (CheckBox)findViewById(R.id.checkBox8);
        chk9 = (CheckBox)findViewById(R.id.checkBox9);
        chk10 = (CheckBox)findViewById(R.id.checkBox10);
        chk11 = (CheckBox)findViewById(R.id.checkBox11);
        chk12 = (CheckBox)findViewById(R.id.checkBox12);
        chk13 = (CheckBox)findViewById(R.id.checkBox13);

        if (chk1.isChecked())
        {
            us=us+2;
        }
        if (chk2.isChecked())
        {
            us++;
        }
        if (chk3.isChecked())
        {
            us++;
        }
        if (chk4.isChecked())
        {
            us=us+2;
        }
        if (chk5.isChecked())
        {
            us++;
        }
        if (chk6.isChecked())
        {
            us++;
        }
        if (chk7.isChecked())
        {
            us=us+2;
        }
        if (chk8.isChecked())
        {
            us++;
        }
        if (chk9.isChecked())
        {
            us=us+2;
        }
        if (chk10.isChecked())
        {
            us++;
        }
        if (chk11.isChecked())
        {
            us++;
        }
        if (chk12.isChecked())
        {
            us=us+2;
        }
        if (chk13.isChecked())
        {
            us++;
        }
        setContentView(R.layout.info);
        TextView tv1 = (TextView)findViewById(R.id.textView7);
        TextView tv2 = (TextView)findViewById(R.id.textView8);
        tv1.setText("Room: " + (us+1) );
        tv2.setText("Estimated wait time: " +(50-us)+ " mins");
    }
    public void start(View a) {setContentView(R.layout.patord);}
    public void checkbox(View b) {}
    public void doc(View a) { setContentView(R.layout.doctor); }

    public void info1(View a) { setContentView(R.layout.info); }

}