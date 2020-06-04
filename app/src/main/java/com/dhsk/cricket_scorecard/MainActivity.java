package com.dhsk.cricket_scorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int run=0;
    int wickets=0;
    int runb=0;
    int wicketsb=0;
   public void one_run(View v){
        run=run+1;
        display_scores();
    }
    public void two_run(View v){
       run=run+2;
       display_scores();
    }
    public void four_run(View v){
       run=run+4;
       display_scores();
    }
    public void six_run(View v){
       run=run+6;
       display_scores();
    }
    public void wicket_out(View v){
       if(wickets<10){
        wickets=wickets+1;}
       display_scores();
    }

    private void display_scores(){
        TextView teama_score= findViewById(R.id.teama_score);
        String final_score=String.valueOf(run)+"-"+String.valueOf(wickets);
        teama_score.setText(final_score);
    }
    public void bone_run(View v){
        runb=runb+1;
        display_scoresb();
    }
    public void btwo_run(View v){
        runb=runb+2;
        display_scoresb();
    }
    public void bfour_run(View v){
        runb=runb+4;
        display_scoresb();
    }
    public void bsix_run(View v){
        runb=runb+6;
        display_scoresb();
    }
    public void bwicket_out(View v){
       if(wicketsb<10){
        wicketsb=wicketsb+1;}
        display_scoresb();
    }

    private void display_scoresb(){
        TextView teamb_score= findViewById(R.id.teamb_score);
        String final_score=String.valueOf(runb)+"-"+String.valueOf(wicketsb);
        teamb_score.setText(final_score);
    }
    public void reset_run(View v){
       run=0;
       wickets=0;
       runb=0;
       wicketsb=0;
       display_scores();
       display_scoresb();
    }
}

