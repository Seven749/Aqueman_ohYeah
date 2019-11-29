package com.example.firstwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserNameLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_user_name_login);
        Button back = (Button) findViewById(R.id.button_back_UL);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        final EditText userName = (EditText) findViewById(R.id.userName_login);
        final EditText password = (EditText)findViewById(R.id.password_login);
        Button button = (Button) findViewById(R.id.button_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((userName.getText().toString().length() > 0)
                        && (password.getText().toString().length() > 0)) {
                    for (int index = 0; index < MainInterface.size; index++) {
                        if (MainInterface.user[index][0].equals(userName.getText().toString())
                                && MainInterface.user[index][1].equals(password.getText().toString())) {
                            Toast.makeText(UserNameLogin.this, "登陆成功！",
                                    Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }
                    Toast.makeText(UserNameLogin.this, "用户名或密码错误！",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(UserNameLogin.this, "用户名和密码不能为空！",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
