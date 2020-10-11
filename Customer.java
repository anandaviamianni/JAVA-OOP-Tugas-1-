/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2_1;

/**
 *
 * @author Ananda
 */
public class Customer {
    String name, address, Email, numberPhone;
    int customerID;
    double PriceinDollar;
    char status;
    
    public void displayCustomerInfo(){
        System.out.println("CustomerID : " + customerID);
	System.out.println("Nama : " + name);
	System.out.println("Alamat : " + address);
	System.out.println("Nomor Telepon : " + numberPhone);
	System.out.println("Alamat Email : " + Email);
	System.out.println("Status : " + status);
        System.out.println("Total Penjualan : " + PriceinDollar);
    }
    
}
