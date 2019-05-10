package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pila {
    private List <Character> elementos;
    Pila (){
        this.crear();
        
    }

    private void crear() {
        
        
        this.elementos=new ArrayList<Character>();
    }
    
    public void push(Character elem){
        this.elementos.add(elem);
        
    }
    public void pop(){
        this.elementos.remove(this.elementos.size()-1);
    }
    public Character top(){
        return this.elementos.get(this.elementos.size()-1);
    }
    public boolean isEmpy()
    {
        return this.elementos.isEmpty();
    }
}
