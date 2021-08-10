package com.example.emailingappudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView msg;
    Button sendBtn;
    EditText body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.hello);
        sendBtn = findViewById(R.id.sendBtn);
        body = findViewById(R.id.body);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_SUBJECT, msg.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, body.getText().toString());
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rowayda.sayad@lau.edu"});
                startActivity(intent);
            }
        });
        
    }
}