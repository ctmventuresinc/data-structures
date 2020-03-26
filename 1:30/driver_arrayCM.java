/*
Carlos Mayers
00429594
Entrepreneurship major
1/29/19
*/

public class driver_arrayCM{
   public static void main (String [] args){
      
      class_arrayCM obj = new class_arrayCM();
      
      System.out.println("- Store your array with odd numbers less than 30");
      obj.storeArray();
      
      System.out.println("- Regular array printed.");
      obj.printArray();
      
      System.out.println("- Array in range of 1-20, with increments of 5.");
      obj.printArray_120_Inc5();
      
      System.out.println("- Array number over 20 but less than 30");
      obj.printArray_20_30();
      System.out.println("\r");
      
      System.out.println("- Array sum");
      obj.printSum();
      System.out.println("\r");
      
      System.out.println("- Array avg");
      obj.printAvg();
      System.out.println("\r");
      
      System.out.println("- Number of times multiples of 3 occur in the array.");
      obj.numOfOccur();
      System.out.println("\r");
      
      System.out.println("- Add element");
      obj.addElement();
      
      //Quick Refresh
      
      System.out.println("- Before continuing this is how the array stands");
      
      obj.printArray();
      
      System.out.println("- Search & Delete");
      obj.searchNDelete();
      obj.printArray();
      
      /* Prints not found too much
      System.out.println("- Search & Delete Azariah");
      obj.searchNDelete_Azariah();
      obj.printArray();
      */
      
      /*DOES NOT WORK
      System.out.println("- Search & Replace Christian");
      obj.searchNReplace_Christian();
      obj.printArray();
      */
      
      System.out.println("- Store new array");
      obj.storeNewArray();
      
      System.out.println("- Compare the arrays");
      obj.compareTwoArrays();
      
   }
}