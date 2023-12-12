package com.example.imageflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView iv;
private Button change;

private int flag=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.myimg);
        change=findViewById(R.id.click);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {
                    iv.setImageResource(R.drawable.first);
                    flag=2;
                }
                else
                {
                    iv.setImageResource(R.drawable.second);
                }
            }
        });
    }
}