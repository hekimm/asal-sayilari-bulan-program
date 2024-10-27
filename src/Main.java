/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
public class Main {
    public static void main(String[] args) {
        
        for(int sayi = 2;sayi<=100;sayi++){
                    boolean asalMi = true;

            for(int i =2 ;i<=sayi/2;i++)
            {
                if(sayi%i ==0){
                    asalMi = false;
                    
                }
              
            }
            if(asalMi){
                System.out.println(sayi + " ");
            }
            
        }
    }
}
