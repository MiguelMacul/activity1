package com.example.demo;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;

public class MainActivity extends AppCompatActivity{
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "onCreate", 3).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         toolbar = (Toolbar)findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        this.drawerLayout =findViewById(C0080R.C0083id.drawer);
        NavigationView navigationView2 = (NavigationView) findViewById(C0080R.C0083id.navegationview);
        this.navigationView = navigationView2;
        navigationView2.setNavigationItemSelectedListener(this);
        TextView asds = (TextView) this.navigationView.getHeaderView(0).findViewById(C0080R.C0083id.cabeza);
        SharedPreferences pre = getSharedPreferences("presetHeader", 0);
        asds.setText(pre.getString("Titular", "No existe aun xD"));
        asds.setBackgroundColor(Color.parseColor(pre.getString("Color", "#FF8747")));
        ActionBarDrawerToggle actionBarDrawerToggle2 = new ActionBarDrawerToggle(this, this.drawerLayout, this.toolbar, C0080R.string.open, C0080R.string.close);
        this.actionBarDrawerToggle = actionBarDrawerToggle2;
        this.drawerLayout.addDrawerListener(actionBarDrawerToggle2);
        this.actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        this.actionBarDrawerToggle.syncState();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.fragmentManager = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.fragmentTransaction = beginTransaction;
        beginTransaction.add((int) C0080R.C0083id.contenedor, (Fragment) new mainFrames());
        this.fragmentTransaction.commit();
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        this.drawerLayout.closeDrawer((int) GravityCompat.START);
        if (item.getItemId() == C0080R.C0083id.home) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            this.fragmentManager = supportFragmentManager;
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            this.fragmentTransaction = beginTransaction;
            beginTransaction.replace(C0080R.C0083id.contenedor, new mainFrames());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() == C0080R.C0083id.Suma) {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            this.fragmentManager = supportFragmentManager2;
            FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
            this.fragmentTransaction = beginTransaction2;
            beginTransaction2.replace(C0080R.C0083id.contenedor, new personasFrames());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() == C0080R.C0083id.Resta) {
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            this.fragmentManager = supportFragmentManager3;
            FragmentTransaction beginTransaction3 = supportFragmentManager3.beginTransaction();
            this.fragmentTransaction = beginTransaction3;
            beginTransaction3.replace(C0080R.C0083id.contenedor, new restaOperacion());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() == C0080R.C0083id.Informe) {
            FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            this.fragmentManager = supportFragmentManager4;
            FragmentTransaction beginTransaction4 = supportFragmentManager4.beginTransaction();
            this.fragmentTransaction = beginTransaction4;
            beginTransaction4.replace(C0080R.C0083id.contenedor, new recyclerxD());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() != C0080R.C0083id.Preferencia) {
            return false;
        }
        FragmentManager supportFragmentManager5 = getSupportFragmentManager();
        this.fragmentManager = supportFragmentManager5;
        FragmentTransaction beginTransaction5 = supportFragmentManager5.beginTransaction();
        this.fragmentTransaction = beginTransaction5;
        beginTransaction5.replace(C0080R.C0083id.contenedor, new preferencia());
        this.fragmentTransaction.commit();
        return false;
    }

    public void almacenarPreferenciasHeader(String Texto) {
        if (!getPreferences(0).getBoolean("presetHeader", false)) {
            SharedPreferences.Editor editar = getSharedPreferences("presetHeader", 0).edit();
            editar.putString("Titular", Texto);
            editar.commit();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResumen", 1).show();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", 1).show();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", 1).show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", 1).show();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", 1).show();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", 1).show();
    }
}