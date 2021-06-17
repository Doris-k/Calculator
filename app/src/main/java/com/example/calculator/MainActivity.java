package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpoint,badd,bminus,bmultiply,bdivide,bequal,bclear;
    EditText ans;
    double var1,var2;
    boolean add,minus,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件按钮
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b0=(Button)findViewById(R.id.btn0);
        bpoint=(Button)findViewById(R.id.btnpoint);
        badd=(Button)findViewById(R.id.btnadd);
        bminus=(Button)findViewById(R.id.btnminus);
        bmultiply=(Button)findViewById(R.id.btnmultiply);
        bdivide=(Button)findViewById(R.id.btndivide);
        bequal=(Button)findViewById(R.id.btnequal);
        bclear=(Button)findViewById(R.id.btnclear);

        ans=(EditText) findViewById(R.id.answer);

        //设置点击事件
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"1");
                ans.setText(ans.getText()+"1");//获取ans内容后＋1，成为ans新的内容
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"2");
                ans.setText(ans.getText()+"2");//获取ans内容后＋2，成为ans新的内容
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"3");
                ans.setText(ans.getText()+"3");//获取ans内容后＋3，成为ans新的内容
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"4");
                ans.setText(ans.getText()+"4");//获取ans内容后＋4，成为ans新的内容
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"5");
                ans.setText(ans.getText()+"5");//获取ans内容后＋5，成为ans新的内容
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"6");
                ans.setText(ans.getText()+"6");//获取ans内容后＋6，成为ans新的内容
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"7");
                ans.setText(ans.getText()+"7");//获取ans内容后＋7，成为ans新的内容
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"8");
                ans.setText(ans.getText()+"8");//获取ans内容后＋8，成为ans新的内容
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"9");
                ans.setText(ans.getText()+"9");//获取ans内容后＋9，成为ans新的内容
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"0");
                ans.setText(ans.getText()+"0");
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+".");
                ans.setText(ans.getText()+".");

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"+");
                var1=Double.parseDouble(ans.getText()+"");
                add=true;
                ans.setText(null);

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"-");
                var1=Double.parseDouble(ans.getText()+"");
                minus=true;
                ans.setText(null);

            }
        });
        bmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"*");
                var1=Double.parseDouble(ans.getText()+"");
                multiply=true;
                ans.setText(null);

            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"/");
                var1=Double.parseDouble(ans.getText()+"");
                divide=true;
                ans.setText(null);

            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"=");
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(minus==true){
                    ans.setText(var1-var2+"");
                    minus=false;
                }
                if(multiply==true){
                    ans.setText(var1*var2+"");
                    multiply=false;
                }
                if(divide==true){
                    if(var1==0){
                    ans.setText(var1/var2+"");
                    divide=false;
                    }else{
                        ans.setText("除数不能为0");
                    }

                }

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"run:........"+"清空");
                ans.setText("");
            }
        });



    }
}