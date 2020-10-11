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
public class main {
    public static void main(String[] args) {
        Customer chs = new Customer();
        chs.customerID = 1202190008;
        chs.name = "Ananda Viamianni";
        chs.address = "Kalimantan Tengah";
        chs.numberPhone = "081257342001";
        chs.Email = "ananda.viamianni212@gmail.com";
        chs.status = 'O';
        chs.PriceinDollar = 100;
        chs.displayCustomerInfo();
        
    }
    
}
