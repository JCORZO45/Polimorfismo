package ejecutable;

import modelo.Animal;
import modelo.Serpipente;
import modelo.Vaca;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Vaca daisy = new Vaca();
        Animal animal= new Vaca(); 
        Serpipente serpiente= new Serpipente(); 

        System.out.println("Daisy dice : " + daisy.hablar());
        System.out.println("Animal dice : " + animal.hablar());
        System.out.println("Serpiente dice : " + serpiente.hablar());
    }
    
}
