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
public class Mundo_disco {
    private String nombre;
    private ArrayList <Criatura> criaturas = new ArrayList();
    private ArrayList <Mundo_disco> mundos = new ArrayList();
    private File archivo = null;

    public Mundo_disco() {
    }
    
    

    public Mundo_disco(String path) {
        archivo = new File (path);
    }
    
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void addCriatura (Criatura c){
        this.criaturas.add(c);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        
        try {
            fw= new FileWriter(archivo,false);
            bw=new BufferedWriter (fw);
            for (Mundo_disco t : mundos) {
                bw.write(t.getNombre()+";");
                for (Criatura c : t.getCriaturas()) {
                    bw.write(t.getNombre()+",");
                }
                bw.write(";");
                //bw.write(t.getEdad()+"\n");
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner r = null;
        mundos = new ArrayList();
        if (archivo.exists()) {
            try {
                r = new Scanner(archivo);
                r.useDelimiter(";");
                while (r.hasNext()) {
                    mundos.add(new Mundo_disco(r.next()
                    )
                    );

                    ArrayList<Criatura> t = mundos.get(mundos.size() - 1).getCriaturas();
                    Scanner s2 = new Scanner(r.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        t.add(new Criatura(s2.next(),
                                s2.nextInt(),
                                s2.nextInt(),
                                s2.next(),
                                s2.nextInt()
                        ));
                    }
                    mundos.get(mundos.size()-1).setCriaturas(criaturas);

                }
            } catch (Exception e) {
        }
            r.close();
        }//fin if
    }
    
    
}
