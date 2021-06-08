package com.example.bibliobec;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText loginRut, loginPass;
    private Button loginBtn;
    private TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginRut = findViewById(R.id.logRut);
        loginPass = findViewById(R.id.logPassword);
        loginBtn = findViewById(R.id.logBtn);
        forgotPass = findViewById(R.id.forgetPass);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rut = loginRut.getText().toString().trim();
                String password = loginPass.getText().toString().trim();

                if(TextUtils.isEmpty(rut)){
                    loginRut.setError("Debe ingresar rut");
                }
                else if(TextUtils.isEmpty(password)){
                    loginPass.setError("Debe ingresar su contraseña");
                }
                else{
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }
            }
        });
    }
}