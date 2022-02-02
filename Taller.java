/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author jonat
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //llamamos a la clase persona y su metodo
        Person p = new Person();
        System.out.println("su indice de masa corporal es de: " + p.IMC());
        System.out.println("su nombre es: " + p.getName());
        System.out.println("la Identidcacion del titula es: " + p.getId());

        //llamamos a la clase cuentaBancaria y su metodo
        Bankaccount bk = new Bankaccount();
        System.out.println("\nsu tarjeta es de tipo: "+bk.cardIformation());
        bk.condition();
        
        //llamamos a la clase fruta y su metodos
        Fruit f = new Fruit();
        f.showColors();
        
        //llamamos a la clase mesay su metodo    
        Desk d = new Desk();
        d.informations();
        
        //llamamos a la clase balon  y su metodo
        Ball b = new Ball();
        b.catchBall();
        b.information();
        
        //llamamos a la clase parlante y su metodo
        Bill Bi = new Bill();
        Bi.receipt();
        
    }
    
}
