package com.example.demo;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.demo.Fragmentos.mainFrames;
import com.example.demo.Fragmentos.personasFrames;
import com.example.demo.Fragmentos.preferencia;
import com.example.demo.Fragmentos.recyclerxD;
import com.example.demo.Fragmentos.restaOperacion;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;
public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    Toolbar toolbar;
    /* access modifiers changed from: protected */

    @SuppressLint("WrongConstant")
    public void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "onCreate", 1).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.drawerLayout =findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navegationView);
        navigationView.setNavigationItemSelectedListener(this);
        TextView campoText = (TextView) this.navigationView.getHeaderView(0).findViewById(R.id.title_head);
        SharedPreferences pre = getSharedPreferences("presetHeader", 0);
        campoText.setText(pre.getString("Titular", "No existe aun xD"));
        campoText.setBackgroundColor(Color.parseColor(pre.getString("Color", "#FF8747")));
        this.actionBarDrawerToggle  = new ActionBarDrawerToggle(this, this.drawerLayout, this.toolbar, R.string.open,R.string.close);
        this.drawerLayout.addDrawerListener(this.actionBarDrawerToggle);
        this.actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        this.actionBarDrawerToggle.syncState();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.fragmentManager = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.fragmentTransaction = beginTransaction;
        beginTransaction.add(R.id.contenedor,  new mainFrames());
        this.fragmentTransaction.commit();
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        this.drawerLayout.closeDrawer((int) GravityCompat.START);
        if (item.getItemId() ==R.id.home) {
            this.fragmentManager= getSupportFragmentManager();
            this.fragmentTransaction  = fragmentManager.beginTransaction();
            this.fragmentTransaction.replace(R.id.contenedor, new mainFrames());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() ==R.id.Suma) {
            this.fragmentManager= getSupportFragmentManager();
            this.fragmentTransaction  = fragmentManager.beginTransaction();
            this.fragmentTransaction.replace(R.id.contenedor, new personasFrames());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() ==R.id.Resta) {
            this.fragmentManager= getSupportFragmentManager();
            this.fragmentTransaction  = fragmentManager.beginTransaction();
            this.fragmentTransaction.replace(R.id.contenedor, new restaOperacion());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() == R.id.Datos) {
            this.fragmentManager= getSupportFragmentManager();
            this.fragmentTransaction  = fragmentManager.beginTransaction();
            this.fragmentTransaction.replace(R.id.contenedor, new recyclerxD());
            this.fragmentTransaction.commit();
        }
        if (item.getItemId() != R.id.Preferencias) {
            this.fragmentManager= getSupportFragmentManager();
            this.fragmentTransaction  = fragmentManager.beginTransaction();
            this.fragmentTransaction.replace(R.id.contenedor, new preferencia());
            this.fragmentTransaction.commit();
        }
        return false;
    }
    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResumen", 1).show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", 1).show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", 1).show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", 1).show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", 1).show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint("WrongConstant")
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", 1).show();
    }
}