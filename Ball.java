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
public class Ball {
//atributos
    
    private String type;
    public int weight;
    public float diameter,circunferencia;
    
//crea una instancia de la clase Ball;

    public Ball(){
        
    }
    
//metodo
 public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }
 
    public void catchBall(){
        System.out.println("\nhaz atrapado el balon de:" + type);
    }
    
 //en este metodo estamos mostrando la informacion obtenida del balon
    public void information(){
        System.out.println("El peso del balon es: " + getWeight()+"g");
        System.out.println("El diametro del balon es: "+getDiameter()+"cm");
        System.out.println("la circurferencia del balon es: "+getCircunferencia()+"cm");
    }
}
