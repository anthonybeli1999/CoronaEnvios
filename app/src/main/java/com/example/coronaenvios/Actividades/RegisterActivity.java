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

public class RegisterActivity extends AppCompatActivity {

    TextView textbuttonCancel;
    Button buttonRegister;
    EditText editName;
    EditText editLastname;
    EditText editDNI;
    EditText editEmail;
    EditText editPassword;
    EditText editAddress;
    EditText editDistrict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textbuttonCancel = findViewById(R.id.register_textbutton_cancel);
        buttonRegister = findViewById(R.id.register_button_register);
        editName = findViewById(R.id.register_edit_name);
        editLastname = findViewById(R.id.register_edit_lastname);
        editDNI = findViewById(R.id.register_edit_dni);
        editEmail = findViewById(R.id.register_edit_email);
        editPassword = findViewById(R.id.register_edit_password);
        editAddress = findViewById(R.id.register_edit_address);
        editDistrict = findViewById(R.id.register_edit_district);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String lastname = editLastname.getText().toString();
                String dni = editDNI.getText().toString();
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();
                String address = editAddress.getText().toString();
                String district = editDistrict.getText().toString();
                if (name.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese sus nombres", Toast.LENGTH_SHORT).show();
                } else if (lastname.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese sus apellidos", Toast.LENGTH_SHORT).show();
                } else if (dni.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese su DNI", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese su correo electronico", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese su contraseña", Toast.LENGTH_SHORT).show();
                } else if (address.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese su direccion", Toast.LENGTH_SHORT).show();
                } else if (district.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Por favor ingrese su distrito", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Registrado correctamente", Toast.LENGTH_SHORT).show();
                    OnBack();
                }
            }
        });

        textbuttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBack();
            }
        });
    }

    private void OnBack() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
