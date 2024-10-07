package com.rianjuniorsec.appsec_quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class user extends AppCompatActivity {

    // Declarando objetos
    EditText nomeUser;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);

        // Inicializando os componentes após setContentView
        nomeUser = findViewById(R.id.editTextName);
        btnIniciar = findViewById(R.id.btn_iniciar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configura o listener para o botão Iniciar
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nomeUser.getText().toString().trim();
                if (name.isEmpty()) {
                    Toast.makeText(user.this, "Por favor, insira seu nome.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(user.this, pergunta1.class);
                    intent.putExtra("USER_NAME", name);
                    startActivity(intent);
                }
            }
        });
    }
}
