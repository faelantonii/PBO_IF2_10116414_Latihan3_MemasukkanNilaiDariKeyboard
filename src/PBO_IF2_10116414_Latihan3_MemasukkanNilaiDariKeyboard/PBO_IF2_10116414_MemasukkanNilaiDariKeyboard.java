/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan3_MemasukkanNilaiDariKeyboard;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * Deskripsi    : Program Memasukkan Nilai DariKeyboard
 */
public class PBO_IF2_10116414_MemasukkanNilaiDariKeyboard {
    
    public static void main(String[] args) {
      
        System.out.print("Masukan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah " +nama);
        
    }
}
