package com.grability.pruebagrability.modelo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/**
 * **************************************************************
 * Copyright (c) 2015 - 2016 Carlos Arturo Reyes Romero, All Rights reserved
 * <p>
 * -
 * Descripcion de la clase
 * -
 * Autor:		Carlos Arturo Reyes Romero
 * email:		carr900@gmail.com
 * Creado:   	23/01/2016
 * Proyecto: 	PruebaGrability
 * ****************************************************************
 */
public class ImArtist implements Serializable {
    private String label;
    private Attributes attributes;

    @Override
    public String toString() {
        return "ImArtist{" +
                "label='" + label + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
