package com.example.a011;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText numero1;
    public EditText numero2;
    public Button button;
    public TextView resultado;
    public static final String REQUEST_RESULT = "REQUEST_RESULT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickSwitch(View view){
        numero1 = findViewById(R.id.texto1);
        String text1 = numero1.getText().toString();
        numero2 = findViewById(R.id.texto2);
        String text2 = numero2.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("n1", text1);
        bundle.putString("n2", text2);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            resultado = findViewById(R.id.resultado);
            String texto = data.getStringExtra(REQUEST_RESULT);
            resultado.setText(texto);
        }
    }
}