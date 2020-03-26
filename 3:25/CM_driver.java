//Carlos Mayers, 00429594, Entrepreneurship major CS minor, 3-24-20

import java.util.Scanner;

public class CM_driver{

   public static void main (String [] args){
      
      CM_IntNode object = new CM_IntNode();
      
      object.addFirstNode();
      object.printAll();
      
      object.addNodeInfront();
      object.printAll();
      
      object.addToEnd();
      object.printAll();
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\rEnter the data value you would like 390 to be added after");
      
      int input = keyboard.nextInt();
      
      object.addToMiddle(input);
      object.printAll();
      
      object.deleteFrontNode();
      object.printAll();
      
      object.deleteLastNode();
      object.printAll();
      
      System.out.println("\rEnter the data value node you would like deleted");
      
      int input2 = keyboard.nextInt();

      
      object.deleteMiddleNode(input2);
      object.printAll();
   }
   
}