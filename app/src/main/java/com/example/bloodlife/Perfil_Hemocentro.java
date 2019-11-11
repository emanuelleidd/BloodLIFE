package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Perfil_Hemocentro extends AppCompatActivity {

    private Object String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil__hemocentro);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String  = bundle.getString("nome");
        TextView nome = findViewById(R.id.textNomeHemocentro);
        nome.setText((CharSequence) nome);

        String senha = bundle.getString("senha");
        TextView textSenhaHemo = findViewById(R.id.textSenhaHemo);
        textSenhaHemo.setText(senha);

        String cnpj = bundle.getString("cnpj");
        TextView textCnpj = findViewById(R.id.textCnpj);
        textCnpj.setText(cnpj);

        String localizacao = bundle.getString("localizacao");
        TextView textLocalizacao = findViewById(R.id.textLocalizacao);
        textLocalizacao.setText(localizacao);

        String telefone = bundle.getString("telefone");
        TextView textTelefoneHemo = findViewById(R.id.textTelefoneHemo);
        textTelefoneHemo.setText(telefone);
    }
}
