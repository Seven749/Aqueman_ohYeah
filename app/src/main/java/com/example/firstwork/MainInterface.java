package com.example.firstwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainInterface extends AppCompatActivity {
    static String[][] user = new String[8][2];
    static int index = 0;
    static int size = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_interface);
        Button register = (Button) findViewById(R.id.main_button_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInterface.this, Register.class);
                startActivity(intent);
            }
        });
        Button userNameLogin = (Button) findViewById(R.id.main_button1);
        userNameLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInterface.this, UserNameLogin.class);
                startActivity(intent);
            }
        });
        Button sinaLogin = (Button) findViewById(R.id.main_button2);
        sinaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainInterface.this, "你在想peach呢？",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainInterface.this, SinaLogin.class);
                startActivity(intent);
            }
        });
        Button tencentLogin = (Button) findViewById(R.id.main_button3);
        tencentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainInterface.this, "你在想peach呢？",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainInterface.this, TencentLogin.class);
                startActivity(intent);
            }
        });
    }

}
