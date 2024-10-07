package com.rianjuniorsec.appsec_quizz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pergunta1 extends AppCompatActivity {

    // Declarando obj
    EditText nomeUser = findViewById(R.id.editTextName);
    Button btnEnviar = findViewById(R.id.btn_enviar);

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView exibirNome = findViewById(R.id.editTextName);

        // Recupera o nome passado pela primeira activity
        String name = getIntent().getStringExtra("USER_NAME");

        // Exibe o nome
        exibirNome.setText("Jogador: " + name);

        // Configura o listener para o botão Enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nomeUser.getText().toString().trim();

            }
        });



    }
}