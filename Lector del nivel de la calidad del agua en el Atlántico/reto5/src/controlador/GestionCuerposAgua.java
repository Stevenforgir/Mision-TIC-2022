/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelos.CuerpoDeAgua;
import java.util.ArrayList;
import modelos.DensidadPoblacional;

/**
 *
 * @author steve
 */
public class GestionCuerposAgua {
    public static ArrayList<CuerpoDeAgua> cuerpos = new ArrayList<CuerpoDeAgua>();
    public static ArrayList<DensidadPoblacional> densidades = new ArrayList<>();
    
    public static void crearCuerposAgua(
            String tipoCuerpoAgua, 
            String tipoAgua, 
            double IRCA, 
            String Nombre, 
            int Id, 
            String Municipio,
            String densidad
    ){
        
        cuerpos.add(new CuerpoDeAgua(
                tipoCuerpoAgua, 
                tipoAgua, 
                IRCA, 
                Nombre, 
                Id, 
                Municipio));
        
        densidades.add(new DensidadPoblacional(
                Integer.parseInt(densidad), 
                Nombre, 
                Id, 
                Municipio));
        
    }
    
    public static ArrayList<String> calculoNivel(){
         ArrayList<String> listar = new ArrayList<String>();
         int cont=0;
         for(int i=0; i<cuerpos.size();i++){
             
             listar.add(cuerpos.get(i).nivel() +" "+ densidades.get(i).afeccion());
             
            if (cuerpos.get(i).nivel() == "SIN RIESGO" || 
                cuerpos.get(i).nivel() == "BAJO" || 
                cuerpos.get(i).nivel() == "MEDIO" )
            {
                cont = cont + 1;
            }
         }
         
                   
       listar.add(Integer.toString(cont));
         
       boolean encontro = false;
        for(int i=0; i<cuerpos.size();i++){
                                     
             if (cuerpos.get(i).nivel() == "MEDIO" )
            {
              listar.add(cuerpos.get(i).getNombre());
              encontro=true;
            }
         }
        
        if(encontro==false)
            listar.add("NA");
        
        //Indicar el nombre del cuerpo de agua con menor nivel de riesgo y su identificador
        double minor = cuerpos.get(0).getIRCA();
        String name = cuerpos.get(0).getNombre();
        
        int id = cuerpos.get(0).getId();
        
        for(int i=0; i <cuerpos.size(); i++){
            
            if(cuerpos.get(i).getIRCA()<minor){
                minor = cuerpos.get(i).getIRCA();
                name = cuerpos.get(i).getNombre();
                id = cuerpos.get(i).getId();
            }
        }
        
        
        listar.add(name+" "+ id);
        
        //System.out.println("\n"+name+" "+id);

        
        return listar;
    }

    public static void crearCuerposAgua(String text, String text0, double parseDouble, String text1, int parseInt, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
