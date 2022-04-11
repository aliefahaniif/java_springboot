/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section9;
import java.util.*;
import java.lang.*;

/**
 *
 * @author user
 */
public class problem2 {
    public static void main(String[] args) {
        int[] money = new int[]{1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
        int angka = 123;
        hasil(money, angka);

    }
	public static void hasil(int[] money, int angka)
	{
            System.out.print("Angka : " + angka);
            System.out.println(" ");
            System.out.print("Hasil : ");
            
            while (angka !=0){
                for (int i = money.length-1; i>=0; i--){
                    if(money[i]<=angka){
                        angka = angka - money[i];
                        System.out.print(money[i] + " ");
                        i++;
                    }
                }
            }
        }
	

}

