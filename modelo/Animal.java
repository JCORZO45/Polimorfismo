package modelo;

public class Animal{
    private int peso = 0 ; 
    //metodos 
    public void setPeso (int peso){
        this.peso= peso ; 
    }
    public int getpeso(){
        return peso;
    }
    public String hablar(){
        return "Los animales no hablan "; 
    }
}