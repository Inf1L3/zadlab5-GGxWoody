/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.stackCopy;

/**
 *
 * @author Przemysław Paliński
 */
public class Stack {
    private double[] stackContainer = new double[100];
    private int stackPointer;
    
    public Stack(){
        for (int i = 0; i < this.stackContainer.length; i++) {
            this.stackContainer[i] = 0d;            
        }
        this.stackPointer=0;
    }
    
    public double Pop(){
        if(this.stackPointer>=1){            
            this.stackPointer--;
            return this.stackContainer[this.stackPointer+1];
        }else{
            return this.stackContainer[this.stackPointer];
        }    
        
    }
    
    public void Push(double numberToPush){
        if (this.stackPointer<99) {
            this.stackContainer[this.stackPointer] = numberToPush;
            stackPointer++;
        }else if(this.stackPointer==99){
            this.stackContainer[this.stackPointer] = numberToPush;           
        }else{
            System.err.println("Stack is full!");
        }
    }
}
