//2-18-2020

import java.util.Scanner;
//1. Create file
public class ArrayProfile_CM{
   public static void main (String [] args){
   
      int size = 10;
      int top = 0;
      int oddNumber = 1;
      
      //2. Define stackArray
      int[] stackArray = new int[size];
      //3..Store 5 elements into the array structure
      for(int i=0; i<5; i++){
         stackArray[i] = oddNumber;
         oddNumber*=3;
         top++;
      }
      
      int tempTop = 0;
      int[] tempStack = new int[size];
      //4. Print odd elements, can't loose it

      for(int i=top-1; i>=0; i--){
         if(stackArray[i] %2 != 0){
            System.out.println(stackArray[i]);
         }
         tempStack[tempTop] = stackArray[i];
         top--; tempTop++;
      }
      for(int i=tempTop-1; i>=0; i--){
         stackArray[top] = tempStack[i];
         top++; tempTop--;
      }
      
      //5. SearchDelete
      boolean found = false;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Out of the elements above, enter the number you'd like to delete");
      int userInput = keyboard.nextInt();
      
      for(int i=top-1; i>=0; i--){
         if(stackArray[i] == userInput){
            found = true;
            top--;
         }
         else{
            tempStack[tempTop] = stackArray[i];
            top--; tempTop++;
         }
      }
      for(int i=tempTop-1; i>=0; i--){
         stackArray[top] = tempStack[i];
         top++; tempTop--;
      } 
      
      if(found == true){ 
         System.out.println("\rELEMENT FOUND");  
         System.out.println("This is the array with element deleted:");
         for(int i=top-1; i>=0; i--){
            System.out.println(stackArray[i]);
            tempStack[tempTop] = stackArray[i];
            top--; tempTop++;
         }
         for(int i=tempTop-1; i>=0; i--){
            stackArray[top] = tempStack[i];
            top++; tempTop--;
         }
      }
      else{
         System.out.println("\rELEMENT NOT FOUND");
      }
      
      
      
      //6. Largest Number
      int largest = stackArray[top];
      
      for(int i = top-1; i>=0; i--){
         if(stackArray[i] > largest){
            largest = stackArray[i];
         }
         tempStack[tempTop] = stackArray[i];
         tempTop++; top--;
      }  
      for(int i = tempTop-1; i>=0; i--){
         stackArray[top] = tempStack[i];
         top++; tempTop--;
      }
      
      System.out.println("\rLargest is " + largest);
      
      //7. Find product of all numbers
      int product = 1;
      
      for(int i = top-1; i>=0; i--){
         product *= stackArray[i];
         tempStack[tempTop] = stackArray[i];
         tempTop++; top--;
      } 
      for(int i = tempTop-1; i>=0; i--){
         stackArray[top] = tempStack[i];
         top++; tempTop--;
      }
      
      System.out.println("\rProduct is " + product);
      
   }
}