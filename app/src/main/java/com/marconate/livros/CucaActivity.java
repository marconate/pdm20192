package com.marconate.livros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;

import java.util.Locale;

public class CucaActivity extends AppCompatActivity {

    TextToSpeech leitor;
    TextView tvCuca;
    String historia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuca);

        //Defini o leitor da história
        leitor = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                leitor.setLanguage(new Locale("pt-BR"));
                tvCuca = (TextView)findViewById(R.id.tvCuca);
                historia = tvCuca.getText().toString();
                leitor.speak(historia, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }
}
