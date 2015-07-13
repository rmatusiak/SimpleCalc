package com.comarch.training;

/**
 * 
 * @author TM
 *
 */
public class SimpleCalculator {

   int memory;
	
   public int add(int x, int y){
	   return x+y;
   }
   
   public int minus(int x, int y){
	   return x-y;
   }
   
   public int multiply(int x, int y){
	   return x*y;
   }
   
   public double divide(double x, double y){
	   return x/y;
   }
   
   public void addToMemory(int x){
	   memory+=x;
   }
   
   public void setMemory(int x){
	   memory=x;
   }
   
   public int getMemory(){
	   return memory;
   }
}
