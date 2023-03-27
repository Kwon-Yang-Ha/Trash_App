package com.chobo.trash;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text_more;
    TextView text_find;
    TextView text_free;
    TextView text_tip;
    TextView text_hot;
    TextView text_need;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_more = (TextView) findViewById(R.id.tx_more);
        text_find = (TextView) findViewById(R.id.tx_find);
        text_free = (TextView) findViewById(R.id.tx_free);
        text_hot = (TextView) findViewById(R.id.tx_hot);
        text_tip = (TextView) findViewById(R.id.tx_tip);
        text_need = (TextView) findViewById(R.id.tx_need);


        text_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoardActivity.class);
                startActivity(intent);
            }
        });

        text_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoardActivity.class);
                startActivity(intent);
            }
        });
        text_free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FreeActivity.class);
                startActivity(intent);
            }
        });
        text_tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TipActivity.class);
                startActivity(intent);
            }
        });
        text_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HotActivity.class);
                startActivity(intent);
            }
        });
        text_need.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NeedActivity.class);
                startActivity(intent);
            }
        });
    }
}

//public class MainActivity extends AppCompatActivity {

//    private ImageButton im_ca;
//    private static final int REQUEST_IMAGE_CODE = 101;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        im_ca.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                takePicture();
//            }
//        });
//    }
//
//    public  void takePicture() {
//        Intent imageIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//        if(imageIntent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(imageIntent, REQUEST_IMAGE_CODE);
//        }
//    }

//}