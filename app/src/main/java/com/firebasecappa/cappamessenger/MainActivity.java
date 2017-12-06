package com.firebasecappa.cappamessenger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
private  DatabaseReference myref = FirebaseDatabase.getInstance().getReference();
private Week dev11;
private Week dev21;
private Week dev31;
private Week dev41;
private Week b11;
private Week b21;
private Week b31;
private Week b32;
private Week b22;
private ExpandableListView list_week;
private  ValueEventListener dev11Listener = new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        if (dataSnapshot.exists()) {
        dev11 = dataSnapshot.getValue(Week.class);
        for (int i = 0; i < dev11.getSaturday().size();i++)
            System.out.println(dev11.getSaturday().get(i));
        }
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
    }
};

    private  ValueEventListener dev21Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                dev21 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener dev31Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                dev31 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener dev41Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                dev41 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener b11Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                b11 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener b21Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                b21 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener b31Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                b31 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener b22Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                b22 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    private  ValueEventListener b32Listener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.exists()) {
                b32 = dataSnapshot.getValue(Week.class);
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),"Ошибка: "+databaseError.getMessage(),Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();




        myref.child("dev11").addValueEventListener(dev11Listener);
        myref.child("dev21").addValueEventListener(dev21Listener);
        myref.child("dev31").addValueEventListener(dev31Listener);
        myref.child("dev41").addValueEventListener(dev41Listener);
        myref.child("b11").addValueEventListener(dev41Listener);
        myref.child("b21").addValueEventListener(dev41Listener);
        myref.child("b22").addValueEventListener(dev41Listener);
        myref.child("b31").addValueEventListener(dev41Listener);
        myref.child("b32").addValueEventListener(dev41Listener);
        list_week = (ExpandableListView) findViewById(R.id.list_week);
            
                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    public Week getDev11() {
        return dev11;
    }

    public Week getDev21() {
        return dev21;
    }

    public Week getDev31() {
        return dev31;
    }

    public Week getDev41() {
        return dev41;
    }

    public Week getB11() {
        return b11;
    }

    public Week getB21() {
        return b21;
    }

    public Week getB31() {
        return b31;
    }

    public Week getB32() {
        return b32;
    }

    public Week getB22() {
        return b22;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
