/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;

/**
 *
 * @author Aliefa Haniif
 */
public class taskSatu {
    public static void main(String[] args) {
    int vokal = 0,konsonan = 0, karakter = 0;
    char huruf;
    String pesan = "Alterra Indonesia";
    
    System.out.println(pesan);
    
    for (int i = 0 ; i < pesan.length() ; i++){
    huruf = Character.toLowerCase(pesan.charAt(i)) ;
        if ( huruf != ' '){
            if (huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u'){
                vokal++;
            }else{
                konsonan++;
            }
        }
    }
    
    System.out.println("Jumlah Vokal    = " + vokal);
    System.out.println("Jumlah Konsonan = " + konsonan);
    System.out.println("Jumlah karakter = " + pesan.length());
   
    }
    
}
