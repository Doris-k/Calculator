package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button[] buttons = new Button[18];
    private int[] ids = new int[]{R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,
            R.id.btn8,R.id.btn9,R.id.btn0,R.id.btnadd,R.id.btnminus,R.id.btnmultiply,R.id.btndivide,R.id.btnpoint,
            R.id.btnequal,R.id.btnback,R.id.btnclear
    };
//    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpoint,badd,bminus,bmultiply,bdivide,bequal,bclear,bback;
   private TextView  ans;
//    double var1,var2;
//    boolean add,minus,multiply,divide;
    private String formula = "";
    private boolean end = false;
    private int count=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注释部分为第一版，只能实现a+b、a-b、a*b、a/b四种简单运算，以及清空功能，无法进行有优先级的类似a+b*c的算式的计算
        // 注释下面是改进后第二版，可以实现有优先级的计算，加入了输错回退按钮
        //获取控件按钮
//        b1=(Button)findViewById(R.id.btn1);
//        b2=(Button)findViewById(R.id.btn2);
//        b3=(Button)findViewById(R.id.btn3);
//        b4=(Button)findViewById(R.id.btn4);
//        b5=(Button)findViewById(R.id.btn5);
//        b6=(Button)findViewById(R.id.btn6);
//        b7=(Button)findViewById(R.id.btn7);
//        b8=(Button)findViewById(R.id.btn8);
//        b9=(Button)findViewById(R.id.btn9);
//        b0=(Button)findViewById(R.id.btn0);
//        bpoint=(Button)findViewById(R.id.btnpoint);
//        badd=(Button)findViewById(R.id.btnadd);
//        bminus=(Button)findViewById(R.id.btnminus);
//        bmultiply=(Button)findViewById(R.id.btnmultiply);
//        bdivide=(Button)findViewById(R.id.btndivide);
//        bequal=(Button)findViewById(R.id.btnequal);
//        bclear=(Button)findViewById(R.id.btnclear);
//        bback=(Button)findViewById(R.id.btnback);
//
//        ans=(TextView ) findViewById(R.id.answer);

        //设置点击事件
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"1");
//                ans.setText(ans.getText()+"1");//获取ans内容后＋1，成为ans新的内容
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"2");
//                ans.setText(ans.getText()+"2");//获取ans内容后＋2，成为ans新的内容
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"3");
//                ans.setText(ans.getText()+"3");//获取ans内容后＋3，成为ans新的内容
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"4");
//                ans.setText(ans.getText()+"4");//获取ans内容后＋4，成为ans新的内容
//            }
//        });
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"5");
//                ans.setText(ans.getText()+"5");//获取ans内容后＋5，成为ans新的内容
//            }
//        });
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"6");
//                ans.setText(ans.getText()+"6");//获取ans内容后＋6，成为ans新的内容
//            }
//        });
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"7");
//                ans.setText(ans.getText()+"7");//获取ans内容后＋7，成为ans新的内容
//            }
//        });
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"8");
//                ans.setText(ans.getText()+"8");//获取ans内容后＋8，成为ans新的内容
//            }
//        });
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"9");
//                ans.setText(ans.getText()+"9");//获取ans内容后＋9，成为ans新的内容
//            }
//        });
//        b0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"0");
//                ans.setText(ans.getText()+"0");
//            }
//        });
//        bpoint.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+".");
//                ans.setText(ans.getText()+".");
//
//            }
//        });
//        badd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"+");
//                var1=Double.parseDouble(ans.getText()+"");
//                add=true;
//                ans.setText(null);
//
//            }
//        });
//        bminus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"-");
//                var1=Double.parseDouble(ans.getText()+"");
//                minus=true;
//                ans.setText(null);
//
//            }
//        });
//        bmultiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"*");
//                var1=Double.parseDouble(ans.getText()+"");
//                multiply=true;
//                ans.setText(null);
//
//            }
//        });
//        bdivide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"/");
//                var1=Double.parseDouble(ans.getText()+"");
//                divide=true;
//                ans.setText(null);
//
//            }
//        });
//        bequal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"=");
//                var2=Double.parseDouble(ans.getText()+"");
//                if(add==true){
//                    ans.setText(var1+var2+"");
//                    add=false;
//                }
//                if(minus==true){
//                    ans.setText(var1-var2+"");
//                    minus=false;
//                }
//                if(multiply==true){
//                    ans.setText(var1*var2+"");
//                    multiply=false;
//                }
//                if(divide==true){
//                    if(var2==0){
//                        ans.setText("除数不能为0");
//                    }else{
//                        ans.setText(var1/var2+"");
//                        divide=false;
//                    }
//                }
//            }
//        });
//        bclear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"清空");
//                ans.setText("");
//            }
//        });
//        bback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG,"run:........"+"回退");
//
//            }
//        });

        for(int i=0;i<ids.length;i++){
            buttons[i] = (Button)findViewById(ids[i]);
            buttons[i].setOnClickListener(this);
        }
        ans= (TextView)findViewById(R.id.answer);
    }




   //改进算法采用switch case，能够进行复杂运算
    //参考了CSDN-疯子侠-用Android实现计算器
    //参考了CSDN-涂涂-ing-使用Android 实现计算器功能
    @Override
    public void onClick(View v) {
        int id = v.getId();
        Button button = (Button)v.findViewById(id);
        String current = button.getText().toString();
        if(end){ //如果上一次算式已经结束，则先清零
            formula = "";
            end = false;
        }switch (current) {
            case "clear":  //如果为clear则清零
                formula = "";
                count = 0;
                break;
            case "BACK":  //如果点击退格
                if (formula.length() > 1) { //算式长度大于1
                    formula = formula.substring(0, formula.length() - 1);//退一格
                    int i = formula.length() - 1;
                    char tmp = formula.charAt(i); //获得最后一个字符
                    char tmpFront = tmp;
                    for (; i >= 0; i--) { //向前搜索最近的 +-*/和.，并退出
                        tmpFront = formula.charAt(i);
                        if (tmpFront == '.' || tmpFront == '+' || tmpFront == '-' || tmpFront == '*' || tmpFront == '/') {
                            break;
                        }
                    }
                    if (tmp >= '0' && tmp <= '9') { //最后一个字符为数字，则识别数赋值为0
                        count = 0;
                    } else if (tmp == tmpFront && tmpFront != '.') count = 2; //如果为+-*/，赋值为2
                    else if (tmpFront == '.') count = 1; //如果前面有小数点赋值为1
                } else if (formula.length() == 1) {
                    formula = "";
                }
                break;
            case ".":
                if (formula.equals("") || count == 2) {
                    formula += "0" + current;
                    count = 1;  //小数点按过之后赋值为1
                }
                if (count == 0) {
                    formula += ".";
                    count = 1;
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if (count == 0) {
                    formula += current;
                    count = 2;  //  +-*/按过之后赋值为2
                }
                break;
            case "=":  //按下=时，计算结果并显示
                double result = (double) Math.round(count() * 100) / 100;
                formula += "=" + result;
                end = true; //此次计算结束

                break;
            default: //此处是当退格出现2+0时，用current的值替代0
                if (formula.length() >= 1) {
                    char tmp1 = formula.charAt(formula.length() - 1);
                    if (tmp1 == '0' && formula.length() == 1) {
                        formula = formula.substring(0, formula.length() - 1);
                    } else {
                        if (tmp1 == '0') {
                            char tmp2 = formula.charAt(formula.length() - 2);
                            if (tmp2 == '+' || tmp2 == '-' || tmp2 == '*' || tmp2 == '/') {
                                formula = formula.substring(0, formula.length() - 1);
                            }
                        }
                    }
                }
                formula += current;
                if (count == 2 || count == 1) count = 0;
                break;
        }
        ans.setText(formula); //显示出来
    }
    //计算逻辑，求expression表达式的值
    private double count(){
        double result=0;
        double tNum=1,lowNum=0.1,num=0;
        char tmp=0;
        int operate = 1; //识别+-*/，为+时为正数，为-时为负数，为×时为-2/2,为/时为3/-3;
        boolean point = false;
        for(int i=0;i<formula.length();i++){ //遍历表达式
            tmp = formula.charAt(i);
            if(tmp=='.'){ //因为可能出现小数，此处进行判断是否有小数出现
                point = true;
                lowNum = 0.1;
            }else if(tmp=='+'||tmp=='-'){
                if(operate!=3&&operate!=-3){ //此处判断通用，适用于+-*
                    tNum *= num;
                }else{ //计算/
                    tNum /= num;
                }

                if(operate<0){ //最终的结果
                    result -= tNum;
                }else{
                    result += tNum;
                }
                operate = tmp=='+'?1:-1;
                num = 0;
                tNum = 1;
                point = false;
            }else if(tmp=='*'){
                if(operate!=3&&operate!=-3){
                    tNum *= num;
                }else{
                    tNum /= num;
                }
                operate = operate<0?-2:2;
                point = false;
                num = 0;
            }else if(tmp=='/'){
                if(operate!=3&&operate!=-3){
                    tNum *= num;
                }else{
                    tNum /= num;
                }
                operate = operate<0?-3:3;
                point = false;
                num = 0;
            }else{
                //读取expression中的每个数字，doube型
                if(!point){
                    num = num*10+tmp-'0';
                }else{
                    num += (tmp-'0')*lowNum;
                    lowNum*=0.1;
                }
            }
        }
        //循环遍历结束，计算最后一个运算符后面的数
        if(operate!=3&&operate!=-3){
            tNum *= num;
        }else{
            tNum /= num;
        }
        if(operate<0){
            result -= tNum;
        }else{
            result += tNum;
        }
        //返回最后的结果
        return result;

    }
}