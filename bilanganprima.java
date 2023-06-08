/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilanganprima;

import java.util.Scanner;
/**
 *
 * @author This PC
 */
public class bilanganprima {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    
    int angka;
    int temp = 0;
    boolean prima = true;
    
    System.out.print("Masukkan Angka: ");
    angka = in.nextInt();
    
    for (int x = 2; x <= angka / 2; x++) {
    if (angka % x == 0) {
        prima = false;
        temp = x;
        break;
    }
}
    if (prima) {
        System.out.println(angka + " " + "merupakan bilangan prima");
    }else{
        System.out.println(angka + " " + "bukan bilangan prima, karena bisa dibagi" + " " + temp);
}        
    }
}
