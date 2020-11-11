package com.example.basiclab;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;

public class MainActivity extends AppCompatActivity   {

    private int[] kolory = new int[]{-16711936,-16711681,-3355444,-65536,-256,-65281,-1,-16776961};
    private Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Zmiana koloru..", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();


                if (getWindow().getDecorView().findViewWithTag("fragment1") != null) {

                    Log.e("TAG", "Current fragment is Fragment1");
                    int wylosowanyKolor=kolory[rand.nextInt(kolory.length)];

                    if(wylosowanyKolor ==Aplikacja.zwrocKolor1()){
                        wylosowanyKolor=kolory[rand.nextInt(kolory.length)];
                       }

                    getWindow().getDecorView().findViewWithTag("fragment1").setBackgroundColor(wylosowanyKolor);
                    Aplikacja.zapiszKolor1(wylosowanyKolor);


                } else if (getWindow().getDecorView().findViewWithTag("fragment2") != null) {

                    Log.e("TAG2", "Current fragment is Fragment2");


                    int wylosowanyKolor=kolory[rand.nextInt(kolory.length)];
                    if(wylosowanyKolor ==Aplikacja.zwrocKolor2()){
                        wylosowanyKolor=kolory[rand.nextInt(kolory.length)];
                    }

                    getWindow().getDecorView().findViewWithTag("fragment2").setBackgroundColor(wylosowanyKolor);
                    Aplikacja.zapiszKolor2(wylosowanyKolor);
                } else if (getWindow().getDecorView().findViewWithTag("fragment3") != null) {

                    int wylosowanyKolor=kolory[rand.nextInt(kolory.length)];
                    if(wylosowanyKolor ==Aplikacja.zwrocKolor3()){
                        wylosowanyKolor=kolory[rand.nextInt(kolory.length)];
                    }


                    Aplikacja.zapiszKolor3(wylosowanyKolor);
                    getWindow().getDecorView().findViewWithTag("fragment3").setBackgroundColor(wylosowanyKolor);
                    Log.e("TAG3", "Current fragment is Fragment3");

                }

            }

        });



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


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_fragment1) {
            Snackbar.make(getWindow().getDecorView().findViewById(R.id.nav_host_fragment), "Fragment1!", Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();

            Navigation.findNavController(getWindow().getDecorView().findViewById(R.id.nav_host_fragment)).navigate(R.id.action_global_FirstFragment);


        } else if(id == R.id.action_fragment2){

            Snackbar.make(getWindow().getDecorView().findViewById(R.id.nav_host_fragment), "Fragment2!", Snackbar.LENGTH_LONG)
                    .setAction("OK", null).show();
            Navigation.findNavController(getWindow().getDecorView().findViewById(R.id.nav_host_fragment)).navigate(R.id.action_global_SecondFragment);

         }else if( id == R.id.action_fragment3){

            Snackbar.make(getWindow().getDecorView().findViewById(R.id.nav_host_fragment), "Fragment3!", Snackbar.LENGTH_LONG)
                    .setAction("ACTION", null).show();

            Navigation.findNavController(getWindow().getDecorView().findViewById(R.id.nav_host_fragment)).navigate(R.id.action_global_ThirdFragment);
        }


        return super.onOptionsItemSelected(item);
    }


}