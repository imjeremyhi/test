package com.example.digitalclockapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getCurrentTime(View view) {


        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String sydTime = String.format("%02d" , hour)+":"+
                String.format("%02d" , minute)+ ":"+ String.format("%02d" , second);
        display(sydTime);



        Calendar nyTime = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
        nyTime.setTimeInMillis(calendar.getTimeInMillis());
        hour = nyTime.get(Calendar.HOUR);
        minute = nyTime.get(Calendar.MINUTE);
        second = nyTime.get(Calendar.SECOND);
        String newYorkTime = String.format("%02d" , hour)+":"+
                String.format("%02d" , minute)+ ":"+ String.format("%02d" , second);
        displayNewYork(newYorkTime);

        Calendar tyTime = new GregorianCalendar(TimeZone.getTimeZone("Asia/Tokyo"));
        tyTime.setTimeInMillis(calendar.getTimeInMillis());
        hour = tyTime.get(Calendar.HOUR);
        minute = tyTime.get(Calendar.MINUTE);
        second = tyTime.get(Calendar.SECOND);
        String theTokyoTime = String.format("%02d" , hour)+":"+
                String.format("%02d" , minute)+ ":"+ String.format("%02d" , second);
        displayTokyo(theTokyoTime);

        Calendar dubTime = new GregorianCalendar(TimeZone.getTimeZone("Asia/Dubai"));
        dubTime.setTimeInMillis(calendar.getTimeInMillis());
        hour = dubTime.get(Calendar.HOUR);
        minute = dubTime.get(Calendar.MINUTE);
        second = dubTime.get(Calendar.SECOND);
        String theDubaiTime = String.format("%02d" , hour)+":"+
                String.format("%02d" , minute)+ ":"+ String.format("%02d" , second);
        displayDubai(theDubaiTime);

        Calendar melbTime = new GregorianCalendar(TimeZone.getTimeZone("Australia/Melbourne"));
        melbTime.setTimeInMillis(calendar.getTimeInMillis());
        hour = melbTime.get(Calendar.HOUR);
        minute = melbTime.get(Calendar.MINUTE);
        second = melbTime.get(Calendar.SECOND);
        String theMelbourneTime = String.format("%02d" , hour)+":"+
                String.format("%02d" , minute)+ ":"+ String.format("%02d" , second);
        displayMelbourne(theMelbourneTime);
    }

    public void time12hr(View view){
        DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        String formattedDate = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String formattedDateNy = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String formattedDateTok = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));
        String formattedDateDub = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Melbourne"));
        String formattedDateMelb = dateFormat.format(new Date()).toString();
        display(formattedDate);
        displayNewYork(formattedDateNy);
        displayTokyo(formattedDateTok);
        displayDubai(formattedDateDub);
        displayMelbourne(formattedDateMelb);

    }

    public void time24hr(View view){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String formattedDate = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String formattedDateNy = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String formattedDateTok = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));
        String formattedDateDub = dateFormat.format(new Date()).toString();
        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Melbourne"));
        String formattedDateMelb = dateFormat.format(new Date()).toString();
        display(formattedDate);
        displayNewYork(formattedDateNy);
        displayTokyo(formattedDateTok);
        displayDubai(formattedDateDub);
        displayMelbourne(formattedDateMelb);
    }

    private void display(String num) {
        TextView textView = (TextView) findViewById(R.id.sydneyTime);
        textView.setText(num);
    }

    private void displayNewYork(String num) {
        TextView textView = (TextView) findViewById(R.id.newYorkTime);
        textView.setText(num);
    }

    private void displayTokyo(String num) {
        TextView textView = (TextView) findViewById(R.id.tokyoTime);
        textView.setText(num);
    }

    private void displayDubai(String num) {
        TextView textView = (TextView) findViewById(R.id.dubaiTime);
        textView.setText(num);
    }

    private void displayMelbourne(String num) {
        TextView textView = (TextView) findViewById(R.id.melbourneTime);
        textView.setText(num);
    }
}
