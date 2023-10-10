package com.example.profilecap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.profilecap.databinding.ActivityToReceiveBinding;

public class ToReceiveActivity extends AppCompatActivity {
    private ActivityToReceiveBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityToReceiveBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ToReceiveActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}