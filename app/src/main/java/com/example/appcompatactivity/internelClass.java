package com.example.appcompatactivity;

import android.widget.Toast;

public class internelClass {

    /*
        //내부클래스 사용
        MyListener myListener=new MyListener();
        btnPlus.setOnClickListener(myListener);
        btnMinus.setOnClickListener(myListener);
        btnMulti.setOnClickListener(myListener);
        btnDiv.setOnClickListener(myListener);
        */

   /* void showToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }*/

    /*내부 클래스
    //implement는 인터페이스
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
    }*/
}

