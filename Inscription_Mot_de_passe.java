package com.example.tvieux.newworlds;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class Inscription_Mot_de_passe extends AppCompatActivity {
    int compteur=0;
    private RequestQueue pileRequete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription__mot_de_passe);
        pileRequete = Volley.newRequestQueue(this);

        final Intent myIntentSuivant2 = getIntent();
        final String nom = myIntentSuivant2.getStringExtra("nom");
        final String prenom = myIntentSuivant2.getStringExtra("prenom");
        final String pseudo = myIntentSuivant2.getStringExtra("pseudo");
        final String DDN = myIntentSuivant2.getStringExtra("DDN");
        final String adresse = myIntentSuivant2.getStringExtra("adresse");
        final String cp = myIntentSuivant2.getStringExtra("cp");
        final String telephone = myIntentSuivant2.getStringExtra("telephone");
        final String EMail = myIntentSuivant2.getStringExtra("EMail");
        final String ville = myIntentSuivant2.getStringExtra("ville");



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView textViewMDP = (TextView)findViewById(R.id.editTextMDP);
        final TextView textViewMDPVerif = (TextView)findViewById(R.id.editTextMDPVerif);
        final TextView textErreur = (TextView)findViewById(R.id.textViewErreur);


        final Button btValidation = (Button) findViewById(R.id.buttonValidationInscription);
        btValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (compteur==0) {

                    String MDP = textViewMDP.getText().toString();
                    String MDPVerif =textViewMDPVerif.getText().toString();
                    final String url = "172.16.63.111/~tvieux/HTML-CSS/scriptInscription.php?nom="+nom+"&prenom="+prenom+"&pseudo="+pseudo+"&DDN="+DDN+"&adresse="+adresse+"&cp="+cp+"&telephone="+telephone+"&EMail="+EMail+"&ville="+ville+"&MDP="+MDP+"";
                    Log.i("test3",url);
                    if (MDP.equals(MDPVerif))
                    {

                        StringRequest maRequete2 = new StringRequest(Request.Method.GET, url,
                                new Response.Listener<String>() {
                                    @Override
                                    public void onResponse(String response) {
                                        Log.i("test2",url);
                                    }

                                }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {

                            }

                        });
                        pileRequete.add(maRequete2);


                        btValidation.setText("Retour a la page de connexion");
                        compteur++;
                    }
                    else
                    {
                        textErreur.setText("les deux mots de passe ne sont pas identique");

                    }

                }
                else {
                    Intent myIntentSuivant = new Intent(Inscription_Mot_de_passe.this, MainActivity.class);
                    startActivity(myIntentSuivant);
                }
            }
        });
        final Button btAnnuler = (Button) findViewById(R.id.buttonAnnuler);
        btAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            Intent myIntentSuivant = new Intent(Inscription_Mot_de_passe.this, MainActivity.class);
            startActivity(myIntentSuivant);
        }

});
        }
    }


