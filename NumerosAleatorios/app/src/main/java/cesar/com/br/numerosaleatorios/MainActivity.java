package cesar.com.br.numerosaleatorios;


import android.app.Activity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {

    RecyclerView recyclerView;
    private ArrayList<List> minhasLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        minhasLista = new ArrayList<List>();

        List<Integer> lista1 = Arrays.asList(2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 18, 19, 21, 22, 24);

        for (int i = 0; i< 15; i++){
            Collections.shuffle(lista1);
            List<Integer> novaLista = lista1;
            minhasLista.add(novaLista);
            Log.i("LISTA: ", novaLista.toString());
        }




//        final TextView numeros1 = (TextView)findViewById(R.id.txtNumeros1);
//        final TextView numeros2 = (TextView)findViewById(R.id.txtNumeros2);
//        final TextView numeros3 = (TextView)findViewById(R.id.txtNumeros3);
//        final TextView numeros4 = (TextView)findViewById(R.id.txtNumeros4);

        Button botao = (Button) findViewById(R.id.botao);
        Button definirNum = (Button) findViewById(R.id.btnDefinirNum);
        definirNum.getBackground().setAlpha(0);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RecyclerAdapter adapter = new RecyclerAdapter(MainActivity.this, minhasLista);
                recyclerView.setAdapter(adapter);
                recyclerView.setHasFixedSize(true);

                //Layout manager for Recycler view

                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

            }
        });
    }
}
