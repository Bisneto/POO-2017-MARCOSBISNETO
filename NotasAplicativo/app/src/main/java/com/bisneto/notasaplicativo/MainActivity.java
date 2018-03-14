package com.bisneto.notasaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nomeAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomeAluno = (EditText) findViewById(R.id.txt_nome);
    }
    public void Salvar(View view){
        Intent in = new Intent(this,NotasActivity.class);
        in.putExtra("nomeAluno", nomeAluno.getText().toString().trim());
        startActivity(in);
        finish();
    }
}
