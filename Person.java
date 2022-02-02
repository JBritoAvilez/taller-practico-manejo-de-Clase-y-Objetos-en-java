/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Date;

/**
 *
 * @author jonat
 */
public class Person {   

//atributos
    
    public String name;
    private int Id;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height,weight;

//crea una instancia de la clase Ball;

    public Person(){
        this.Id = 1234953324;
        this.name = "jonathan";
        this.height = (float) 1.72 ;
        this.weight = (float) 95.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
// este metodo se utiliza para saber el indicde de masa corporal de una persona
    public float IMC(){
        float imc;
        imc = weight * (height/2);
        
        return imc;
    }
   
}
