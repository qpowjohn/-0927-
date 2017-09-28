package com.example.student.t02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    直接把Layout寫進程式中
    缺點:很麻煩，所有參數要自己寫
    優點:可以用程式判斷物件的數量

    提問老師:用Layout做出大框架，裡面需要用程式判斷數量的地方在使用就好
     */
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(MainActivity.this);
        /////////////////////////////////////////////////////////////////
//        Button btn = new Button(MainActivity.this);
//        Button button1 = new Button(MainActivity.this);
//        Button button2 = new Button(MainActivity.this);
//        Button button3 = new Button(MainActivity.this);
//        btn.setText("0");
//        button1.setText("1");
//        button2.setText("2");
//        button3.setText("3");
//        ll.addView(btn);
//        ll.addView(button1);
//        ll.addView(button2);
//        ll.addView(button3);
        /////////////////////////////////////////////////////////////////
        for (i = 1; i <= 9; i++) {
            Button btn = new Button(MainActivity.this);
            LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(//呼叫Layout的一群Params，要注意是LinearLayout的
                    ViewGroup.LayoutParams.WRAP_CONTENT, //寬
                    ViewGroup.LayoutParams.WRAP_CONTENT,//高
                    1);//權重
            btn.setLayoutParams(params);
            btn.setText("A");
            final String str = String.valueOf(i);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                }
            });
            ll.addView(btn);
        }
        setContentView(ll);
    }
}
