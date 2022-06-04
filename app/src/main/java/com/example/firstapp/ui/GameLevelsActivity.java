package com.example.firstapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapp.databinding.ActivityGameLevelsBinding;
import com.example.firstapp.levels.Level1;
import com.example.firstapp.levels.Level10;
import com.example.firstapp.levels.Level11;
import com.example.firstapp.levels.Level12;
import com.example.firstapp.levels.Level13;
import com.example.firstapp.levels.Level14;
import com.example.firstapp.levels.Level15;
import com.example.firstapp.levels.Level16;
import com.example.firstapp.levels.Level17;
import com.example.firstapp.levels.Level18;
import com.example.firstapp.levels.Level19;
import com.example.firstapp.levels.Level2;
import com.example.firstapp.levels.Level20;
import com.example.firstapp.levels.Level21;
import com.example.firstapp.levels.Level22;
import com.example.firstapp.levels.Level23;
import com.example.firstapp.levels.Level24;
import com.example.firstapp.levels.Level25;
import com.example.firstapp.levels.Level26;
import com.example.firstapp.levels.Level27;
import com.example.firstapp.levels.Level28;
import com.example.firstapp.levels.Level29;
import com.example.firstapp.levels.Level3;
import com.example.firstapp.levels.Level30;
import com.example.firstapp.levels.Level4;
import com.example.firstapp.levels.Level5;
import com.example.firstapp.levels.Level6;
import com.example.firstapp.levels.Level7;
import com.example.firstapp.levels.Level8;
import com.example.firstapp.levels.Level9;

public class GameLevelsActivity extends AppCompatActivity {

    private ActivityGameLevelsBinding binding;
    private ActivityResultLauncher<Intent> activityResultLauncher;
    private Intent intent = new Intent();
    private boolean data;

    private int data2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameLevelsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initLauncher();
        initListener();
    }

    private void initListener() {
        binding.buttonBack.setOnClickListener(v -> finish());
        binding.textView1.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level1.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView2.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level2.class);
            activityResultLauncher.launch(intent);
        });

        binding.textView3.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level3.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView4.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level4.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView5.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level5.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView6.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level6.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView7.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level7.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView8.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level8.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView9.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level9.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView10.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level10.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView11.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level11.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView12.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level12.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView13.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level13.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView14.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level14.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView15.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level15.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView16.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level16.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView17.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level17.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView18.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level18.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView19.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level19.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView20.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level20.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView21.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level21.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView22.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level22.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView23.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level23.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView24.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level24.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView25.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level25.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView26.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level26.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView27.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level27.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView28.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level28.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView29.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level29.class);
            activityResultLauncher.launch(intent);
        });
        binding.textView30.setOnClickListener(v -> {
            intent = new Intent(GameLevelsActivity.this, Level30.class);
            activityResultLauncher.launch(intent);
        });
    }


    private void initLauncher() {
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == Activity.RESULT_OK) {
                assert result.getData() != null;
                data = result.getData().getBooleanExtra("Sergan", false);
                data2 = result.getData().getIntExtra("Ser", 0);
                switch (data2) {
                    case 1:
                        if (data)
                            binding.textView1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView1.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 2:
                        if (data)
                            binding.textView2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView2.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 3:
                        if (data)
                            binding.textView3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView3.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 4:
                        if (data)
                            binding.textView4.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView4.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 5:
                        if (data)
                            binding.textView5.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView5.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 6:
                        if (data)
                            binding.textView6.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView6.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 7:
                        if (data)
                            binding.textView7.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView7.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 8:
                        if (data)
                            binding.textView8.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView8.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 9:
                        if (data)
                            binding.textView9.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView9.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 10:
                        if (data)
                            binding.textView10.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView10.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 11:
                        if (data)
                            binding.textView11.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView11.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 12:
                        if (data)
                            binding.textView12.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView12.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 13:
                        if (data)
                            binding.textView13.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView13.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 14:
                        if (data)
                            binding.textView14.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView14.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 15:
                        if (data)
                            binding.textView15.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView15.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 16:
                        if (data)
                            binding.textView16.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView16.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 17:
                        if (data)
                            binding.textView17.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView17.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 18:
                        if (data)
                            binding.textView18.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView18.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 19:
                        if (data)
                            binding.textView19.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView19.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 20:
                        if (data)
                            binding.textView20.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView20.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 21:
                        if (data)
                            binding.textView21.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView21.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 22:
                        if (data)
                            binding.textView22.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView22.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 23:
                        if (data)
                            binding.textView23.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView23.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 24:
                        if (data)
                            binding.textView24.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView24.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 25:
                        if (data)
                            binding.textView25.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView25.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 26:
                        if (data)
                            binding.textView26.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView26.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 27:
                        if (data)
                            binding.textView27.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView27.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 28:
                        if (data)
                            binding.textView28.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView28.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 29:
                        if (data)
                            binding.textView29.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView29.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                    case 30:
                        if (data)
                            binding.textView30.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                        else
                            binding.textView30.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        break;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        try {
            finish();
        } catch (Exception ignored) {

        }
    }
}