/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class ObjetoGeografico {
    private String Nombre;
    private int Id;
    private String Municipio;
    
    //Constructor

    public ObjetoGeografico(String Nombre, int Id, String Municipio) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Municipio = Municipio;
    }

    
    //get and set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }
}
