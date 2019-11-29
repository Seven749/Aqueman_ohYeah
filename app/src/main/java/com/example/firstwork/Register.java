package com.example.firstwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    boolean canRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);
        Button back = (Button) findViewById(R.id.button_back_R);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final EditText userName = (EditText) findViewById(R.id.username_R);
        final EditText password = (EditText) findViewById(R.id.password_R);
        final EditText passwordAgain = (EditText) findViewById(R.id.password_RA);
        Button toRegister = (Button) findViewById(R.id.register);
        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                for (int index = 0; index < MainInterface.size; index++) {
//                    if (MainInterface.user[index][0].equals(userName.getText().toString())) {
////                        if (MainInterface.size > 0){
////                            canRegister = false;
////                        }
////                        else
//                        canRegister = true;
//                    } else {
//                        canRegister = true;
//                    }
//                }
//                if (canRegister) {

                if ((userName.getText().toString().length() > 0)
                        && (password.getText().toString().length() > 0)) {
                    if ((password.getText().toString().length() >= 8)
                            && (password.getText().toString().length() <= 16)) {
                        if (password.getText().toString().compareTo(passwordAgain.getText().toString())
                                == 0) {
                            MainInterface.size++;
                            if (MainInterface.size == MainInterface.user.length / 2) {
                                MainInterface.user = new Expand().Expand();
                            }
                            MainInterface.user[MainInterface.index][0] = userName.getText().toString();
                            MainInterface.user[MainInterface.index][1] = password.getText().toString();
                            Toast.makeText(Register.this, "注册成功！",
                                    Toast.LENGTH_SHORT).show();
                            MainInterface.index++;
                            finish();
                        } else {
                            Toast.makeText(Register.this, "两次密码输入不一致!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(Register.this, "密码长度控制在8~16位",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Register.this, "用户名和密码不能为空！",
                            Toast.LENGTH_SHORT).show();
                }
//                } else if (!canRegister) {
//                    Toast.makeText(Register.this, "该用户名已被注册",
//                            Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
