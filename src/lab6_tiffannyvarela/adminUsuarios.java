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
public class adminUsuarios {
    private ArrayList <Usuario>usuario = new ArrayList();
    private File archivo = null;

    public adminUsuarios(String path) {
        archivo = new File (path);
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList <Usuario>usuario) {
        this.usuario = usuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUsuario (Usuario u){
        this.usuario.add(u);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        
        try {
            fw= new FileWriter(archivo,false);
            bw=new BufferedWriter (fw);
            for (Usuario t : usuario) {
                bw.write(t.getUsuario()+";");
                bw.write(t.getCifrada()+";");
                bw.write(t.getKey()+";");
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
        usuario=new ArrayList();
        if (archivo.exists()) {
            try {
                r=new Scanner (archivo);
                r.useDelimiter(";");
                while (r.hasNext()) {                    
                    usuario.add(new Usuario(r.next(),r.next(),r.nextInt()));
                }
            } catch (Exception e) {
            }
            r.close();
        }
     
    }
    
}
