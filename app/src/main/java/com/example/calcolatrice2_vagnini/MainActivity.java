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

    private double numero1 = 0;
    private double numero2 = 0;
    private double ris = 0;
    private boolean operazioneInCorso = false;

    private char operazione = '.';

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
                if(testo.getText().toString().equals("0"))
                    testo.setText(t1.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t1.getText().toString());
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t2.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t2.getText().toString());
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t3.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t3.getText().toString());
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t4.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t4.getText().toString());
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t5.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t5.getText().toString());
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t6.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t6.getText().toString());
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t7.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t7.getText().toString());
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t8.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t8.getText().toString());
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t9.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t9.getText().toString());
            }
        });

        t0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testo.getText().toString().equals("0"))
                    testo.setText(t0.getText().toString());
                else
                    testo.setText(testo.getText().toString() + t0.getText().toString());
            }
        });

        piu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Double.parseDouble(testo.getText().toString());
                operazioneInCorso = true;
                operazione = '+';
                testo.setText("");
            }
        });

        meno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Double.parseDouble(testo.getText().toString());
                operazioneInCorso = true;
                operazione = '-';
                testo.setText("");
            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Double.parseDouble(testo.getText().toString());
                operazioneInCorso = true;
                operazione = '*';
                testo.setText("");
            }
        });

        uguale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operazioneInCorso) {
                    numero2 = Double.parseDouble(testo.getText().toString());
                    if (operazione == '+') {
                        ris = numero1 + numero2;
                    } else if (operazione == '-') {
                        ris = numero1 - numero2;
                    } else if (operazione == '*') {
                        ris = numero1 * numero2;
                    }
                    if (ris == Math.floor(ris)) {
                        testo.setText(String.valueOf((long) ris));  // Mostra "5" invece di "5.0"
                    } else {
                        testo.setText(String.valueOf(ris));          // Mostra "5.5" se decimale
                    }
                    operazioneInCorso = false;
                }
            }
        });
    }
}