package com.izv.actividadesizvPSPDEINT;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sergio.actividadesizv.R;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class FragmentoDetalle extends Fragment {

    private static TextView tv;

    public FragmentoDetalle() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmento_detalle, container, false);
        tv = (TextView)v.findViewById(R.id.tvFragmentoDetalle);
        return v;
    }

    public static void mostrarActividad(ActividadRest a){
        tv.setText(a.toString());
    }


}
