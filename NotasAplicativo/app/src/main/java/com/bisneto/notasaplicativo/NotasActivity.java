package com.bisneto.notasaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NotasActivity extends AppCompatActivity {

    public static final int NotasPesosActivity = 1;
    private EditText nota1;
    private EditText nota2;
    private String nomeAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        nomeAluno = getIntent().getStringExtra("Usuario");
        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);

    }
    @Override
    protected void onActivityResul() {
    }

    public void calcularMedia(View view) {
        Intent it = new Intent(this, NotasPesosActivity.class);
        it.putExtra("nota1", Double.valueOf(nota1.getText().toString().trim()));
        it.putExtra("nota2", Double.valueOf(nota2.getText().toString().trim()));
        startActivityForResult(it, NotasPesosActivity);
    }

    }
}
