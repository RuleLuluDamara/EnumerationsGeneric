/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
class Test {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
  
    public static void main(String[] args)
    {
        genericDisplay(8);
        genericDisplay("Rule Lulu Damara");
        genericDisplay(18.0);
    }
}
