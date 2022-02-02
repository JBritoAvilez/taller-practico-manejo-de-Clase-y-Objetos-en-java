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
public class Fruit {
    public String name;
    public String pulp;
    private float averageWeight;
    public String[] color = {"amarillo","marron","balanco y negro","verde"};
    
//crea una instancia de la clase Ball;
    
    public Fruit(){
     
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void showColors(){
        int total = color.length;
        System.out.println("\nColor de las frutas");
        for(int i=0; i<total;i++){
            System.out.println("para indice "+i+":"+color[i]);
        }
    }
}
