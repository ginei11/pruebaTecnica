package com.grability.pruebagrability;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.grability.pruebagrability.utilidades.DetectDevice;

import java.util.Timer;
import java.util.TimerTask;

/**
 * **************************************************************
 * Copyright (c) 2015 - 2016 Carlos Arturo Reyes Romero, All Rights reserved
 * <p>
 * -
 * Muestra la pantalla de inicio
 * -
 * Autor:		Carlos Arturo Reyes Romero
 * email:		carr900@gmail.com
 * Creado:   	21/01/2016
 * Proyecto: 	PruebaGrability
 * ****************************************************************
 */
public class SplashScreen extends Activity {
    private static final long SPLASH_SCREEN_DELAY = 6500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        boolean isTablet= DetectDevice.isTabletDevice(getApplicationContext());

        if (isTablet){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        }
        else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        setContentView(R.layout.splashscreen);


        TextView eTvVersion = (TextView) findViewById(R.id.eTvVersion);

        //Se obtiene la version de la app y se setea
        PackageInfo pInfo = null;
        try {
            pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            String version = pInfo.versionName;
            eTvVersion.setText(version);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        //Se inicia las animaciones
        StartAnimations();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                        //Se inicia la siguiente actividad
                        Intent activityma = new Intent().setClass(
                                SplashScreen.this, MainActivity.class);
                        startActivity(activityma);
                        //Se finaliza esta actividad
                        finish();

            }
        };
        //Se inicia un timer Dummy, con una timer por defecto
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

    /**
     * Metodo que inicia una animacion
     */
    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        LinearLayout l = (LinearLayout) findViewById(R.id.lin_lay);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.imagelogo);
        iv.clearAnimation();
        iv.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        LinearLayout l2 = (LinearLayout) findViewById(R.id.linear2);
        l2.setVisibility(View.VISIBLE);
        l2.clearAnimation();
        l2.startAnimation(anim);
    }

}
