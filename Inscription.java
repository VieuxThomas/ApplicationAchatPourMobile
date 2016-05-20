package com.example.tvieux.newworlds;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView textNom=(TextView)findViewById(R.id.editTextNom);
        final TextView textPrenom=(TextView)findViewById(R.id.editTextPrénom);
        final TextView textPseudo=(TextView)findViewById(R.id.editTextPseudo);
        final TextView textDDN=(TextView)findViewById(R.id.editTextDate);


        Button btSuivant = (Button) findViewById(R.id.buttonSuivant);
        btSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nom = textNom.getText().toString();
                final String prenom = textPrenom.getText().toString();
                final String pseudo = textPseudo.getText().toString();
                final String DDN = textDDN.getText().toString();

                Intent myIntentSuivant = new Intent(Inscription.this, Inscription_Coordonnee.class);
                myIntentSuivant.putExtra("nom", nom);
                myIntentSuivant.putExtra("prenom", prenom);
                myIntentSuivant.putExtra("pseudo", pseudo);
                myIntentSuivant.putExtra("DDN", DDN);
                startActivity(myIntentSuivant);
            }
        });


    }

}
