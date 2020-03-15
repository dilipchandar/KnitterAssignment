package com.example.knitterassignment.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.knitterassignment.R;

public class MainActivity extends AppCompatActivity {

    EditText editText_from;
    EditText editText_to;
    Button btn_fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_from = findViewById(R.id.editTextFromPage);
        editText_to = findViewById(R.id.editTextToPage);
        btn_fetch = findViewById(R.id.btnFetch);

        btn_fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FetchResultsActivity.class);
                i.putExtra("FromPage", editText_from.getText().toString());
                i.putExtra("ToPage", editText_to.getText().toString());
                startActivity(i);
            }
        });
    }
}
