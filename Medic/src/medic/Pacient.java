/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medic;

/**
 *
 * @author edwar
 */
public class Pacient {
    private int status;
    private double temp = 37.5; 
    private int pulse = 85;
    private int beathing=12;  
    private String name;
    private int old;
    private String description;
    private boolean review=false;
    
    public Pacient(String n, int o, String d){
        name = n;
        old = o;
        description=d;
        this.status = (int)(Math.random()*10); 
        if(desicion()){
            temp+=status/4;
            pulse+=status*2;
        }else{ 
            temp-=status/4;
            pulse-=(int)(status*2.5);
        }
    } 
    
    public boolean desicion(){
        boolean desicion=false;
        int rand = (int)(Math.random()*10);
        if(rand>5){
            desicion=true;
        }
        return desicion;
    }
    
    public String ShowData(){
        return "Nombre: "+name+"\tEdad: "+old+"\nPulso: "+pulse+"ppm"+"\tTemperatura: "+temp+"°C"+"\nRespiraciones por minuto: "
                +beathing+"rpm"+ "\tEstado de gravedad: "+status+"\nDescripcion: "+description+"\nrevisado: "+ review+"\n\n";
    }
    
    public void review(){
        if (review) {
            review=false;
        }else{
            review=true;
        }
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }
    
    
    
    
    
}
