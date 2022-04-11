/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class taskLima {
    
    public static void main(String[] args) {
        String palindrome ="";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        String teks = input.nextLine();
        
        for(int i=teks.length();i>0;i--){
            String test1 = teks.substring(i-1, i);
            palindrome = palindrome + test1;
	}
        
        if(teks.equals(palindrome)){
            System.out.println("Palindrome");
	}else{
            System.out.println("Bukan Palindrome");
       
    }

    }
}
