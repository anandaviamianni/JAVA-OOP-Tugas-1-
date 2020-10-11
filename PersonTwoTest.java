/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2_2;

/**
 *
 * @author Ananda
 */
import java.util.Scanner;
public class PersonTwoTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PersonTwo prs = new PersonTwo();
        System.out.print("Kuota : ");
        prs.kuota = keyboard.nextLine();
        System.out.print("Nama : ");
        prs.nama = keyboard.nextLine();
        prs.displayQuote();
    }
    
}
