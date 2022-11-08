/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author PC
 */
public class Main {
    enum Colors {
      RED,
      BLUE,
      YELLOW,
      GREEN
  }
  public static void main(String[] args) { 
    
    Colors myColor = Colors.YELLOW;

    switch(myColor) {
      case RED:
        System.out.println("The color is red");
        break;
      case BLUE:
         System.out.println("The color is blue");
        break;
      case YELLOW:
        System.out.println("The color is yellow");
        break;
      case GREEN:
        System.out.println("The color is green");
        break;
    }
  } 
  
  
    
}
