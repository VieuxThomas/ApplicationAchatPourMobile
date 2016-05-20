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

public class Inscription_Coordonnee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription__coordonnee);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView textAdresse=(TextView)findViewById(R.id.editTextadresse);
        final TextView textCP=(TextView)findViewById(R.id.editTextCP);
        final TextView textTelephone=(TextView)findViewById(R.id.editTextTelephone);
        final TextView textEMail=(TextView)findViewById(R.id.editTextEMail);
        final TextView textVille=(TextView)findViewById(R.id.editTextVille);

        final Intent myIntentSuivant = getIntent();
        final String nom = myIntentSuivant.getStringExtra("nom");
        final String prenom = myIntentSuivant.getStringExtra("prenom");
        final String pseudo = myIntentSuivant.getStringExtra("pseudo");
        final String DDN = myIntentSuivant.getStringExtra("DDN");


        Button btSuivant2 = (Button) findViewById(R.id.buttonSuivant2);
        btSuivant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntentSuivant2 = new Intent(Inscription_Coordonnee.this, Inscription_Mot_de_passe.class);
                final String adresse = textAdresse.getText().toString();
                final String cp = textCP.getText().toString();
                final String telephone = textTelephone.getText().toString();
                final String EMail = textEMail.getText().toString();
                final String ville = textVille.getText().toString();

                myIntentSuivant2.putExtra("nom", nom);
                myIntentSuivant2.putExtra("prenom", prenom);
                myIntentSuivant2.putExtra("pseudo", pseudo);
                myIntentSuivant2.putExtra("DDN", DDN);
                myIntentSuivant2.putExtra("adresse", adresse);
                myIntentSuivant2.putExtra("cp", cp);
                myIntentSuivant2.putExtra("telephone", telephone);
                myIntentSuivant2.putExtra("EMail", EMail);
                myIntentSuivant2.putExtra("ville",ville);
                startActivity(myIntentSuivant2);
            }
        });
    }

}
