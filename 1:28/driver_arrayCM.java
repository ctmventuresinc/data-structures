//Carlos Mayers

public class driver_arrayCM{
   public static void main (String [] args){
      
      class_arrayCM obj = new class_arrayCM();
      
      System.out.println("- Store your array with odd numbers less than 30");
      obj.storeArray();
      
      System.out.println("- Regular array printed.");
      obj.printArray();
      
      System.out.println("- Array in range of 1-20, with increments of 5.");
      obj.printArray_120_Inc5();
      
      System.out.println("- Array number over 20 but less than 30.  With sum.");
      obj.printArray_20_30();
      
      System.out.println("- Number of times multiples of 3 occur in the array.");
      obj.numOfOccur();
      
      //Quick Refresh
      
      System.out.println("- Before continuing this is how the array stands");
      
      obj.printArray();
      
      System.out.println("- Search & Delete");
      obj.searchNDelete();
      obj.printArray();
      
      System.out.println("- Search & Replace");
      obj.searchNReplace();
      obj.printArray();
   }
}