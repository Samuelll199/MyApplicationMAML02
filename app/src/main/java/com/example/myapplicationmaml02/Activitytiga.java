package com.example.myapplicationmaml02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activitytiga extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView tv1 = findViewById(R.id.textView4);
        Button bt1 = findViewById(R.id.button8);
        Button bt2 = findViewById(R.id.button9);
        Button bt3 = findViewById(R.id.button10);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(Activitytiga.this, Activity_satu.class);
                startActivity(pindah1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(Activitytiga.this, Activitydua.class);
                startActivity(pindah2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activitytiga.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish(); // Optional: menutup Activity_tiga agar tidak tetap ada di tumpukan aktivitas
            }
        });
    }

}
