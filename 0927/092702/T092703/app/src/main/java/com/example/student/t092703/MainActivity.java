package com.example.student.t092703;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void onClick3(View view) {
        //Uri uri = Uri.parse("geo:25.1243258,121.5312909");//無小紅點
        //Uri uri = Uri.parse("geo:25.1243258,121.5312909?q=財團法人國際合作發展基金會");//有小紅點
        Uri uri = Uri.parse("geo:0,0?q=財團法人國際合作發展基金會");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
