package com.example.fects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    HorizontalScrollView toolsLayout;
    ConstraintLayout brightnessSeekBarLayout,contrastSeekBarLayout,filterBtnLayout;
    TextView brightnessBtn,brightnessSeekBarOkView,contrastBtn,contrastSeekBarOkView;
    SeekBar brightnessSeekerBar,contrastSeekerBar;
    BitmapDrawable ogBmp;
    TextView filterBtn,filterBackBtn;
    String filtered;
    Bitmap filteredBmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.photoView);
        ogBmp=(BitmapDrawable) imageView.getDrawable();

        initializeViews();
    }

    private void initializeViews() {

         toolsLayout = findViewById(R.id.toolsLayout);
         brightnessSeekBarLayout= findViewById(R.id.brightnessSeekBarLayout);
         contrastSeekBarLayout=findViewById(R.id.contrastSeekBarLayout);
         filterBtnLayout=findViewById(R.id.filterBtnsLayout);
         brightnessBtn=findViewById(R.id.brightnessBtn);
         brightnessSeekBarOkView=findViewById(R.id.brightnessSeekBarOkView);
         contrastBtn=findViewById(R.id.contrastBtn);
         contrastSeekBarOkView=findViewById(R.id.contrastSeekBarOkView);
         brightnessSeekerBar=findViewById(R.id.brightnessSeekBar);
         contrastSeekerBar=findViewById(R.id.brightnessSeekBar);
         filterBtn= findViewById(R.id.filterBtn);
         filterBackBtn=findViewById(R.id.filterBackBtn);

         //view visibility

        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toolsLayout.setVisibility(View.GONE);
                filterBtnLayout.setVisibility(View.VISIBLE);
            }
        });

        filterBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toolsLayout.setVisibility(View.VISIBLE);
                filterBtnLayout.setVisibility(View.GONE);
            }
        });

        brightnessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brightnessSeekBarLayout.setVisibility(View.VISIBLE);
                toolsLayout.setVisibility(View.GONE);
            }
        });

        contrastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrastSeekBarLayout.setVisibility(View.VISIBLE);
                toolsLayout.setVisibility(View.GONE);
            }
        });

        brightnessSeekBarOkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                brightnessSeekBarLayout.setVisibility(View.GONE);
                toolsLayout.setVisibility(View.VISIBLE);
            }
        });

        contrastSeekBarOkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contrastSeekBarLayout.setVisibility(View.GONE);
                toolsLayout.setVisibility(View.VISIBLE);
            }
        });




    }
}