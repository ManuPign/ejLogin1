package com.example.ejlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonLogin;
    private EditText campousuario;
    private EditText campopassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campousuario  = (EditText) findViewById(R.id.editText);
        campopassword = (EditText) findViewById(R.id.editText2);
        campousuario.setShowSoftInputOnFocus(false);
        campopassword.setShowSoftInputOnFocus(false);


        botonLogin = findViewById(R.id.button);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = campousuario.getText().toString();
                String password = campopassword.getText().toString();

                if (usuario.equals("ites") && password.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Acceso valido", Toast.LENGTH_SHORT).show();
                } else Toast.makeText(getApplicationContext(), "Acceso no permitido", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
