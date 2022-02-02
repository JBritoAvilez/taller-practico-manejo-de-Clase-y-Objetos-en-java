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
public class Bankaccount extends Person{

//atributos
    
    private int accountNumber;
    public String accountType;
    protected boolean activated;
    
//crea una instancia de la clase Ball;
    
    public Bankaccount() {
        this.accountType = "ahorro";
    }
    
//metodos
    
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    public String accountType(){
        return accountType;
    }
       
   public void condition(){
       this.activated = true;
       System.out.println("su tarjeta se encuentra activada");
   }
   
   public String cardIformation(){
      return accountType;
   }
}
