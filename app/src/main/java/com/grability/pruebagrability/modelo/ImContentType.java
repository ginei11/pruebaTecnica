package com.grability.pruebagrability.modelo;

import java.io.Serializable;

/**
 * **************************************************************
 * Copyright (c) 2015 - 2016 Carlos Arturo Reyes Romero, All rights reserved
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
public class ImContentType implements Serializable{
    private Attributes attributes;

    @Override
    public String toString() {
        return "ImContentType{" +
                "attributes=" + attributes +
                '}';
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
