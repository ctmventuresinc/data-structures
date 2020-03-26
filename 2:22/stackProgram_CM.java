import java.util.Scanner;

/*
1) store into stack 
2) add to stack
3) print out the stack
4) delete from the stack
5) search for an element
*/
public class stackProgram_CM{
   public static void main (String [] args){
   
      Scanner keyboard = new Scanner(System.in);
      
      int size = 10;  int top = 0;
      int[] myStack = new int[size];
      
      //1) Store stack
      for(int i=0; i<5; i++){
         myStack[i] = i;
         top++;
      }
      
      //2) Add to stack
      System.out.println("Input what you'd like to add");
      top++;
      int input = keyboard.nextInt();
      myStack[top-1] = input;
      
      //3) Print out new stack
      int tempTop = 0;
      int[] tempStack = new int[size];
      
      for(int i=top-1; i>=0; i--){
         tempStack[tempTop] = myStack[i];
         top--; tempTop++;
      }
      
      for(int i=tempTop-1; i>=0; i--){
         System.out.println(myStack[top]);
         myStack[top] = tempStack[i];
         top++; tempTop--;
      }
      
      //4) Delete from stack
      top--;
      System.out.println("Stacks top element deleted.");
      
      //5) Search
      System.out.println("What element would you like to search for? ");
      int x = keyboard.nextInt();
      
      boolean found = false;
      
      for(int i=top-1; i>=0; i--){
         if(myStack[i] == x){
            found = true;
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
      
      if(found == true){
         System.out.println("Element " + x + " found!");
      }
      else{
         System.out.println("Element " + x + " NOT found.");
      }
      
      
      
   }
}