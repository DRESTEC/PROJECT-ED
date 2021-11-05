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
public class Medic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircuDoble maple = new ListaCircuDoble(); 
        Nodo n = new Nodo("p", 12, "ingreso por  ");
        Nodo m = new Nodo("pa", 22, "ingreso por heridas profu sus brazos");
        Nodo b = new Nodo("pau", 32, "ingreso por he en sus brazos");
        Nodo v = new Nodo("paul", 42, "i ndas en sus brazos");
        
        maple.add(n);
        maple.add(m);
        maple.add(b); 
        maple.add(v);
        System.out.println(maple.eliminarPaciente("paul", 42));
        System.out.println(maple.buscarPaciente("paul", 42));
        
    }  
}
