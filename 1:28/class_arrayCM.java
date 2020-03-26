//Carlos Mayers

import java.util.Scanner;
public class class_arrayCM{
   
   int size = 10;
   int counter = 0;
   
   int[] myArray = new int[size];
   
   Scanner keyboard = new Scanner(System.in);
   
   //Store array of odd numbers less than 30
   public void storeArray(){
      int input = 0;
      
      for(int i = 0; i<size; i++){
         input = keyboard.nextInt();
         
         if(input > 30 || input % 2 == 0){
            System.out.println("Re-input");
            input = keyboard.nextInt();
               while(input > 30 || input % 2 == 0){
                  System.out.println("Re-input");
                  input = keyboard.nextInt();
                  
               }
               myArray[i] = input;
               counter++;
         }
         else{
            myArray[i] = input;
            counter++;
         }     
      }
   }
   
   //Print array
   public void printArray(){
      for(int i=0; i<counter; i++){
         System.out.println(myArray[i]);
      }
   }
   
   //Print out all numbers that are in the range of 1-20 & increment that number by 5
   public void printArray_120_Inc5(){
      
      for(int i=0; i<counter; i++){
         if(myArray[i] >= 1 && myArray[i] <= 20){
            
            myArray[i] = myArray[i]+=5;
            System.out.println(myArray[i]);
            
         }
      }
   }
   
   //Print out all numbers over 20 but less than 30
   public void printArray_20_30(){
      int sum = 0;
      
      for(int i = 0; i<counter; i++){
         if(myArray[i] > 20 && myArray[i] < 30){
            sum += myArray[i];
            System.out.println(myArray[i]);
         }
      }
      
      System.out.println("Sum: " + sum);
   }
   
   //Add element to array
   public void addArray(){
      System.out.println("Input the element you'd like to be added to the array");
      int input = keyboard.nextInt();
      
      if(input % 2 !=0 && input < 30){
         if(counter == size){
            myArray[0] = input;
         }
         else{
            myArray[counter] = input;
         }
      }
   }
   
   //Number multiples of 3 occur
   public void numOfOccur(){
      int numOfOccur = 0;
      
      for(int i=0; i<counter; i++){
         if(myArray[i] %3 == 0){
            numOfOccur++;
         }
      }
      
      System.out.println("There are " + numOfOccur + " multiples of three.");
   }
   
   //Search and delete
   public void searchNDelete(){
      
      System.out.println("What element are you deleting?");
      int delete = keyboard.nextInt();
      int indexOf = 0;
      
      
      for(int i=0; i<counter; i++){
         if(myArray[i] == delete){
            System.out.println("Element found");
            indexOf = i;
         }
      }
      
      for(int i = indexOf; i<counter-1; i++){
         myArray[i] = myArray[i+1];
      }
      System.out.println("Element deleted");
      counter--;
      
   }
   
   //Search and Replace
   public void searchNReplace(){
      
      System.out.println("What element are you looking for?");
      int search = keyboard.nextInt();
      
      System.out.println("What element would you like it to be replaced with?");
      int replace = keyboard.nextInt();
      
      for(int i = 0; i<counter; i++){
         if(myArray[i] == search){
            System.out.println("Element found");
            myArray[i] = replace;
            System.out.println("Element replaced");
         }
      }
      
      
   }
   
   
}