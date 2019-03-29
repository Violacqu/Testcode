package com.example.testcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showchart(View view){
        final EditText editText = findViewById(R.id.edit);
        editText.getText();
        Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this,Activity2.class);
//        startActivity(intent);
//        MainActivity.this.finish();
    }
}
