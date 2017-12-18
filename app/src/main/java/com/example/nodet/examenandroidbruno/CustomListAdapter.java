package com.example.nodet.examenandroidbruno;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nodet on 18/12/17.
 */

public class CustomListAdapter extends ArrayAdapter<Pedido> {

    private final Activity context;
    private final List<Pedido> listItems;

    public CustomListAdapter(Activity context, List<Pedido> listItems) {
        super(context, R.layout.row, listItems);

        this.context = context;
        this.listItems = listItems;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.row, null, true);

        TextView nombreItem = (TextView) rowView.findViewById(R.id.textviewNombre);
        TextView nombreUser = (TextView) rowView.findViewById(R.id.textviewDescripcion);


        nombreItem.setText(listItems.get(position).getIdPedido());
        nombreUser.setText(listItems.get(position).getNombreUsuario());


        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context).setTitle("touched").show();
            }

        });

        return rowView;


    }
}