package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlaceLocate extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_locate);

        Button re = (Button) findViewById(R.id.rest);

        TextView pm = (TextView) findViewById(R.id.PM);

        String strPm = "   ";
        int allStudent = ((MainActivity)MainActivity.val).a;
        int bunDan = ((MainActivity)MainActivity.val).b;
        Integer[] locate = new Integer[allStudent];

        for(int i=0; i<allStudent; i++) locate[i] = i+1;

        List<Integer> list = Arrays.asList(locate);
        Collections.shuffle(list);
        list.toArray(locate);

        for(int i=1; i<=allStudent; i++) {
            strPm += locate[i-1]/10 == 0 ? "0" : "";
            strPm += locate[i-1] + "   ";
            if(i % bunDan == 0) strPm += "\n   ";
        }
        pm.setText(strPm);

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(a);
            }
        });
    }

}