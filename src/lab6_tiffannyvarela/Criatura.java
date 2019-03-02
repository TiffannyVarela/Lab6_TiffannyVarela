/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_tiffannyvarela;

import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class Criatura {
    private String nombre;
    private int energia;
    private int max_edad;
    private String region;
    private int vidas;
    private ArrayList <String > objetos = new ArrayList ();

    public Criatura() {
    }

    public Criatura(String nombre, int energia, int max_edad, String region, int vidas) {
        this.nombre = nombre;
        this.energia = energia;
        this.max_edad = max_edad;
        this.region = region;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getMax_edad() {
        return max_edad;
    }

    public void setMax_edad(int max_edad) {
        this.max_edad = max_edad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void addObjeto(String o){
        this.objetos.add(o);
    }
    
    
}
