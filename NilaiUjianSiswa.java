/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray;

/**
 *
 * @author nuris
 */
public class NilaiUjianSiswa {
    public static void main(String[] args){
        int [] [] [] nilai = {
            {{51 , 89}, {60, 59}, {52, 47}},
            {{39, 58}, {71,85}, {39, 78}},
            {{81, 32}, {51,86}, {59, 31}}
        };
        for (int i =0;i < nilai.length; i++) {
            
            for(int j = 0; j < nilai[0].length; j++){
                
                for(int k = 0; k <  nilai[0] [0].length; j++){
                    System.out.print("nilai[" +1+ "] [" +j+ "] [" +k+ "] = " + nilai [1][j][k]+ "\t");
                }
                System.out.println();
                }
            System.out.println();
        }
    }
}
        
            
            
            
        
        
        
            
        
            
            
        
