package com.rianjuniorsec.appsec_quizz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sobreOQuiz extends AppCompatActivity {
    Button botaoVoltar; // declarando o botao

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sobre_oquiz);

        botaoVoltar = findViewById(R.id.btn_voltar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botaoVoltar.setOnClickListener(view -> {
            startActivity(new Intent(sobreOQuiz.this, MainActivity.class));
            finish(); // Adicionando finish() para fechar a atividade atual
        });
    }
}
