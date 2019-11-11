package com.example.bloodlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PerfilUsuario extends AppCompatActivity {

    private Object String;
    private TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_usuario);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String  = bundle.getString("usuario");
        TextView usuario = findViewById(R.id.textUsuario);
        usuario.setText((CharSequence) usuario);
        String senha = bundle.getString("senha");
        TextView textSenha = findViewById(R.id.textSenha);
        textSenha.setText(senha);
        String idade = bundle.getString("idade");
        TextView textIdade = findViewById(R.id.textIdade);
        textIdade.setText(idade);
        String email = bundle.getString("email");
        TextView textEmail = findViewById(R.id.textEmail);
        textEmail.setText(email);
        String telefone = bundle.getString("telefone");
        TextView textTelefone = findViewById(R.id.textTelefone);
        textTelefone.setText(telefone);
        String cpf = bundle.getString("cpf");
        TextView textCpf = findViewById(R.id.textCpf);
        textCpf.setText(cpf);
        String tipo_sanguineo = bundle.getString("tipo_sanguineo");
        TextView textTipoSanguineo = findViewById(R.id.textTipoSanguineo);
        textTipoSanguineo.setText(tipo_sanguineo);
        String sexo = bundle.getString("sexo");
        TextView textSexoResposta = findViewById(R.id.textSexoResposta);
        textSexoResposta.setText(sexo);
    }

    public void TelaInstrucoes(View view) {
        Button Instruções = findViewById(R.id.botaoInstrucoes);
        Intent TelaInstrucoes = new Intent(getApplicationContext(), TelaInstrucoes.class);
        startActivity(TelaInstrucoes);
    }

    public void TelaEditarPerfil(View view) {
        Button EditarPerfil  = findViewById(R.id.botaoEditarDados);
        Intent TelaCadastro = new Intent(getApplicationContext(), TelaCadastroUsuario.class);
        startActivity(TelaCadastro);
    }
}
