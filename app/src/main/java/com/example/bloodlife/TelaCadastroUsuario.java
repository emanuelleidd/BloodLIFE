package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.io.IOException;

public class TelaCadastroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_usuario);
    }

    public void TelaInicial(View view) throws IOException {

        Intent PerfilUsuario = new Intent(getApplicationContext(), PerfilUsuario.class);
        EditText editUsuario = findViewById(R.id.editUsuario);
        String usuario = editUsuario.getText().toString();
        EditText editSenha = findViewById(R.id.editSenha);
        String senha = editSenha.getText().toString();
        EditText editIdade = findViewById(R.id.editIdade);
        String idade = editSenha.getText().toString();
        EditText editEmail = findViewById(R.id.editEmail);
        String email = editEmail.getText().toString();
        EditText editTelefone = findViewById(R.id.editTelefone);
        String telefone = editTelefone.getText().toString();
        EditText editCpf = findViewById(R.id.editCpf);
        String cpf = editCpf.getText().toString();
        EditText editTipoSanguineo = findViewById(R.id.editTipoSanguineo);
        String tipo_sanguineo = editTipoSanguineo.getText().toString();
        Switch sexo_feminino = findViewById(R.id.switchF);
        String feminino = sexo_feminino.getText().toString();
        Switch sexo_masculino = findViewById(R.id.switchM);
        String masculino = sexo_masculino.getText().toString();
        Button Login = findViewById(R.id.botaoCadastrar);
        startActivity(PerfilUsuario);
    }
}
