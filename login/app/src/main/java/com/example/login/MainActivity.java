package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText etAccount,etPassword;
    private String userName="wer";
    private String pass="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Login");

        btnLogin = findViewById(R.id.btn_login);
        etAccount = findViewById(R.id.et_account);
        etPassword = findViewById(R.id.et_password);


        btnLogin.setOnClickListener(new View.onClickListener{
            @Override
            public void onClick(View v){
                String account = etAccount.getText().toString();
                String password = etPassword.getText().toString();

                if (TextUtils.equals(account, userName)) {
                    if (TextUtils.equals(password, pass)) {
                        Toast.makeText(context:MainActivity.this, text:
                        "恭喜你，登录成功！", Toast.LENGTH_LONG).
                        show();
                    } else {
                        Toast.makeText(context:MainActivity.this, text:"密码错误！", Toast.LENGTH_LONG).
                        show();
                    }
                } else {
                    Toast.makeText(context:MainActivity.this, text:"用户名错误！", Toast.LENGTH_LONG).
                    show();
                }
            }

        });
    }
}