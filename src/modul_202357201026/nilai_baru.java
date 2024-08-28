/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_202357201026;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class nilai_baru {
    public static void main(String[] args) {
        int data [][] = {{4,6,4,2,8,4,2,10,},{4,6,4,2,8,4,2,10}};
        
        int baris = Integer.parseInt(JOptionPane.showInputDialog("masukkan baris ke"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("masukkan kolom ke"));
        
        int nilai_Baru = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai Baru "));
        data[baris][kolom] = nilai_Baru;
        
        for(int x =0; x <data.length; x++){
            for(int y =0; y <data[x].length; y++){
                System.out.print(data[x][y] + " ");
                
            }
            System.out.println("\n");
        }
        
    }
}
