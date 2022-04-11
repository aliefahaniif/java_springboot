/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;
import java.util.Scanner;
/**
 *
 * @author Aliefa Haniif
 */
public class taskDua {
    public static void main(String[] args) {
    String kalimat;
    char huruf;
    int hurufx=0, hurufo=0;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan huruf X dan O : ");
    kalimat = input.nextLine(); 
    
    for (int i = 0 ; i < kalimat.length() ; i++){
    huruf = Character.toLowerCase(kalimat.charAt(i));
    if ( huruf != ' '){
            if (huruf == 'X'|| huruf == 'x'){
                hurufx++;
            }else{
                hurufo++;
            }
        }
    }
    System.out.println("Input: " + kalimat);
    System.out.println("Output: " + hurufo);
    System.out.println("Output: " + hurufx);
    if(hurufx == hurufo){
        System.out.println("TRUE");
    }else{
            System.out.println("FALSE");
    }
        
    }
}





