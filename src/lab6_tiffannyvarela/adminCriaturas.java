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
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class adminCriaturas {
    private ArrayList <Criatura> listacriaturas = new ArrayList();
    private File archivo = null;

    public adminCriaturas(String path) {
        archivo = new File (path);
    }

    public ArrayList<Criatura> getListacriaturas() {
        return listacriaturas;
    }

    public void setListacriaturas(ArrayList<Criatura> listacriaturas) {
        this.listacriaturas = listacriaturas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminCriiaturas{" + "listacriaturas=" + listacriaturas + '}';
    }
    
    public void addCriaturas (Criatura c){
        this.listacriaturas.add(c);
    }
    
    public void escArchCriaturas () throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter (fw);
            for (Criatura t : listacriaturas) {
                bw.write(t.getNombre()+";");
                bw.write(t.getEnergia()+";");
                bw.write(t.getMax_edad()+";");
                bw.write(t.getRegion()+";");
                bw.write(t.getVidas()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner r = null;
        listacriaturas=new ArrayList();
        if (archivo.exists()) {
            try {
                r=new Scanner(archivo);
                r.useDelimiter(";");
                while (r.hasNext()) {
                    listacriaturas.add(new Criatura (r.next(),
                    r.nextInt(),
                    r.nextInt(),
                    r.next(),
                    r.nextInt()
                    )
                    );
                    
                }
            } catch (Exception e) {
            }
            r.close();
        }
    }
    
    
}
