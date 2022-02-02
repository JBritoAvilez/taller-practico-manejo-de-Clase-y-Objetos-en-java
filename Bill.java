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
public class Bill {
//atriburtos
    private int serial;
    public String buyerName,companyName;
    protected int nifTansmitter,nifAddressee;
    public float pay;

//crea una instancia de la clase Ball;

    public Bill(){
        this.serial=126487;
        this.buyerName = "alexander";
        this.companyName = "Cost.SA";
        this.nifTansmitter = 1235468;
        this.nifAddressee = 1235478;
        this.pay = (float) 5572358.54;
    }
    
//En este metodo estamos imprimiendo la facutara con los dactos obtenidos
    public void receipt(){
        System.out.println("\nFactura");
        System.out.println("Serial: "+serial);
        System.out.println("Nombre del comprador: "+buyerName);
        System.out.println("Nombre de la empresa: "+companyName);
        System.out.println("NIF de emisor: "+nifTansmitter);
        System.out.println("NIF del destinatario: "+nifAddressee);
        System.out.println("Total a pagar: "+pay);
    }
}