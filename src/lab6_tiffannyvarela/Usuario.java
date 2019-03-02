/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_tiffannyvarela;

/**
 *
 * @author tiffa
 */
public class Usuario {
    private String usuario = "xXxGranATuinxXx";
    private String contra;
    private String cifrada;
    private int key;

    public Usuario() {
    }

    public Usuario(String contra, String cifrada, int key) {
        this.contra = contra;
        this.cifrada = cifrada;
        this.key = key;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCifrada() {
        return cifrada;
    }

    public void setCifrada(String cifrada) {
        this.cifrada = cifrada;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return usuario ;
    }
    
    
}
