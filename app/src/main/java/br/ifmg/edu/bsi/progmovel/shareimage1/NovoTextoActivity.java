package br.ifmg.edu.bsi.progmovel.shareimage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NovoTextoActivity extends AppCompatActivity {

    public static String EXTRA_TEXTO_ATUAL = "br.ifmg.edu.bsi.progmovel.shareimage1.texto_atual";
    public static String EXTRA_NOVO_TEXTO = "br.ifmg.edu.bsi.progmovel.shareimage1.novo_texto";

    public static String EXTRA_NOVO_TAMANHO = "br.ifmg.edu.bsi.progmovel.shareimage1.novo_tamanho";
    public static String EXTRA_TAMANHO_ATUAL = "br.ifmg.edu.bsi.progmovel.shareimage1.tamanho_atual";
    private EditText etTexto;

    private EditText etTamanho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_texto);
        etTamanho = findViewById(R.id.etTamanho);
        etTexto = findViewById(R.id.etTexto);
        Intent intent = getIntent();
        String textoAtual = intent.getStringExtra(EXTRA_TEXTO_ATUAL);
        String tamanhoAtual = intent.getStringExtra(EXTRA_TAMANHO_ATUAL);
        etTexto.setText(textoAtual);
        etTamanho.setText(tamanhoAtual);

    }

    public void enviarNovoTexto(View v) {
        String novoTexto = etTexto.getText().toString();
        String novoTamanho = etTamanho.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_NOVO_TEXTO, novoTexto);
        intent.putExtra(EXTRA_NOVO_TAMANHO, novoTamanho);
        setResult(RESULT_OK, intent);
        finish();
    }
}