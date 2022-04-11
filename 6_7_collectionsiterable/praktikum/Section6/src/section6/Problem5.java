/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section6;

import java.util.LinkedHashSet;

/**
 *
 * @author user
 */
public class Problem5 {
    public static void main(String[] args)
    {
        int[] a = new int[] { 2, 3, 3, 3, 6, 9, 9 };

        hasil(a);
        
        a = new int[] {2, 2, 2, 11};
        hasil(a);
    }
    
    public static void hasil(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
  
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
  
        // Print the elements of LinkedHashSet
        System.out.print(set);
        System.out.println(" ");
    }
}
