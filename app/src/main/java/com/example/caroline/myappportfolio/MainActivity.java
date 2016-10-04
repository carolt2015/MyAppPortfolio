package com.example.caroline.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating app button instances from the class Button
    Button btnPopularMovies,btnStockHawk,btnBuildItBigger,btnAppMaterial,btnGoUbiquitous,btnCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // POPULAR MOVIES (button)
        // Initializing the below button(s) by id and casting it to Button class.
        btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);

        // Setting OnclickListener to the button(s)
        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Using Toast to print the message when button is clicked.
                Toast.makeText(getBaseContext(), "This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });

        // STOCK HAWK (button)
        btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
            }
        });

        // BUILD IT BIGGER (button)
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        // MAKE YOUR APP MATERIAL (button)
        btnAppMaterial = (Button) findViewById(R.id.btnAppMaterial);
        btnAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch my make your app material app!", Toast.LENGTH_SHORT).show();
            }
        });

        // GO UBIQUITOUS (button)
        btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        btnGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });

        // CAPSTONE (button)
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
