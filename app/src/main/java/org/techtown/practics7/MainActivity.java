package org.techtown.practics7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivityForResult(intent, 101);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == 101)
            Toast.makeText(getApplicationContext(), "고객관리", Toast.LENGTH_LONG).show();
        if(resultCode == 102)
            Toast.makeText(getApplicationContext(), "고객관리", Toast.LENGTH_LONG).show();
        if(resultCode == 103)
            Toast.makeText(getApplicationContext(), "고객관리", Toast.LENGTH_LONG).show();
    }
}