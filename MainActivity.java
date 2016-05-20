package com.example.tvieux.newworlds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btConnexion = (Button) findViewById(R.id.button);
        EditText identifiant = (EditText)findViewById(R.id.editTextIdentifiant);
        EditText MDP = (EditText)findViewById(R.id.editTextMDP);
        btConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntentAccueil = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(myIntentAccueil);
            }
        });
        Button btInscription = (Button) findViewById(R.id.button2);
        btInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentInscription = new Intent(MainActivity.this, Inscription.class);
                startActivity(myIntentInscription);
            }
        });

       //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            //}
        //});
    }


}
