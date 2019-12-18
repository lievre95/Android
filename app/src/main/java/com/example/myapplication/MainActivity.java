package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void buttonisClicked(View buttonView) {
        ImageView myImage = findViewById(R.id.img);
        EditText UserNumber = findViewById(R.id.UserNumber);
        int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(UserNumber.getText().toString());
        UserNumber.setText(petAge + "");
    }
//        int result= 5*7;
//        Log.i("OPERATIONAL", result +"");
//        TextView txt = findViewById(R.id.text);
//        Log.i("TEXT", txt.getText().toString());
//        EditText edtText = findViewById(R.id.edtText);
//        Log.i("NAME", edtText.getText().toString());
//        EditText edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
//        Log.i("PHONE", edtPhoneNumber.getText().toString());
//        Toast.makeText(MainActivity.this,"This is TOAST message", Toast.LENGTH_SHORT).show();
//        Toast.makeText(MainActivity.this, "Your name is: "+edtText.getText().toString()+"\n"+
//                "Your phone Number: "+ edtPhoneNumber.getText().toString(), Toast.LENGTH_SHORT).show();
//        ImageView myImage = findViewById(R.id.img);
//        myImage.setImageResource(R.drawable.locomotive);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
