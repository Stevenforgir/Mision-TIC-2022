/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author steve
 */
public class DensidadPoblacional extends ObjetoGeografico {
    private int numeroHabitantes;

    public DensidadPoblacional(int numeroHabitantes, String nombre, int idCuerpo, String municipio) {
        super(nombre, idCuerpo, municipio);
        this.numeroHabitantes = numeroHabitantes;
    }
    
    public int afeccion(){
        int nivel=0;
        
        if(numeroHabitantes<10000)
            nivel=0;
        
        if(numeroHabitantes>=10000 && numeroHabitantes<=50000)
            nivel=1;
        
        if(numeroHabitantes>50000)
            nivel=2;
        
        return nivel;
        
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
}
