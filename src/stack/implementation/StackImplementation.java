/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.implementation;

/**
 *
 * @author Acer
 */
public class StackImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack MyStack = new Stack();
        //MyStack.pop();  //underflow because no push and stack is empty
        
      MyStack.push(55);
      MyStack.push(66);
      MyStack.push(78);
       
        
      MyStack.pop();
        MyStack.Display();
    }
    
}
