/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section8;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class product {
    public static void main(String[] args) {
        int money;
        money = 50000;
        int[] price = {25000, 25000, 10000, 14000};
        Arrays.sort(price);
        buy(money, price);
        
//        money = 30000;
//        price = new int[] {15000, 10000, 12000, 5000, 3000};
//        Arrays.sort(price);
//        buy(money, price);
    }
    
    public static void buy(int money, int[] price){
        int check = 0;
        
        for(int i=0; i<price.length;i++){
            if(price[i]<money){
                money = money-price[i];
                check++;
            }
        }
        System.out.println("Output : " + check);
    }
    
}
