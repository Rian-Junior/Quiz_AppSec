package com.rianjuniorsec.appsec_quizz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast; // Importando o Toast para mensagens
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);

        EditText nomeUser = findViewById(R.id.editTextName);
        Button btnIniciar = findViewById(R.id.btn_iniciar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configura o listener para o botão iniciar
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nomeUser.getText().toString().trim(); // Usando trim() para remover espaços em branco

                // Verifica se o nome do usuário está vazio
                if (name.isEmpty()) {
                    // Exibe uma mensagem de erro
                    Toast.makeText(user.this, "Por favor, insira seu nome.", Toast.LENGTH_SHORT).show();
                } else {
                    // Prossegue com a intenção para a próxima atividade
                    Intent intent = new Intent(user.this, pergunta1.class);
                    intent.putExtra("USER_NAME", name);
                    startActivity(intent);
                }
            }
        });
    }
}
