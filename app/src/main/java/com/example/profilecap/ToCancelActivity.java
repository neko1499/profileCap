package com.example.profilecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.profilecap.databinding.ActivityToCancelBinding;

public class ToCancelActivity extends AppCompatActivity {
    private ActivityToCancelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityToCancelBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ToCancelActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}