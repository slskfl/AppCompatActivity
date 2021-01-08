package com.example.appcompatactivity;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActvityClass {
   /* public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//액티비티가 리스너 인터페이스를 직접 구현
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

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
    */


    }
