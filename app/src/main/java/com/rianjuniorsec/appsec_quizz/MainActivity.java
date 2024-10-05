package com.rianjuniorsec.appsec_quizz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            Button botaoJogar = findViewById(R.id.btn_jogar);
            Button botaoSobre = findViewById(R.id.btn_sobre);


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

            botaoJogar.setOnClickListener(view -> startActivity(new Intent(com.rianjuniorsec.appsec_quizz.MainActivity.this, user.class)));
            botaoSobre.setOnClickListener(view -> startActivity(new Intent(com.rianjuniorsec.appsec_quizz.MainActivity.this, sobreOQuiz.class)));


        }


    }