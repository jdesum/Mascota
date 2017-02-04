package com.example.yoso.mascota.fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yoso.mascota.R;
import com.example.yoso.mascota.adaptadores.PetPhotoAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilMascota extends Fragment {

    // Atributos
    private RecyclerView listaPerfilMascota;

    public PerfilMascota() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.perfil_mascota, container, false);

        listaPerfilMascota = (RecyclerView) v.findViewById(R.id.rvMiMascota);

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);

        listaPerfilMascota.setLayoutManager(glm);

       inicializarAdaptador();

        return v;
    }
    PetPhotoAdapter adaptador;
    private void inicializarAdaptador() {
        adaptador = new PetPhotoAdapter();
        listaPerfilMascota.setAdapter(adaptador);
    }

}
