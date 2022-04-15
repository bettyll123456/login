package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRegister;
    private EditText etAccount,etPass,etPassConfirm;
    private RadioButton rbAgree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("zhuce");

        etAccount = findViewById(R.id.et_account);
        etPass = findViewById(R.id.et_account);
        etPassConfirm = findViewById(R.id.et_password_confirm);
        rbAgree = findViewById(R.id.rb_agree);
        btnRegister = findViewById(R.id.btn_register);

        btnRegister.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        String name = etAccount.getText().toString();
        String pass = etPass.getText().toString();

        if(TextUtils.isEmpty(name)){
            Toast.makeText(context:RegisterActivity.this, text:"用户名不为空！", Toast.LENGTH_LONG).
            show();
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(context:RegisterActivity.this, text:"密码不为空！", Toast.LENGTH_LONG).
            show();
        }
        if(!TextUtils.equals(pass,passConfirm)){
            Toast.makeText(context:RegisterActivity.this, text:"密码不一致！", Toast.LENGTH_LONG).
            show();
        }
        if(rbAgree.isChecked()){
            Toast.makeText(context:RegisterActivity.this, text:"同意协议！", Toast.LENGTH_LONG).
            show();
        }
        Toast.makeText(context:RegisterActivity.this, text:"注册成功！", Toast.LENGTH_LONG).
        show();

    }
}