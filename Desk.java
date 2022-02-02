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
public class Desk {
//atributos
    private String tablematerial;
    public String tableShape;
    protected float tableLength,tableWhidth,tableHeight;
    public int tableBase;//se hace referencia a las patas de la mesa
    
//crea una instancia de la clase Ball;

    public Desk(){
        this.tablematerial = "madera";
        this.tableShape ="circular";
        this.tableLength = (float)4.5;
        this.tableWhidth = 2;
        this.tableHeight = (float) 2.5;
        this.tableBase = 4;
    }
    
 //metodos
public void informations(){
    System.out.println("\nEl material de la mesa es: "+tablematerial);
    System.out.println("La forma de la mesa es: "+tableShape);
    System.out.println("Lo largo de la mesa es de: "+tableLength+"M");
    System.out.println("Lo ancho de la mesa es de: "+tableWhidth+"M");
    System.out.println("Lo ancho de la mesa es de: "+tableHeight+"M");
    System.out.println("La mesa cuenta con "+tableBase+" patas para su base");
}  
}
