package com.example.firstapp.levels;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapp.databinding.ActivityLevel16Binding;

public class Level16 extends AppCompatActivity {

    private ActivityLevel16Binding binding;
    private boolean answer;

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLevel16Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setCorrect();
    }

    private void setCorrect() {
        binding.button.setOnClickListener(v -> {
            setAnswer(true);
            setResult(RESULT_OK, getIntent().putExtra("Sergan", isAnswer()));
            setResult(RESULT_OK, getIntent().putExtra("Ser", 16));
            binding.button2.setEnabled(false);
            binding.button3.setEnabled(false);
            binding.button.setBackgroundColor(Color.GREEN);
            finish();
        });
        binding.button2.setOnClickListener(v -> {
            setAnswer(false);
            setResult(RESULT_OK, getIntent().putExtra("Sergan", isAnswer()));
            setResult(RESULT_OK, getIntent().putExtra("Ser", 16));
            binding.button.setEnabled(false);
            binding.button3.setEnabled(false);
            binding.button2.setBackgroundColor(Color.RED);
            finish();
        });
        binding.button3.setOnClickListener(v -> {
            setAnswer(false);
            setResult(RESULT_OK, getIntent().putExtra("Sergan", isAnswer()));
            setResult(RESULT_OK, getIntent().putExtra("Ser", 16));
            binding.button.setEnabled(false);
            binding.button2.setEnabled(false);
            binding.button3.setBackgroundColor(Color.RED);
            finish();
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return keyCode == KeyEvent.KEYCODE_BACK;
    }
}