package com.grability.pruebagrability.utilidades;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;

import com.grability.pruebagrability.R;

/**
 * **************************************************************
 * Copyright (c) 2015 - 2016 Carlos Arturo Reyes Romero, All Rights reserved
 * <p>
 * -
 * Detecta el si se trata de un smartphone o una tablet
 * -
 * Autor:		Carlos Arturo Reyes Romero
 * email:		carr900@gmail.com
 * Creado:   	23/01/2016
 * Proyecto: 	PruebaGrability
 * ****************************************************************
 */
public class DetectDevice {

    /**
     * Metodo que hace uso del xml para saber si la aplicacion se
     * esta usando desde un smartphone o una tablet
     * @param activityContext
     * @return true si se trata de una tablet
     */
    public static boolean isTabletDevice(Context activityContext) {

        boolean tabletSize = activityContext.getResources().getBoolean(R.bool.isTablet);

        if (tabletSize){
            return tabletSize;
        }
        else return tabletSize;

    }
}
