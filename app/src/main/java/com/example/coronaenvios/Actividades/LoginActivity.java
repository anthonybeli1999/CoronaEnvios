package com.example.coronaenvios.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coronaenvios.R;

public class LoginActivity extends AppCompatActivity {

    Button buttonlogin;
    TextView buttonRegister;
    EditText editEmail;
    EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonlogin = findViewById(R.id.login_button_login);
        buttonRegister = findViewById(R.id.login_textbutton_register);
        editEmail = findViewById(R.id.login_edit_email);
        editPassword = findViewById(R.id.login_edit_password);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();
                if (email.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Por favor ingrese su correo electrónico", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Por favor ingrese su contraseña", Toast.LENGTH_SHORT).show();
                } else {
                    OnLogin();
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnRegister();
            }
        });
    }

    private void OnLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void OnRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }


}
