package com.marconate.livros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;

import java.util.Locale;

public class CurupiraActivity extends AppCompatActivity {

    TextToSpeech leitor;
    TextView tvCurupira;
    String historia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curupira);

        //Defini o leitor da história
        leitor = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                leitor.setLanguage(new Locale("pt-BR"));
            }
        });
        tvCurupira = (TextView)findViewById(R.id.tvCurupira);
        historia = tvCurupira.getText().toString();
        leitor.speak(historia, TextToSpeech.QUEUE_FLUSH, null);
    }
}
