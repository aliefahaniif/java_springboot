/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section5;

/**
 *
 * @author Aliefa Haniif 
 */
public class Task1 {
    public static void main(String[] args)
    {
        System.out.println(primeNumber(1000000007)); //true
        System.out.println(primeNumber(13)); //true 
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
    }
  
    static int i = 2;
    public static boolean primeNumber(int n)
    {
        if (n == 0 || n == 1)
        {
            return false;
        }

        if (n == i)
            return true;

        if (n % i == 0)
        {
            return false;
        }
        i++;
        return primeNumber(n);
    }

}
