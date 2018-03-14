package com.bisneto.notasaplicativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NotasPesosActivity extends AppCompatActivity {

    private int peso1;
    private int peso2;

    private EditText txt_peso1;
    private EditText txt_peso2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas_pesos);

        peso1 = getIntent().getIntExtra("peso1", 0);
        peso2 = getIntent().getIntExtra("peso2",0);
        txt_peso1 = findViewById(R.id.txt_peso2);
        txt_peso2 = findViewById(R.id.txt_peso2);
    }

    public void finalizarMedia(View view) {
        int pesos1 = Integer.valueOf(txt_peso1.getText().toString().trim());
        int pesos2 = Integer.valueOf(txt_peso2.getText().toString().trim());
        double media = ((pesos1*peso1)+(pesos2*peso2))/(peso1+pesos2);
        getIntent().putExtra("Media",media);
        setResult(RESULT_OK,getIntent());
        finish();

    }
}
