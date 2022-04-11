/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("==============CALCULATOR=============");
        System.out.println("1. Open Calculator");
        System.out.println("2. Exit");
        System.out.println("=====================================");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
        System.out.println(" ");
        switch (pilih) {
            case 1:{
                Scanner value1 = new Scanner(System.in);
                Scanner value2 = new Scanner(System.in);
                System.out.println("==============CALCULATOR=============");
                System.out.print("Masukkan value 1 : ");
                int val1 = value1.nextInt();
                System.out.print("Masukkan value 2 : ");
                int val2 = value2.nextInt();
                
                Kal k = new Kal() {};
                k.setx(val1);
                k.sety(val2);
                
                String lg = "y";
                while (lg.equals("y"))
                {
                System.out.println(" ");
                Scanner input2 = new Scanner(System.in);
                System.out.println("==============CALCULATOR=============");
                System.out.println("1. Add Value");
                System.out.println("2. Sub Value");
                System.out.println("3. Multipy Value");
                System.out.println("4. Divide Value");
                System.out.println("5. Exit");
                System.out.println("=====================================");
                System.out.print("Pilih : ");
                int pilih2 = input2.nextInt();
                System.out.println("=====================================");
                System.out.println(" ");
                switch (pilih2) {
                    case 1:{
                    k.add();
                    break;
                    }
                    case 2:{
                        k.sub();
                        break;
                    }
                    case 3:{
                        k.mult();
                        break;
                    }
                    case 4:{
                        k.div();
                        break;
                    }
                    case 5:{
                        System.exit(0);
                        System.out.println("Warning !! Pilihan tidak tersedia !! ");
                    }
                        break;
                }
                System.out.println("=====================================");
                System.out.print("Apakah anda ingin mengulang (y/t)? ");
                lg = input2.next();
                }
            }
            
            
            case 2:{
            System.exit(0);
            System.out.println("Warning !! Pilihan tidak tersedia !! ");
            }
                break;
        }
        System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
        ulg = input.next();
        }
    }
}
