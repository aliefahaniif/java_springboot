/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section8;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class fibonacci {
        public static void main (String args[])
	{
	int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        n = input.nextInt(); 
	System.out.println(fibo(n));
	}
        
	static int fibo(int n) 
	{
	if (n <= 1){
	return n;
        } else
	return fibo(n-1) + fibo(n-2);
	}
	
	
}
