package com.example.a013;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String KEY_COUNTER = "CONTADOR";

    static final String KEY_NAME = "NOMBRE";

    private int miContador = 0;

    TextView textView;
    EditText editText;
    String texto="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences mias = getSharedPreferences("MIFICHERO", MODE_PRIVATE);
        int defaultCounter = 0;
        miContador = mias.getInt(KEY_COUNTER, defaultCounter);
        String defaultText ="";
        texto = mias.getString(KEY_NAME, defaultText);
        editText = findViewById(R.id.caja);
        editText.setText(texto);
        textView = findViewById(R.id.Resultado);

        textView.setText("Contador: "+Integer.toString(miContador));

    }
    public void Contador(View view) {
        miContador++;
        textView = findViewById(R.id.Resultado);
        textView.setText("Contador: "+Integer.toString(miContador));
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, miContador);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        miContador = savedInstanceState.getInt(KEY_COUNTER);
        textView = findViewById(R.id.Resultado);
        textView.setText("Contador: "+ Integer.toString(miContador));
    }

    protected void onPause(){
        super.onPause();
        SharedPreferences misPreferencias = getSharedPreferences("MIFICHERO", MODE_PRIVATE);
        SharedPreferences.Editor editor = misPreferencias.edit();
        editor.putInt(KEY_COUNTER, miContador);
        editText = findViewById(R.id.caja);
        texto = editText.getText().toString();
        editor.putString(KEY_NAME, texto);
        //solo escribe un commit
        editor.commit();

    }
}