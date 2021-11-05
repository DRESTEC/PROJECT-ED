
package medic;
 
import java.time.*;

public class ListaCircuDoble {
    
    private Nodo first;
    public int size;
    private Nodo ultimo; 
    
    public void ListaCircularDoble(){
        first=null;
        ultimo=null;
        size=0; 
    }
    
    public void add(Nodo N){
        if (first==null) {
            first=N;
            ultimo=N;
            first.setNext(ultimo);
            first.setPrevius(ultimo);
            ultimo.setNext(first);
            ultimo.setPrevius(first);
            size++;
        }else{
            ultimo.setNext(N);
            N.setPrevius(ultimo);
            ultimo=N; 
            ultimo.setNext(first);
            first.setPrevius(ultimo);
            size++;
        }
    } 
    
    public String eliminarPaciente(String n, int o){
        if(first==null){
            return "Lista vacia";
        }else{ 
            Nodo current=first;
            for(int i=0 ; i<size ; i++){ 
                String name = current.getPaciente().getName();
                int old = current.getPaciente().getOld();
                if((name == null ? n == null : name.equals(n)) && old==o){
                    if(current==first){
                        first=current.getNext();
                        first.setPrevius(ultimo);
                        ultimo.setPrevius(first); 
                        size--;    
                        return current.getPaciente().ShowData();
                    }else if (current==ultimo){
                        ultimo=current.getPrevius();
                        first.setPrevius(ultimo);
                        ultimo.setNext(first); 
                        size--; 
                        return current.getPaciente().ShowData();
                    }else{
                        current.getPrevius().setNext(current.getNext());
                        current.getNext().setPrevius(current.getPrevius());
                        size--; 
                        return current.getPaciente().ShowData();                    } 
                }
                current=current.getNext();
            }
        }
        return "Paciente no encontrado";
    }
    
    public String buscarPaciente(String n, int o){
        if(first==null){
            return "Lista vacia";
        }else{ 
            Nodo current=first;
            for(int i=0 ; i<size ; i++){
                String name = current.getPaciente().getName();
                int old = current.getPaciente().getOld();
                if((name == null ? n == null : name.equals(n)) && old==o){
                   return current.getPaciente().ShowData();  
                }
                current=current.getNext();
            }
        }
        return "Paciente no encontrado";
    }  
    
    public String imprimir(){ 
        String a = "";
        if(first==null){
            return "Lista vacia";
        }else{ 
            Nodo current=first;
            for(int i=0 ; i<size ; i++){
                a += current.getPaciente().ShowData();
                current=current.getNext();
            }
        }
        return a;
    }

    public void getFirst() {
        first.getPaciente().ShowData();
    }

    public void getUltimo() {
        ultimo.getPaciente().ShowData();
    }

    












}

