package com.example.android.imagescales;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView imageView ;
    Button scaleTypeCenter, scaleTypeCenterCrop, scaleTypeCenterInside, scaleTypeFitCenter, scaleTypeFitEnd,
            scaleTypeFitStart, scaleTypeFitXY, scaleTypeMatrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView = (ImageView)findViewById(R.id.imageView);

       scaleTypeCenter = (Button) findViewById(R.id.scaleTypeCenter);
       scaleTypeCenter.setOnClickListener( this);

        scaleTypeCenterCrop = (Button)findViewById(R.id.scaleTypeCenterCrop);
        scaleTypeCenterCrop.setOnClickListener(this);

        scaleTypeCenterInside = (Button)findViewById(R.id.scaleTypeCenterInside);
        scaleTypeCenterInside.setOnClickListener(this);

        scaleTypeFitCenter = (Button)findViewById(R.id.scaleTypeFitCenter);
        scaleTypeFitCenter.setOnClickListener(this);

        scaleTypeFitEnd = (Button)findViewById(R.id.scaleTypeFitEnd);
        scaleTypeFitEnd.setOnClickListener(this);

        scaleTypeFitStart = (Button)findViewById(R.id.scaleTypeFitStart);
        scaleTypeFitStart.setOnClickListener(this);

        scaleTypeFitXY = (Button)findViewById(R.id.scaleTypeFitXY);
        scaleTypeFitXY.setOnClickListener(this);

        scaleTypeMatrix = (Button)findViewById(R.id.scaleTypeMatrix);
        scaleTypeMatrix.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);


    }
}
