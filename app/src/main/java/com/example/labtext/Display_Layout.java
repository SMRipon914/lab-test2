package com.example.labtext;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Display_Layout extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    EditText title,discription;
    Button save;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__layout);
        title=findViewById(R.id.title);
        discription=findViewById(R.id.discription);
        save=findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMethod();
                Toast.makeText(getApplicationContext(),"your information is saved",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
    public void saveMethod() {
        String value1 = title.getText().toString();
        String value2 = title.getText().toString();
        sharedPreferences = getSharedPreferences("spName", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("title", value1);
        editor.putString("dis", value2);
        //editor.apply();
        editor.commit();
        title.setText("");
        discription.setText("");
    }


}
