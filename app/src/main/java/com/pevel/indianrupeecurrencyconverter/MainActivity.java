package com.pevel.indianrupeecurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void usdollar(View view) {
        Log.i("Status:", "Button Pressed");
        if(findViewById(R.id.editText3)==null)
        {
            Toast.makeText(this,"Please Input Something!",Toast.LENGTH_SHORT).show();
        }
        else{
        EditText editText = (EditText)findViewById(R.id.editText3);
        String amountinrupee=editText.getText().toString();


            double amountconvert = Double.parseDouble(amountinrupee) * 0.013;
            String amount = String.format("%.3f", amountconvert);
            Toast.makeText(this, "₹" + amountinrupee + " is " + amount + "$", Toast.LENGTH_LONG).show();
        }
    }

    public void euro(View view) {
        Log.i("Status:", "Button Pressed");
        EditText editText = (EditText)findViewById(R.id.editText3);
        String amountinrupee=editText.getText().toString();
        double amountconvert=Double.parseDouble(amountinrupee)*0.012;
        String amount=String.format("%.3f",amountconvert);
        Toast.makeText(this,"₹"+amountinrupee+" is "+amount+"€",Toast.LENGTH_LONG).show();
    }

    public void ausdollar(View view) {
        Log.i("Status:", "Button Pressed");
        EditText editText = (EditText)findViewById(R.id.editText3);
        String amountinrupee=editText.getText().toString();
        double amountconvert=Double.parseDouble(amountinrupee)*0.020;
        String amount=String.format("%.3f",amountconvert);
        Toast.makeText(this,"₹"+amountinrupee+" is "+amount+"$",Toast.LENGTH_LONG).show();
    }

    public void yen(View view) {
        Log.i("Status:", "Button Pressed");
        EditText editText = (EditText)findViewById(R.id.editText3);
        String amountinrupee=editText.getText().toString();
        double amountconvert=Double.parseDouble(amountinrupee)*1.43;
        String amount=String.format("%.3f",amountconvert);
        Toast.makeText(this,"₹"+amountinrupee+" is "+amount+"¥",Toast.LENGTH_LONG).show();
    }

    public void pound(View view) {
        Log.i("Status:", "Button Pressed");
        EditText editText = (EditText)findViewById(R.id.editText3);
        String amountinrupee=editText.getText().toString();
        double amountconvert=Double.parseDouble(amountinrupee)*0.011;
        String amount=String.format("%.3f",amountconvert);
        Toast.makeText(this,"₹"+amountinrupee+" is "+amount+"£",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
