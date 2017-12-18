package com.example.nodet.examenandroidbruno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Pedidos extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        listView = findViewById(R.id.listViewPedidos);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = new Pedido();
        pedido.nombreUsuario = "bruno";
        pedido.idPedido = "123";
        pedidos.add(pedido);

        CustomListAdapter adapter=new CustomListAdapter(Pedidos.this, pedidos);
        listView.setAdapter(adapter);
    }
}
