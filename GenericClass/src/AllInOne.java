/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
class AllInOne<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Manusia;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Manusia
    protected T getManusia(){
        return Manusia;
    }
}
