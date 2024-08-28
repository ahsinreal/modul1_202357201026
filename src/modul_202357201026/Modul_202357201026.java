/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul_202357201026;

/**
 *
 * @author USER
 */
public class Modul_202357201026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int data [][] = {{4,6,4,2,8,4,2,10,},{4,6,4,2,8,4,2,10}};
        
        for (int[] data1 : data) {
            for (int kolom = 0; kolom < data1.length; kolom++) {
                System.out.print(data1[kolom] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
