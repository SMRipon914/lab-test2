package com.example.labtext;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5;
    EditText title,discription;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.title);
        discription=findViewById(R.id.discription);
        sharedPreferences=getSharedPreferences("spName",MODE_PRIVATE);
        loadMethod();


        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button1){
            Intent intent=new Intent(getApplicationContext(),Display_Layout.class);
            startActivity(intent);

        } else if (v.getId()==R.id.button2){
            Intent intent=new Intent(getApplicationContext(),Display_Layout.class);
            startActivity(intent);

        } else if (v.getId()==R.id.button3){
            Intent intent=new Intent(getApplicationContext(),Display_Layout.class);
            startActivity(intent);

        } else if (v.getId()==R.id.button4){
            Intent intent=new Intent(getApplicationContext(),Display_Layout.class);
            startActivity(intent);

        } else if (v.getId()==R.id.button5){
            Intent intent=new Intent(getApplicationContext(),Display_Layout.class);
            startActivity(intent);

        }
    }

    public void loadMethod(){

        if (sharedPreferences.contains("title") && sharedPreferences.contains("dis")) {
            String data1 = sharedPreferences.getString("title", null);
            String data2 = sharedPreferences.getString("dis", null);
            title.setText(data1);
            discription.setText(data2);

        }

    }
}
