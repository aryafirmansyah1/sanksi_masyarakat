/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilangan;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Tilangan {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        String pelanggaran;
        int total = 0;
        int harga =0;
        
        String[] kasus = {"Tidak membawa masker", "Tidak membawa SIM",
                          "Tidak memebawa STNK"};
        int[] denda = {250000, 250000, 500000};
             
        
        for(int i = 0; i < kasus.length; i++){
            System.out.println(i+". "+kasus[i]);
        }
                    
        for(String a = "yes"; a.equals("yes");)
        {
            System.out.println("masukan pelanggaran anda : " );
            int pilih = input.nextInt();

            
        if (pilih == 0)
        {
            System.out.println(kasus[0]); 
            harga = harga + denda[0];
            System.out.println("total denda : "+ harga);
        }
            else if (pilih == 1)
            {
                System.out.println(kasus[1]); 
                harga = harga + denda[1];
                System.out.println("total denda : "+ harga);
            }
                else if (pilih == 2)
                {
                    System.out.println(kasus[2]); 
                    harga = harga + denda[2];
                    System.out.println("total denda : "+ harga);
                }
                     else
                    {
                        System.out.println("Nomor yang dipilih tidak ada.");
                    }
        System.out.println("Apakah anda masih melanggar ? yes/tidak");
        a = input.next();
        }
        
        System.out.println("___________________________________________________________________");
        System.out.println("Total pembayaran sebesar = Rp. " +harga+".");
        
        
    }
}
        
   
    

