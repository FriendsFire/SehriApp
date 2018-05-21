package com.example.abusmzakaria.sehriapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView todaytime,iftarTime,sehriTime,ctime;
    String todayDate;
    TimeTable catchTime;
    List<TimeTable> times = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todaytime = findViewById(R.id.todaytime);
        sehriTime = findViewById(R.id.sehriTime);
        iftarTime = findViewById(R.id.iftarTime);
        ctime = findViewById(R.id.ctime);

        long currentTime = Calendar.getInstance().getTimeInMillis();
        Date date = new Date(currentTime);

        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd");
        SimpleDateFormat format2 = new SimpleDateFormat("hh:mm a");

        SimpleDateFormat format3 = new SimpleDateFormat("MMMdd");
        todayDate = format3.format(date);

        todaytime.setText(format.format(date));
        ctime.setText(format2.format(date));

        times = DatabaseTimes.getTimes();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent myIntent = new Intent(MainActivity.this, AlarmReceiver.class);
        PendingIntent  pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent, 0);

            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);


        if(times.size()>0){

            for (TimeTable table : times){
                if(table.getDate().equals(todayDate)){
                    catchTime = table;
                    break;
                }
            }

            if(catchTime==null){
                sehriTime.setText("Game Over");
                iftarTime.setText("Game Over");
            }else{
                sehriTime.setText(catchTime.getSehri()+" am");
                iftarTime.setText(catchTime.getIftar() + " pm");
            }

        }else {
            sehriTime.setText("Game Over");
            iftarTime.setText("Game Over");
        }

    }
}
