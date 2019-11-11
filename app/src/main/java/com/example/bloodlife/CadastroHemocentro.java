package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroHemocentro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_hemocentro);

        Intent PerfilUsuario = new Intent(getApplicationContext(), Perfil_Hemocentro.class);

        EditText editNomeHemo = findViewById(R.id.editNomeHemo);
        String nomeHemo = editNomeHemo.getText().toString();

        EditText editSenha = findViewById(R.id.editSenhaHemo);
        String senhaHemo = editSenha.getText().toString();

        EditText editCnpj = findViewById(R.id.editCnpj);
        String cnpj = editSenha.getText().toString();

        EditText editLocalizacao = findViewById(R.id.editLocalizacao);
        String localizacao = editLocalizacao.getText().toString();

        EditText editTelefoneHemo = findViewById(R.id.editTelefoneHemo);
        String telefoneHemo = editTelefoneHemo.getText().toString();
    }

    public void TelaInicial(View view) {
        Button CriarConta = findViewById(R.id.botaoCadastrarHemo);
        Intent TelaCadastroHemocentro = new Intent(getApplicationContext(), Perfil_Hemocentro.class);
        startActivity(TelaCadastroHemocentro);
    }
}
