/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */


public class main {
    public static void main(String[] args){
        AllInOne<String> nama = new AllInOne<>();
        nama.setManusia("Wildan");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        AllInOne<Integer> umur = new AllInOne<>();
        umur.setManusia(19);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        AllInOne<Boolean> kondisi = new AllInOne<>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java: "+kondisi.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Float
        AllInOne<Float> IPK = new AllInOne<>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        //Membuat Instance dan Mendefinisikan Tipe Data Character
        AllInOne<Character> Karakter = new AllInOne<>();
        Karakter.setManusia('W');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}