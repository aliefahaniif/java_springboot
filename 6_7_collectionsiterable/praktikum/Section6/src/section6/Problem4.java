/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section6;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Problem4 {
    public static void main(String[] args){
        int[] array_1 = new int[] {1, 2, 3, 4};
        int[] array_2 = new int[] {1, 3, 5, 10, 16};
        angka(array_1, array_2);
        
        array_1 = new int[] {3, 8};
        array_2 = new int[] {2, 8};
        angka(array_1, array_2);
      
    }
    
    public static void angka(int[] array_1, int[] array_2) {
        boolean check = false;
        int i, j;
        
        Set<Integer> set = new HashSet<>();
        
        for(i=0;i<array_1.length;i++){
            for(j=0;j<array_2.length;j++){
                if(array_1[i]==array_2[j]){
                    check = true;
                    break;
                }
                check = false;
            }
            if(check == false){
                set.add(array_1[i]);
            }
        }        
        System.out.println(set);
    }
}
