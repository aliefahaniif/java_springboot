/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section8;

import java.util.*;
import java.util.Collections;
/**
 *
 * @author user
 */

// Java program to get the minimum and
// maximum value after the sorting the ArrayList
// using Collection class function



public class minmax {
	public static void main(String args[])
	{
		// Creating arraylist
		Integer[] input = {5, 7, 4, -2, -1, 8};
                int max = input[0], min = input[0];
		int n;
                
                n = input.length;

		System.out.println("Elements of the ArrayList : ");
		for (int i = 0; i < n; i++) {
			System.out.print(input[i] + " ");
		}
                System.out.println("");

                for (int i = 0; i < n; i++) {
                    if(input[i]>max){
                        max = input[i];
                    } 
                    else if(input[i]<min){
                        min = input[i];
                    }
		}                
                
                
		System.out.println("Min       : " + min);
		System.out.println("Index ke- : " + Arrays.asList(input).indexOf(min));
                
                System.out.println("Max       : " + max);
                System.out.println("Index ke- : " + Arrays.asList(input).indexOf(max));
	}
}
