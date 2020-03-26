/*
Carlos Mayers
00429594
Entrepreneurship Major
2/7/19
*/

public class DriverP1CMayers{
   public static void main (String [] args){
      
      ArrayP1_CM obj = new ArrayP1_CM();
      
      System.out.println("STORE ARRAY");
      obj.storeArray();
      System.out.println("\r");
      
      System.out.println("PRINT ARRAY");
      obj.printArray();
         System.out.println("\r");
      
      System.out.println("ADD TO ARRAY");
      obj.addToArray();
         System.out.println("re-PRINT ARRAY");
         obj.printArray();
      
      System.out.println("\r");
      System.out.println("SEARCH ARRAY");
      obj.searchArray();
         System.out.println("re-PRINT ARRAY");
         obj.printArray();
         System.out.println("\r");
         
      System.out.println("PRINT REVERSE");
      obj.printReverse();
         System.out.println("\r");
      
      System.out.println("LONGEST STRING");
      obj.longestString();
         System.out.println("\r");
      
      System.out.println("SHORTEST STRING");
      obj.shortestString();
         System.out.println("\r");
      
      System.out.println("INSERT CHAR");
      obj.insertChar();
         System.out.println("re-PRINT ARRAY now with inserted characters");
         obj.printArray();
         System.out.println("\r");
         
      System.out.println("IS ARRAY EMPTY");
      obj.isArrayEmpty();
         System.out.println("\r");
      
      System.out.println("IS ARRAY FULL");
      obj.isArrayFull();
      
   }
}