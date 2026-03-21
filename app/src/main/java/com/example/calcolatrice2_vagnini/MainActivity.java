package com.example.calcolatrice2_vagnini;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //dichiarazione degli elementi utilizzati
    TextView testo;
    Button t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, piu, meno, per, diviso, punto, uguale, cancellaEntrata, cancellaTutto;
    ImageView immagine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //richiamo il layout
        testo = findViewById(R.id.testo);
        t0 = findViewById(R.id.t0);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        piu = findViewById(R.id.piu);
        meno = findViewById(R.id.meno);
        per = findViewById(R.id.per);
        diviso = findViewById(R.id.diviso);
        punto = findViewById(R.id.punto);
        uguale = findViewById(R.id.uguale);
        cancellaEntrata = findViewById(R.id.cancellaEntrata);
        cancellaTutto = findViewById(R.id.cancellaTutto);

        //azioni ai click dei pulsanti
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t1.getText().toString();
                testo.setText(numero);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t2.getText().toString();
                testo.setText(numero);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t3.getText().toString();
                testo.setText(numero);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t4.getText().toString();
                testo.setText(numero);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t5.getText().toString();
                testo.setText(numero);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t6.getText().toString();
                testo.setText(numero);
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t7.getText().toString();
                testo.setText(numero);
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t8.getText().toString();
                testo.setText(numero);
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t9.getText().toString();
                testo.setText(numero);
            }
        });

        t0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = testo.getText().toString() + t0.getText().toString();
                testo.setText(numero);
            }
        });
    }
}