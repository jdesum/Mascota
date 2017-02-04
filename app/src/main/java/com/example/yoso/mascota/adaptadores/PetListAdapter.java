package com.example.yoso.mascota.adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yoso.mascota.R;
import com.example.yoso.mascota.pojo.Mascota;

import static com.example.yoso.mascota.pojo.Mascota.LISTA_MASCOTAS;

/**
 * Created by yoso on 24/01/17.
 */

public class PetListAdapter extends RecyclerView.Adapter<PetListAdapter.PetViewHolder>{

    // Activity activity
    Context context;


    // Constructor
      public PetListAdapter(Context context) {
          this.context = context;

    }



    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_mascota, parent, false);

        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetViewHolder petViewHolder, int position) {
        final Mascota mascota = LISTA_MASCOTAS.get(position);
        petViewHolder.foto.setImageResource(mascota.getIdDrawable());
        petViewHolder.nombre.setText(mascota.getNombre());
        petViewHolder.puntos.setText(mascota.getPuntos());

        petViewHolder.foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, mascota.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        // Clic en like
        petViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return LISTA_MASCOTAS.size();
    }


    // Clase Viewholder
    public static class PetViewHolder extends RecyclerView.ViewHolder {

        private ImageView foto;
        private TextView nombre;
        private TextView puntos;
        private ImageButton btnLike;

        public PetViewHolder(View itemView) {
            super(itemView);

            foto = (ImageView) itemView.findViewById(R.id.imagen_mascota);
            nombre = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            puntos = (TextView) itemView.findViewById(R.id.tvPuntuacion);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnWhiteBoneLike);
        }
    }


}
