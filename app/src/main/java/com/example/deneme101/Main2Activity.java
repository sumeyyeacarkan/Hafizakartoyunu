package com.example.deneme101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Button;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String s =i.getStringExtra("mesaj");
        TextView tv =(TextView) findViewById(R.id.textView2);
        tv.setText(s);
        GridLayout gl = (GridLayout) findViewById(R.id.kartlar);
        kart kartlar[]= new kart[16];
        for(int j=1;j<=16;j++) {
           kartlar[j-1]=new kart(this,j);
            kartlar[j-1].setOnClickListener(new View.OnClickListener(){
                @Override
                        public void onClick(View v){
                    kart k = (kart) v;
                    k.cevir();
                }
            });
        }
        //karistir
        for(int j=0;j<=16;j++){
            int rg=((int)Math.random()*16);
            //swap yapma
            kart k =kartlar[rg];
            kartlar[rg]=kartlar[j];
            kartlar[j]=k;
        }
        for(int j=0;j<=16;j++)
            gl.addView(kartlar[j]);
    }
}
