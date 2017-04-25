package com.example.cesar.numberpicker;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = (Button) findViewById(R.id.botao);
        
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final NumberPicker picker;

                    picker = new NumberPicker(MainActivity.this);
                    picker.setMinValue(1);
                    picker.setMaxValue(10);

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Teste")
                        .setView(picker)
                        .setNegativeButton(getString(android.R.string.cancel), null)
                        .setPositiveButton(getString(android.R.string.ok), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Ola", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}
