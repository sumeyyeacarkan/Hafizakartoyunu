package com.example.deneme101;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ButtonBarLayout;
//import android.support.V4.widget.AppCompatButton;
//import androidx.appcompat.app.AppCompatActivity;
//import android.support.V7.widget.AppCompatDrawableManager;

@SuppressLint({"RestrictedApi","NewApi"})//stackoverflowdan buldum newapi eklemem gerekiyomus setbackgroundun hata vermemesi icin

public final class kart extends Button {
    boolean acikMi=false; //kartin yuzu acikmi?
    int resimID;
    int ArkaPlanID;
    int onPlanID=0;
    Drawable arka;
    Drawable on;

    public kart(Context context ,int id) {
        super(context);
        ArkaPlanID=R.drawable.back;

        if(id%8==1){
            onPlanID=R.drawable.k1;
        }
        if(id%8==2){
            onPlanID=R.drawable.k2;
        } if(id%8==3){
            onPlanID=R.drawable.k3;
        } if(id%8==4){
            onPlanID=R.drawable.k4;
        } if(id%8==5){
            onPlanID=R.drawable.k5;
        } if(id%8==6){
            onPlanID=R.drawable.k6;
        } if(id%8==7){
            onPlanID=R.drawable.k7;
        } if(id%8==0){
            onPlanID=R.drawable.k8;
        }
        arka = AppCompatDrawableManager.get().getDrawable(context,ArkaPlanID);
        on=AppCompatDrawableManager.get().getDrawable(context, onPlanID);
        setBackground(arka);
    }
       public void cevir() {
           if (!acikMi) {//acik degilse arkasi cevrikse
               setBackground(on);
               acikMi = true;
           } else {
               setBackground(arka);
               acikMi = false;
           }

       }
  //  @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {


  //}
}



