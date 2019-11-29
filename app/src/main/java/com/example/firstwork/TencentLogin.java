package com.example.firstwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TencentLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tencent_login);
        Button back = (Button) findViewById(R.id.button_back_TL);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(TencentLogin.this, "Peach香吗？",
                Toast.LENGTH_SHORT).show();
    }

}
