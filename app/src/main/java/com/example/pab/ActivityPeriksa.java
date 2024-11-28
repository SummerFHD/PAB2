package com.example.pab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPeriksa extends AppCompatActivity {

    private TextView tvStatus;
    private Button btnSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periksa);

        tvStatus = findViewById(R.id.tvStatus);
        btnSelesai = findViewById(R.id.btnSelesai);

        Intent intent = getIntent();
        String userId = intent.getStringExtra("USER_ID");
        String password = intent.getStringExtra("PASSWORD");

        String correctUserId = "admin";
        String correctPassword = "1234";

        if (userId.equals(correctUserId)) {
            if (password.equals(correctPassword)) {
                tvStatus.setText("Login Berhasil");
            } else {
                tvStatus.setText("Password Salah");
            }
        } else {
            tvStatus.setText("User Id Salah");
        }

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
