/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author PC
 */
public class Generic<T> {
  
    // T is the Datatype like String,
    // Integer of which Parameter type,
    // the class Area is of
    private T t;
  
    public void add(T t)
    {
        // this.t specify the t variable inside
        // the Area Class whereas the right hand
        // side t simply specify the value as the
        // parameter of the function add()
        this.t = t;
    }
  
    public T get() { return t; }
  
    public void getArea() {}
  
    public static void main(String[] args)
    {
        // Object of generic class Area with parameter Type
        // as Integer
        Generic<Integer> rectangle = new Generic<Integer>();
        // Object of generic class Area with parameter Type
        // as Double
        Generic<Double> circle = new Generic<Double>();
        rectangle.add(10);
        circle.add(2.5);
        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}