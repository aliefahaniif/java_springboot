/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Encapsulation {

    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("             MENU UTAMA             ");
        System.out.println("1. Cat");
        System.out.println("2. Fish");
        System.out.println("3. Flower");
        System.out.println("4. Car");
        System.out.println("5. Keluar");
        System.out.println("=====================================");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        System.out.println("=====================================");
        System.out.println(" ");
        switch (pilih) {
            case 1:{
                Cat c = new Cat();
                c.setfur_color("Black");
                c.setnum_of_leg(4);

                System.out.print("Saya kucing dengan detail, ");
                System.out.print("Warna bulu : " + c.getfur_color());
                System.out.print(", dengan jumlah kaki : " + c.getnum_of_leg());
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
            case 2:{
                Fish f = new Fish();
                f.settype("Paus");
                f.setfeed("Plankton");
                
                System.out.print("Saya ikan dengan detail, ");
                System.out.print("jenis : " +  f.gettype());
                System.out.print(", dengan makanan : " + f.getfeed());
                System.out.println(" ");
                System.out.println(" ");
                break;
            }
             case 3:{
                Flower flw = new Flower();
                flw.settype("Anggrek");
                flw.setcolor("White");
                flw.setnum_of_petal(8);
                
                System.out.print("Saya bunga dengan detail, ");
                System.out.print("jenis : " +  flw.gettype());
                System.out.print(", color : " +  flw.getcolor());
                System.out.print(", number of petal : " + flw.getnum_of_petal());
                System.out.println(" ");
                System.out.println(" ");
                break;
             }
             case 4:{
                Car car = new Car();
                car.settype("Truck");
                car.setcolor("Green");
                car.setnum_of_tire(6);
                
                System.out.print("Saya kendaraan dengan detail, ");
                System.out.print("jenis : " +  car.gettype());
                System.out.print(", color : " +  car.getcolor());
                System.out.print(", number of tire : " + car.getnum_of_tire());
                System.out.println(" ");
                System.out.println(" ");
                break;
             }
            case 5:{
                System.exit(4);
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
