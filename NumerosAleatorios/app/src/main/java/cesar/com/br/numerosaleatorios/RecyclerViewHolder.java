package cesar.com.br.numerosaleatorios;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Cesar on 19/10/2016.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv6, tv7, tv8, tv9, tv10, tvAvatar;
    ImageView imageView;
    public List<Integer> lista;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv6 = (TextView) itemView.findViewById(R.id.txt6);
        tv7 = (TextView) itemView.findViewById(R.id.txt7);
        tv8 = (TextView) itemView.findViewById(R.id.txt8);
        tv9 = (TextView) itemView.findViewById(R.id.txt9);
        tv10 = (TextView) itemView.findViewById(R.id.txt10);




        tvAvatar = (TextView) itemView.findViewById(R.id.list_avatar);
    }
}
