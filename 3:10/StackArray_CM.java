//Carlos Mayers
//3-10-2020

import java.util.Scanner;

public class StackArray_CM{
   public static void main (String [] args){
   
   Scanner keyboard = new Scanner(System.in);

   int size = 15;
   int top = 0;
   int tempTop = 0;
   
   int[] myStack = new int[size];
   int[] tempStack = new int[size];
   
   //Store 
   for(int i=0; i<6; i++){
         myStack[i] = i;
         top++;
   }
   
   //Print in order
   for(int i=top-1; i>=0; i--){
      tempStack[tempTop] = myStack[i];
      top--; tempTop++;
   }
   System.out.println("In order");
   for(int i=tempTop-1; i>=0; i--){
      System.out.println(tempStack[i]);
      myStack[top] = tempStack[i];
      top++; tempTop--;
   }
   
   //Print in reverse
   System.out.println("In reverse");
   for(int i=top-1; i>=0; i--){
      System.out.println(myStack[i]);
      tempStack[tempTop] = myStack[i];
      top--; tempTop++;
   }
   for(int i=tempTop-1; i>=0; i--){
      myStack[top] = tempStack[i];
      top++; tempTop--;
   }
   
   //Add to stack
   System.out.println("Input what you'd like to add");
   top++;
   int input = keyboard.nextInt();
   myStack[top-1] = input;
   
   //Search & Delete
      boolean found = false;
      
      System.out.println("Enter the number you'd like to delete");
      int userInput = keyboard.nextInt();
      
      for(int i=top-1; i>=0; i--){
         if(myStack[i] == userInput){
            found = true;
            top--;
         }
         else{
            tempStack[tempTop] = myStack[i];
            top--; tempTop++;
         }
      }
      for(int i=tempTop-1; i>=0; i--){
         myStack[top] = tempStack[i];
         top++; tempTop--;
      } 
      
      if(found == true){ 
         System.out.println("\rELEMENT FOUND");  
         System.out.println("This is the array with element deleted:");
         for(int i=top-1; i>=0; i--){
            System.out.println(myStack[i]);
            tempStack[tempTop] = myStack[i];
            top--; tempTop++;
         }
         for(int i=tempTop-1; i>=0; i--){
            myStack[top] = tempStack[i];
            top++; tempTop--;
         }
      }
      else{
         System.out.println("\rELEMENT NOT FOUND");
      }
      
   //Search & Replace
   System.out.println("What element would you like to search for? ");
      int x = keyboard.nextInt();
   System.out.println("What shall it be replaced by? ");
      int replaced = keyboard.nextInt();   
      
      boolean isFound = false;
      
      for(int i=top-1; i>=0; i--){
         if(myStack[i] == x){
            isFound = true;
            myStack[i] = replaced;
            tempStack[tempTop] = myStack[i];
            top--; tempTop++;
         }
         else{
            tempStack[tempTop] = myStack[i];
            top--; tempTop++;
         }
      }
      
      for(int i=tempTop-1; i>=0; i--){
         myStack[top] = tempStack[i];
         top++; tempTop--;
      }
   
   //Product Calculate
   int product = 1;
      
      for(int i = top-1; i>=0; i--){
         product *= myStack[i];
         tempStack[tempTop] = myStack[i];
         tempTop++; top--;
      } 
      for(int i = tempTop-1; i>=0; i--){
         myStack[top] = tempStack[i];
         top++; tempTop--;
      }
      
      System.out.println("\rProduct is " + product);
      
   //Find Smallest
   int smallest = myStack[top];
      
      for(int i = top-1; i>=0; i--){
         if(myStack[i] < smallest){
            smallest = myStack[i];
         }
         tempStack[tempTop] = myStack[i];
         tempTop++; top--;
      }  
      for(int i = tempTop-1; i>=0; i--){
         myStack[top] = tempStack[i];
         top++; tempTop--;
      }
      
      System.out.println("Smallest is " + smallest);
   
   //Largest Number
      int largest = myStack[top];
      
      for(int i = top-1; i>=0; i--){
         if(myStack[i] > largest){
            largest = myStack[i];
         }
         tempStack[tempTop] = myStack[i];
         tempTop++; top--;
      }  
      for(int i = tempTop-1; i>=0; i--){
         myStack[top] = tempStack[i];
         top++; tempTop--;
      }
      
      System.out.println("Largest is " + largest);
      
   //Is full?
      if(top == size){
         System.out.println("Is full");
      }
      else{
         System.out.println("Is not full");
      }
      
   //Is empty?
      if(top == 0){
         System.out.println("Empty");
      }
      else{
         System.out.println("Not Empty");
      }
      
   //Print multiples of 5
   for(int i=top-1; i>=0; i--){
      tempStack[tempTop] = myStack[i];
      top--; tempTop++;
   }
   System.out.println("Multiples of 5:");
   for(int i=tempTop-1; i>=0; i--){
      if(tempStack[i] %5 == 0){
         System.out.println(tempStack[i]);
      }
      myStack[top] = tempStack[i];
      top++; tempTop--;
   }
   
   

  
      
   
  }
}