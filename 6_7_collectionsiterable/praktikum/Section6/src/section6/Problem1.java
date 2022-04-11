/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section6;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 *
 * @author user
 */
public class Problem1 {
    public static void main(String[] args)
    {
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "jin", "lee", "feng"};
        
        Set<String> name = new LinkedHashSet<>(Arrays.asList(arr1));
        name.addAll(Arrays.asList(arr2));
        
        System.out.println(name);
    }
}