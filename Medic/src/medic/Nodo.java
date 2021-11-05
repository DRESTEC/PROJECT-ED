/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medic;


public class Nodo {
    private Nodo next;
    private Nodo previus;
    private Pacient paciente;

    public Nodo(String m, int o, String d){
        Pacient P = new Pacient(m, o, d);  
        paciente=P;
    }
     
    
    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevius() {
        return previus;
    }

    public void setPrevius(Nodo previus) {
        this.previus = previus;
    }

    public Pacient getPaciente() {
        return paciente;
    }

    
    
}
