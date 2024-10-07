package com.rianjuniorsec.appsec_quizz;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class pergunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pergunta1);

        // Inicializa o TextView para exibir o nome
        TextView exibirNome = findViewById(R.id.editTextName); // Assegure-se de que o ID aqui é correto

        // Recupera o nome passado pela primeira activity
        String name = getIntent().getStringExtra("USER_NAME");

        // Exibe o nome
        if (name != null) {
            exibirNome.setText("Jogador: " + name);
        }

        // Adicione qualquer outra lógica necessária aqui
    }
}
