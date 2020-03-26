/* 2-20-2020
1.
Array structure size 10
Named arrayStack

2.
store 5 elements

3.
print them out

4.
move all even numbers to stack even

move all odd numbers to stack odd

5.
find largest even
find smallest oddd
*/

public class stack_CMayers{
   public static void main (String [] args){
      
      //1
      int size = 10;  int top = 0;
      int[] arrayStack = new int[size];
      
      //2
      for(int i=0; i<5; i++){
         arrayStack[i] = i;
         top++;
      }
      
      //3
      System.out.println("\rPrint Stack");
      int tempTop = 0;
      int[] tempStack = new int[size];
      
      for(int i=top-1; i>=0; i--){
         System.out.println(arrayStack[i]);
         
         tempStack[tempTop] = arrayStack[i];
         top--; tempTop++;
      }
      for(int i=tempTop-1; i>=0; i--){
         arrayStack[top] = tempStack[i];
         top++; tempTop--;
      }
      
      //4
      int oddTop = 0;
      int evenTop = 0;
      
      int[] stackEven = new int[size];
      int[] stackOdd = new int[size];
      
      for(int i=top-1; i>=0; i--){
         //if odd
         if(arrayStack[i] %2 != 0){
            stackOdd[oddTop] = arrayStack[i];
            oddTop++; top--;
         }
         else if(arrayStack[i] %2 == 0){
            stackEven[evenTop] = arrayStack[i];
            evenTop++; top--;
         }
      }
      
      //5
      //Find largest even
      int largest = stackEven[0];
      int[] tempStackEven = new int[size];
      int tempEvenTop = 0;
      
      for(int i=evenTop-1; i>=0; i--){
         if(stackEven[i] > largest){
            largest = stackEven[i];
            tempStackEven[tempEvenTop] = stackEven[i];
            tempEvenTop++; evenTop--;
         }
         else{
            tempStackEven[tempEvenTop] = stackEven[i];
            tempEvenTop++; evenTop--;
         }
      }
      System.out.println("\rLargest is " + largest);
      
      for(int i=tempEvenTop-1; i>=0; i--){
         stackEven[evenTop] = tempStackEven[i];
         tempEvenTop--; evenTop++;
      }
      
      //Find smallest odd
      int smallest = stackOdd[0];
      int[] tempStackOdd = new int[size];
      int tempOddTop = 0;
      
      for(int i=oddTop-1; i>=0; i--){
         if(stackOdd[i] < smallest){
            smallest = stackOdd[i];
            tempStackOdd[tempOddTop] = stackOdd[i];
            tempOddTop++; oddTop--;
         }
         else{
            tempStackOdd[tempOddTop] = stackOdd[i];
            tempOddTop++; oddTop--;
         }
      }
      System.out.println("\rSmallest is " + smallest);
      
      for(int i=tempOddTop-1; i>=0; i--){
         stackOdd[oddTop] = tempStackOdd[i];
         tempOddTop--; oddTop++;
      }
       
   }
}