/*
Carlos Mayers
00429594
Entrepreneurship major
1/29/19
*/

import java.util.Scanner;
public class class_arrayCM{
   
   //Initialize variables
   int size = 10;
   int counter = 0;
   
   //Create array
   int[] myArray = new int[size];
   
   //Create scanner
   Scanner keyboard = new Scanner(System.in);
   
   //Store array of odd numbers less than 30
   public void storeArray(){
      int input = 0;
      //Idk how many we were supposed to store? I put 8
      for(int i = 0; i<8; i++){
         //Read user input
         input = keyboard.nextInt();
         
         //If what the user entered is over 30 or odd, force re input
         if(input > 30 || input % 2 == 0){
            System.out.println("Re-input");
            input = keyboard.nextInt();
               //Create loop if re input is also incorrect, loop until ends condition
               while(input > 30 || input % 2 == 0){
                  System.out.println("Re-input");
                  input = keyboard.nextInt();
                  
               }
               //If you got out the loop, its good.  Store the element & increment your counter.
               myArray[i] = input;
               counter++;
         }
         else{
            //Fits the requirement, just save and increment counter
            myArray[i] = input;
            counter++;
         }     
      }
   }
   
   //Print array
   public void printArray(){
      for(int i=0; i<counter; i++){
         //Doesn't get simpler then this
         System.out.println(myArray[i]);
      }
   }
   
   //Print out all numbers that are in the range of 1-20 & increment that number by 5
   public void printArray_120_Inc5(){
      for(int i=0; i<counter; i++){
         //If the element is within 1-20 range, save and increment it by 5
         if(myArray[i] >= 1 && myArray[i] <= 20){

            myArray[i] = myArray[i]+=5;
            System.out.println(myArray[i]);
            
         }
      }
   }
   
   //Print out all numbers over 20 but less than 30
   public void printArray_20_30(){
      for(int i = 0; i<counter; i++){
         //If the element is in the 20-30 range, print it
         if(myArray[i] > 20 && myArray[i] < 30){
         
            System.out.println(myArray[i]);
            
         }
      }
   }
   
   //Print sum
   public void printSum(){
      int sum = 0;
      
      for(int i = 0; i<counter; i++){
         //Add all elements to sum
         sum += myArray[i];
      }
      
      System.out.println("Sum (OF REGULAR ARRAY, refer to top): " + sum);
   }
   
   //Print average
   public void printAvg(){
      int avg = 0;
      int sum = 0;//was going to use sum from "printSum" but printAvg could be called before it in some scenario
      
      for(int i = 0; i<counter; i++){
         sum += myArray[i];
      }
      
      //This is how you calculate average
      avg = sum / counter;
      
      System.out.println("Avg (OF REGULAR ARRAY, refer to top): " + avg);
   }
   
   //Add element to array
   public void addElement(){
      System.out.println("Input the element you'd like to be added to the array (Must be odd and under 30)");
      int input = keyboard.nextInt();
      
      //If the input doesn't match our requirements there's not even a purpose to check if arrays full
      if(input % 2 !=0 && input < 30){
         //Check if full
         if(counter == size){
            System.out.println("Array full");
         }
         //If there's space, increase counter, then set the space underneath it to your new element
         else{
            counter++;
            myArray[counter - 1] = input;
         }
      }
      else{
         //Re input code taken from my "storeArray" method
         System.out.println("Your element was either even or over 30.  Please re-input");
         int reInput = keyboard.nextInt();
         
         while(reInput % 2 == 0 || reInput > 30){
            System.out.println("Your element was either even or over 30.  Please re-input");
            reInput = keyboard.nextInt();
         }
         
         //Same as in the if above
         if(counter == size){
            System.out.println("Array full");
         }
         else{
            counter++;
            myArray[counter - 1] = reInput;
         }
      }   
   }
   
   //Number multiples of 3 occur
   public void numOfOccur(){
      int numOfOccur = 0;
      
      //No explanation necessary
      for(int i=0; i<counter; i++){
         if(myArray[i] %3 == 0){
            numOfOccur++;
         }
      }
      
      System.out.println("There are " + numOfOccur + " multiples of three.");
   }
   
   //Search and delete CARLOS (Works)
   public void searchNDelete(){
      
      System.out.println("What element are you deleting?");
      int delete = keyboard.nextInt();
      
      int indexOf = 0;
      boolean found = false;
      
      if(counter == 0){
         System.out.println("Array empty");
      }
      else{
         //Goes through whole loop to find element to delete, continues even after found
         for(int i=0; i<counter; i++){
            if(myArray[i] == delete){
               System.out.println("Element found");
               
               //Hold the index so we know where to start
               indexOf = i; 
               
               found = true;
               //^ Will be necessary in our if statement
            }
         }
         
         if(found == false){
            System.out.println("Not found");
         }
         else if(found == true){
         
            //Begin at the element to be deleted, and simply overwrite it with the element above.
            //Repeat until one below counter.
            for(int i = indexOf; i<counter-1; i++){
               myArray[i] = myArray[i+1];
            }
            System.out.println("Element deleted");
            counter--; 
         }     
      }
       
   }
   
   //Search and delete AZARIAH (Sorta works)
   /*
   public void searchNDelete_Azariah(){
      //my addition
      System.out.println("What element are you deleting?");
      int delete = keyboard.nextInt();
      
      if(counter == 0){
         System.out.println("List Empty");
      }
      for(int i=0; i<counter; i++){
         if(myArray[i] == delete){
            for(int j=i; j<counter; j++){
               myArray[j] = j+1;
            }
            counter--;
         }
         else{
            System.out.println("Not found");
         }
      }
   }
   */
   
   //Search and delete CHRISTIAN (Does Not Work)
   /*
   public void searchNReplace_Christian(){
      //my addition
      System.out.println("What element are you deleting?");
      int delete = keyboard.nextInt();
      
      if(counter!=0){
         for(int i=0; i<size; i++){
            if(myArray[i] == delete){
               counter--;
               for(int j=i; j<counter; j--){
                  myArray[j] == myArray[j+1];
               }
            }
            else{
               count++;
            }
         }
      }
   }
   */
   
   //Search and Replace
      //Only problem is if there are multiple of the same element, it will only delete last
   public void searchNReplace(){    
      System.out.println("What element are you looking for?");
      int search = keyboard.nextInt();
      
      System.out.println("What element would you like it to be replaced with?");
      int replace = keyboard.nextInt();
      
      //Simple
      for(int i = 0; i<counter; i++){
         if(myArray[i] == search){
            System.out.println("Element found");
            myArray[i] = replace;
            System.out.println("Element replaced");
         }
      }    
   }
   
   int size2 = 10;
   int counter2 = 0;
   
   int[] myArray2 = new int[10];
   
   //Store elements in the new array
   public void storeNewArray(){
      System.out.println("Enter 8 elements for your new array:");
      
      for(int i=0; i<8; i++){
         myArray2[i] = keyboard.nextInt();
      }
   }
   
   //Compare the two arrays
   public void compareTwoArrays(){
      //Innocent until proven guilty
      boolean same = true;
      
      //First check if they have the same size & amount of elements
      if(size == size2 && counter == counter2){
         
         //Start loop through both arrays and try and prove our same boolean false
         //If the element at ones index isn't the same as anothers, automatically no longer the same
         for(int i=0; i<counter; i++){
            if(myArray[i] != myArray2[i]){
               same = false;
            }
         }
         
         //Print statements
         if(same == true){
            System.out.println("Arrays are same");
         }
         else{
            System.out.println("Arrays are different");
         }
      }    
      else{
         System.out.println("Can't be compared, different sizes.");
      }
   }
   
}