package cesar.com.br.numerosaleatorios;

import android.content.Context;
import android.location.LocationListener;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Cesar on 19/10/2016.
 */




public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    public static int PODEEMBARALHAR;

    List<Integer> lista1 = Arrays.asList(2, 3, 4, 6, 8, 10, 12, 13, 14, 15, 16, 18, 19, 21, 22, 24);
    //List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    int num1, num2, num3, num4, num5;


    String[] titulo = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
    Context context;
    LayoutInflater inflater;
    private ArrayList<List> minhasLista;

    public RecyclerAdapter(Context context, ArrayList<List> minhasLista) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.minhasLista = minhasLista;

        Log.i("LOG: ", "Construtor");
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);

       // embaralha();
       // geraNumeros();

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        viewHolder.lista = lista1;


        Log.i("LOG: ", "OnCreate");
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        List listaZerada = minhasLista.get(position);
                holder.tv6.setText(listaZerada.get(0).toString());
                holder.tv7.setText(listaZerada.get(1).toString());
                holder.tv8.setText(listaZerada.get(2).toString());
                holder.tv9.setText(listaZerada.get(3).toString());
                holder.tv10.setText(listaZerada.get(4).toString());


                holder.tvAvatar.setText(titulo[position]);

                Log.i("onBindHolder Position: ", position + "");



    }

//    View.OnClickListener clickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
//            int position = vholder.getPosition();
//
//            Toast.makeText(context, "This is position " + position, Toast.LENGTH_LONG).show();
//
//        }
//    };

    @Override
    public int getItemCount() {
        return titulo.length;
    }



    public void geraNumeros() {

        Collections.shuffle(lista1);

    }

    public void embaralha() {
        //Collections.shuffle(lista2);

        Random gerador = new Random();
        num1 = gerador.nextInt(16);
        num2 = gerador.nextInt(16);
        num3 = gerador.nextInt(16);
        num4 = gerador.nextInt(16);
        num5 = gerador.nextInt(16);

        if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 ||
                num2 == num3 || num2 == num4 || num2 == num5 || num3 == num4 ||
                num3 == num5 || num4 == num5) {

            embaralha();
        }


    }
}
