/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_tiffannyvarela;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class adminArchivos {
    private ArrayList <Mundo_disco> mundos = new ArrayList();
    private File archivo = null;
    
    public adminArchivos (String path){
        archivo=new File (path);
    }

    public ArrayList<Mundo_disco> getMundos() {
        return mundos;
    }

    public void setMundos(ArrayList<Mundo_disco> mundos) {
        this.mundos = mundos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminArchivos{" + "mundos=" + mundos + '}';
    }
    
    public void addMundo( Mundo_disco md){
        this.mundos.add(md);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        
    }
    
    public void cargarArchivo(){
        
    }
}
