package com.izv.actividadesizvPSPDEINT;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.sergio.actividadesizv.R;


public class Principal extends Activity {
    public static boolean esTablet = false;
    private FragmentoDetalle fd;
    private FragmentoLista fl;
    private static int ANIADIR = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);// METODO DEPRECATED PERO SIN ALTERNATIVA REAL

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.valoresSpinner, android.R.layout.simple_spinner_item); // PARA RELLENAR SPINNER
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(adapter, new ActionBar.OnNavigationListener() {
            @Override
            public boolean onNavigationItemSelected(int itemPosition, long itemId) {
                switch (itemPosition) {
                    case 0:

                        break;
                    case 1:

                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        fd=(FragmentoDetalle)getFragmentManager().findFragmentById(R.id.fragmentoDetalle);
        fl=(FragmentoLista)getFragmentManager().findFragmentById(R.id.fragmentoLista);
        View detalle = findViewById(R.id.fragmentoDetalle);
        esTablet = detalle != null && detalle.getVisibility() == View.VISIBLE;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_new:

                Intent i = new Intent(this, Aniadir.class);
                Bundle b = new Bundle();
                b.putBoolean("esTablet", esTablet); // PARA SABER SI ES TABLET
                i.putExtras(b);
                startActivityForResult(i, ANIADIR);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
