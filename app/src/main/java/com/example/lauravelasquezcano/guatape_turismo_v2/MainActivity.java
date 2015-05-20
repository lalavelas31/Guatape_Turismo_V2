package com.example.lauravelasquezcano.guatape_turismo_v2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private Hoteles hotelFragment = new Hoteles();
    private Bares baresFragment = new Bares();
    private Sitios_Turisticos sitiosFragment = new Sitios_Turisticos();
    private Demografia demografiaFragment = new Demografia();
    private Acerca_de acercaFragment = new Acerca_de();
    private Publicidad publicidad= new Publicidad();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(android.R.id.content,publicidad).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id == R.id.m_publicidad) {
            fragmentTransaction.replace(android.R.id.content,publicidad).commit();
        }

        if (id == R.id.m_hoteles) {
            fragmentTransaction.replace(android.R.id.content, hotelFragment).commit();
        }

        if (id == R.id.m_bares) {
            fragmentTransaction.replace(android.R.id.content, baresFragment).commit();
        }

        if (id == R.id.m_sitios_turisticos) {
            fragmentTransaction.replace(android.R.id.content, sitiosFragment).commit();
        }

        if (id == R.id.m_demografia) {
            fragmentTransaction.replace(android.R.id.content, demografiaFragment).commit();
        }

        if (id == R.id.m_acerca_de) {
            fragmentTransaction.replace(android.R.id.content, acercaFragment).commit();
        }


        return super.onOptionsItemSelected(item);
    }
}
