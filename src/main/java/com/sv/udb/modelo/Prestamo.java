/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author DanielWilfredo
 */
public class Prestamo {
    private int codiPresta;
    private int codiLibr;
    private int codiUsua;
    private String nombLibr;
    private String nombUsua;
    private String fechaPres;
    private String fechaDevo;

    public int getCodiPresta() {
        return codiPresta;
    }

    public void setCodiPresta(int codiPresta) {
        this.codiPresta = codiPresta;
    }

    public int getCodiLibr() {
        return codiLibr;
    }

    public void setCodiLibr(int codiLibr) {
        this.codiLibr = codiLibr;
    }

    public int getCodiUsua() {
        return codiUsua;
    }

    public void setCodiUsua(int codiUsua) {
        this.codiUsua = codiUsua;
    }

    public String getNombLibr() {
        return nombLibr;
    }

    public void setNombLibr(String nombLibr) {
        this.nombLibr = nombLibr;
    }

    public String getNombUsua() {
        return nombUsua;
    }

    public void setNombUsua(String nombUsua) {
        this.nombUsua = nombUsua;
    }

    public String getFechaPres() {
        return fechaPres;
    }

    public void setFechaPres(String fechaPres) {
        this.fechaPres = fechaPres;
    }

    public String getFechaDevo() {
        return fechaDevo;
    }

    public void setFechaDevo(String fechaDevo) {
        this.fechaDevo = fechaDevo;
    }

    public Prestamo(int codiPresta, int codiLibr, int codiUsua, String nombLibr, String nombUsua, String fechaPres, String fechaDevo) {
        this.codiPresta = codiPresta;
        this.codiLibr = codiLibr;
        this.codiUsua = codiUsua;
        this.nombLibr = nombLibr;
        this.nombUsua = nombUsua;
        this.fechaPres = fechaPres;
        this.fechaDevo = fechaDevo;
    }
    
    
    
    
    
    
    
    
    
}
