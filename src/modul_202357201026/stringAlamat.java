/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_202357201026;

/**
 *
 * @author USER
 */
public class stringAlamat {
    public static void main(String[] args) {
        String data[][]= {{"ABDUL", "085646668991", "kediri"},
            {"\nKUSNO","085646668992", "trenggalek"},
            {"\nPONIRAN", "085646668999","bojonegoro"}};
        System.out.println("NAMA\tNO.HANDPHONE\tALAMAT");
        for(String[] i : data){
            System.out.print(i[0] + "\t");
            System.out.print(i[1] + "\t");
            System.out.print(i[2] + "\t");
        }
    }
    
}
