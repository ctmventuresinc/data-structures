/*
Carlos Mayers
00429594
Entrepreneurship Major
2/7/19
*/

import java.util.Scanner;

public class ArrayP1_CM{
   //Initialize variables
   int size = 15;
   int counter = 0;
   
   //Create array
   String[] myArray = new String[size];
   
   //Create scanner
   Scanner keyboard = new Scanner(System.in);
   
   //Store array
   /*
   Only add to structure if 4th character is "M"
   */
   public void storeArray(){
      String input;
      
      //Store 8 elements
      for(int i = 0; i<8; i++){
         
         //Read user input
         System.out.println("Input for element " + i + ":");
         input = keyboard.nextLine();
         
         if(input.length() < 3){
            System.out.println("Too little characters, Re-input for element " + i + ":");
            input = keyboard.nextLine();
               while(input.length() < 3){
                  System.out.println("Too little characters, Re-input for element " + i + ":");
                  input = keyboard.nextLine();    
               }
         }
         
         //If what the user entered has a 4th character that IS NOT "M", force re input
         if(input.charAt(3) != 'M'){
            System.out.println("4th character of your input was not M, Re-input for element " + i + ":");
            input = keyboard.nextLine();
            
               //Create loop if re input is also incorrect, loop until condition is correct
               while(input.charAt(3) != 'M'){
                  System.out.println("4th character of your input was not M, Re-input for element " + i + ":");
                  input = keyboard.nextLine();    
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
         System.out.println("Element " + i + ":" + myArray[i]);
      }
   }
   
   //Add to array
   /*
   this method will add 1 element that you pass in from the driver
   your method will check to see if an element can be added; is it full
   and is the 4th character the same character as the first character of your last name
   You will keep asking the user for another element until you get the correct string.
   */
   public void addToArray(){
      //Ask user to input their first element
      System.out.println("Enter your element");
      String input = keyboard.nextLine();
      
      //If the input doesn't match our requirements there's not even a purpose to check if arrays full
      if(input.length() < 3){
            System.out.println("Too little characters, Re-input:");
            input = keyboard.nextLine();
               //Continue looping till our condition is true
               while(input.length() < 3){
                  System.out.println("Too little characters, Re-input:");
                  input = keyboard.nextLine();    
               }
      }
      
      //Now check for "M" in 4th character
      if(input.charAt(3) == 'M'){
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
         System.out.println("4th character of your input was not M, Re-input:");
         String reInput = keyboard.nextLine();
         
         //Continue looping till our condition is true
         while(reInput.charAt(3) != 'M'){
            System.out.println("4th character of your input was not M, Re-input:");
            reInput = keyboard.nextLine();
         }
         
         //Same as in the if above
         if(counter == size){
            System.out.println("Array full");
         }
         //If there's space, increase counter, then set the space underneath it to your new element
         else{
            counter++;
            myArray[counter - 1] = reInput;
         }
      }   
   }
   
   //Search the array
   /*this method will search the array for the passed in element; this method returns a boolean*/
   public boolean searchArray(){    
      System.out.println("What element are you looking for?");
      
      //Save what's being search for in a variable, and create a found variable and set to false
      String search = keyboard.nextLine();
      boolean found = false;
      
      //Loop through the array, if search is found return true and print out found
      for(int i = 0; i<counter; i++){
         if( (myArray[i]).compareTo(search) == 0 ){
            System.out.println("Element found");
            found = true;
         }
      }
      
      //Letting user know if their search was not successful, our found bool helps us with this
      if(found == false){
         System.out.println("Element not found");
      }
      return found;    
   }
   
   //Print reverse
   public void printReverse(){
      for(int i=counter-1; i>0; i--){
         System.out.println("Element " + i + ":" + myArray[i]);
      }
   }
   
   //Longest String
   /* print out the longest string in the array */
   public void longestString(){
      
      //Our first comparison will be to our first element, so create a variable for it
      //We will also be tracking the index so create a variable for that
      int longest = myArray[0].length();
      int indexOfLongest = 0;
      
      //Start loop with the next element, and go to the end
      for(int i=1; i<counter; i++){
         //Compare to see if larger than currently longest 
         if(myArray[i].length() > longest){
            //If so, crown our new longest
            longest = myArray[i].length();
            indexOfLongest = i;
         }
      }
      //Print out results
      System.out.println("The longest string is " + myArray[indexOfLongest] + " which has " + longest + " elements.");
   }
   
   //Shortest String
   /* print out the smallest string in the array */
   public void shortestString(){
      //Our first comparison will be to our first element, so create a variable for it
      //We will also be tracking the index so create a variable for that
      int shortest = myArray[0].length();
      int indexOfShortest = 0;
      
      //Start loop with the next element, and go to the end
      for(int i=1; i<counter; i++){
         //Compare to see if shorter than currently smallest
         if(myArray[i].length() < shortest){
            //If so, crown our new shortets
            shortest = myArray[i].length();
            indexOfShortest = i;
         }
      }
      //Print out results
      System.out.println("The shortest string is " + myArray[indexOfShortest] + " which has " + shortest + " elements.");
   }
   
   //Insert character
   /* insert a character to each string in the array */
   public void insertChar(){
      //Run thru the array and set every index equal to itself plus a character
      for(int i=0; i<counter; i++){
         myArray[i] = "Z" + myArray[i];
      }
   }
   
   //Is array empty
   /*returns true if empty; false if not*/
   public boolean isArrayEmpty(){
      //Not much explaining to be done here
      if(counter == 0){
         System.out.println("Array is empty");
         return true;
      }
      else{
         System.out.println("Array is not empty");
         return false;
      }
   }
   
   //Is array full
   /*returns true if full; false if not*/
   public boolean isArrayFull(){
      //Same here
      if(counter == size){
         System.out.println("Array is full");
         return true;
      }
      else{
         System.out.println("Array is not full");
         return false;
      }
   }
   
   
}