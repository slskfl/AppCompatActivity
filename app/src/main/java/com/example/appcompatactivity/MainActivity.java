package com.example.appcompatactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editNum1, editNum2;
    Button btnPlus, btnMinus, btnMulti, btnDiv;
    TextView tvResult;
    int num1, num2;
    String number1, number2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1=findViewById(R.id.editNum1);
        editNum2=findViewById(R.id.editNum2);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMulti=findViewById(R.id.btnMulti);
        btnDiv=findViewById(R.id.btnDiv);
        tvResult=findViewById(R.id.tvResult);

        //내부클래스 사용
        MyListener myListener=new MyListener();
        btnPlus.setOnClickListener(myListener);
        btnMinus.setOnClickListener(myListener);
        btnMulti.setOnClickListener(myListener);
        btnDiv.setOnClickListener(myListener);

       /* btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String num1=editNum1.getText().toString();
               String num2=editNum2.getText().toString();
                tvResult.setText("계산결과 :" + (Integer.parseInt(num1)+Integer.parseInt(num2)) );
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                num1=Integer.parseInt(editNum1.getText().toString());
//                num2=Integer.parseInt(editNum2.getText().toString());
//                tvResult.setText("계산 결과 : " + (num1-num2));
                number1=editNum1.getText().toString();
                number2=editNum2.getText().toString();
                if(number1.equals("")||number2.equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                } else {
                    result=Integer.parseInt(number1)-Integer.parseInt(number2);
                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Integer.parseInt(editNum1.getText().toString());
                num2=Integer.parseInt(editNum2.getText().toString());
                tvResult.setText("계산 결과 : " + (num1*num2));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // '0'으로 나누어지는 것을 방지.
                try {
                    number1=editNum1.getText().toString();
                    number2=editNum2.getText().toString();
                    if(number1.equals("")||number2.equals("")){
                        Toast.makeText(getApplicationContext(),"입력값이 비었습니다.",Toast.LENGTH_SHORT).show();
                    } else {
                        result=Integer.parseInt(number1)/Integer.parseInt(number2);
                        tvResult.setText("계산 결과 : " + result);
                    }
                } catch (java.lang.ArithmeticException e){
                    Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
    //토스트 메서드
    void showToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    //내부 클래스
    class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            number1=editNum1.getText().toString();
            number2=editNum2.getText().toString();
            switch (v.getId()) {
                case R.id.btnPlus:
                    if (number1.equals("") || number2.equals("")) {
                        showToast("입력값이 비었습니다.");
                    } else {
                        result = Integer.parseInt(number1) + Integer.parseInt(number2);
                    }
                    break;
                case R.id.btnMinus:
                    if (number1.equals("") || number2.equals("")) {
                        showToast("입력값이 비었습니다.");
                    } else {
                        result = Integer.parseInt(number1) - Integer.parseInt(number2);
                    }
                    break;
                case R.id.btnMulti:
                    if (number1.equals("") || number2.equals("")) {
                        showToast("입력값이 비었습니다.");
                    } else {
                        result = Integer.parseInt(number1) * Integer.parseInt(number2);
                    }
                    break;
                case R.id.btnDiv:
                    try {
                        number1=editNum1.getText().toString();
                        number2=editNum2.getText().toString();
                        if(number1.equals("")||number2.equals("")){
                            showToast("입력값이 비었습니다.");
                        } else {
                            result=Integer.parseInt(number1)/Integer.parseInt(number2);
                            tvResult.setText("계산 결과 : " + result);
                        }
                    } catch (java.lang.ArithmeticException e){
                        Toast.makeText(getApplicationContext(), "0으로 나누면 안됩니다.", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            tvResult.setText("계산 결과 : " + result);
        }
    }
}