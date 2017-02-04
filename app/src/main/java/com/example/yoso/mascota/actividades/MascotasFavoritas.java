package com.example.yoso.mascota.actividades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yoso.mascota.R;
import com.example.yoso.mascota.adaptadores.FavoriteAdapter;

public class MascotasFavoritas extends AppCompatActivity {

  private RecyclerView listFavoritas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mascotas_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listFavoritas = (RecyclerView) findViewById(R.id.rvFavorites);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listFavoritas.setLayoutManager(llm);


        inicilializarAdaptador();


    }

    // Método inicializar adaptador

    private void inicilializarAdaptador() {
        FavoriteAdapter  adaptador;
        adaptador = new FavoriteAdapter(this);
        listFavoritas.setAdapter(adaptador);
    }
}
