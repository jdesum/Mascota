package com.example.yoso.mascota.fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yoso.mascota.R;
import com.example.yoso.mascota.adaptadores.PetListAdapter;

/**
 * Fragmento
 * A simple {@link Fragment} subclass.
 */
public class ListaMascotas extends Fragment {

    // Atributos
    private RecyclerView listaMascotas;

    public ListaMascotas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.lista_mascotas, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);


         inicializarAdaptador();

        return v;
    }

    // Método inicializar Adaptador
    PetListAdapter adaptador;
    private void inicializarAdaptador() {
         adaptador = new PetListAdapter(getContext());

        listaMascotas.setAdapter(adaptador);

    }


}
