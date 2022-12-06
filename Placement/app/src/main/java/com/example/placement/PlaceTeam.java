package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaceTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_team);

        Button rest = (Button) findViewById(R.id.rest);
        TextView pj = (TextView) findViewById(R.id.PJ);

        int allSt = ((MainActivity)MainActivity.val).a;
        int allBu = ((MainActivity)MainActivity.val).b;
        Integer[] locate = new Integer[allSt];
        String printJo = "";
        int co = 1;

        for(int i=0; i<allSt; i++) locate[i] = i+1;
        List<Integer> list = Arrays.asList(locate);
        Collections.shuffle(list);
        list.toArray(locate);


        for(int i=1; i<=allSt; i++) {
            if((i-1)%allBu == 0) printJo += " [" + co++ + "조]";
            printJo += "  " + locate[i-1];
            printJo += (i%allBu == 0 ? " \n" : ",");
        }

        pj.setText(printJo);

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(a);
            }
        });
    }
}