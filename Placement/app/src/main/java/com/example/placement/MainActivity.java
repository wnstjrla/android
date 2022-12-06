package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static Context val;
    public int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val = this;

        Button startpl = (Button) findViewById(R.id.startPlace);
        Button starttm = (Button) findViewById(R.id.startTeam);

        TextView stuNum = (TextView) findViewById(R.id.studentsNum);
        TextView BunNum = (TextView) findViewById(R.id.BoonDanNum);

        startpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stuNum.getText().toString().length() <= 0 || BunNum.getText().toString().length() <= 0) {
                    Toast myToast = Toast.makeText(getApplicationContext(),"숫자를 모두 입력해 주세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }
                try {
                    a = Integer.parseInt(stuNum.getText().toString());
                    b = Integer.parseInt(BunNum.getText().toString());
                }
                catch(NumberFormatException e) {
                    Toast myToast = Toast.makeText(getApplicationContext(),"영문,기호를 제거해 주세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }
                Intent a = new Intent(getApplicationContext(), PlaceLocate.class);
                startActivity(a);
            }
        });

        starttm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stuNum.getText().toString().length() <= 0 || BunNum.getText().toString().length() <= 0) {
                    Toast myToast = Toast.makeText(getApplicationContext(),"숫자를 모두 입력해 주세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }
                try {
                    a = Integer.parseInt(stuNum.getText().toString());
                    b = Integer.parseInt(BunNum.getText().toString());
                }
                catch(NumberFormatException e) {
                    Toast myToast = Toast.makeText(getApplicationContext(),"영문,기호를 제거해 주세요", Toast.LENGTH_SHORT);
                    myToast.show();
                    return;
                }
                Intent b = new Intent(getApplicationContext(), PlaceTeam.class);
                startActivity(b);
            }
        });
    }
}