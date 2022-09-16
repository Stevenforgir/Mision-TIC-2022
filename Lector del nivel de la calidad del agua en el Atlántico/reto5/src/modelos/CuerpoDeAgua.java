/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author steve
 */
public class CuerpoDeAgua extends ObjetoGeografico{
    
    String tipoCuerpoAgua;
    String tipoAgua;
    double IRCA;

    public CuerpoDeAgua(String tipoCuerpoAgua, String tipoAgua, double IRCA, String Nombre, int Id, String Municipio) {
        super(Nombre, Id, Municipio);
        this.tipoCuerpoAgua = tipoCuerpoAgua;
        this.tipoAgua = tipoAgua;
        this.IRCA = IRCA;
    }
    
    //Atributos
    // Metodo para caluclar el nivel de riesgo en un cuerpo de agua 
    public String nivel(){
        String nivelRiesgo = "";
        if(80 < IRCA && IRCA <= 100){
            nivelRiesgo = "INVIABLE SANITARIAMENTE";
        }
        if (35 < IRCA && IRCA <= 80) {
            nivelRiesgo = "ALTO";
        }
        if (14 < IRCA && IRCA <= 35) {
            nivelRiesgo = "MEDIO";
        }
        if (5 < IRCA && IRCA <= 14) {
            nivelRiesgo = "BAJO";
        }
        if (0 <= IRCA && IRCA <= 5) {
            nivelRiesgo = "SIN RIESGO";
        }
        return nivelRiesgo;
    }

    public String getTipoCuerpoAgua() {
        return tipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String tipoCuerpoAgua) {
        this.tipoCuerpoAgua = tipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public double getIRCA() {
        return IRCA;
    }

    public void setIRCA(double IRCA) {
        this.IRCA = IRCA;
    }
    
    
}