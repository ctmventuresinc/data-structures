//Carlos Mayers, 00429594, Entrepreneurship major CS minor, 3-24-20

import java.util.Scanner;

public class CM_IntNode{
   
   int data; CM_IntNode link;
   
   //Create constructor
   public CM_IntNode(int d, CM_IntNode l){
      data = d;
      link = l;
   }
   
   //No arg, so no paramters needed with driver object creation
   public CM_IntNode(){
      head = null;
   }
   
   //Initialize
   CM_IntNode head = null;
   CM_IntNode ptr = null;
   
   //Add First
   public void addFirstNode(){
      System.out.println("\rAdd First Node");
      head = new CM_IntNode(10, null);
      ptr = head;
   }
   
   //Add 2nd Node in front
   public void addNodeInfront(){
      System.out.println("\rAdd Node Infront First");
      ptr.link = new CM_IntNode(5, null);
      ptr = head;
   }
   
   //Add to end of list
   public void addToEnd(){
      System.out.println("\rAdd to End");
      while(ptr.link != null){
         ptr = ptr.link;
      }
      if(ptr.link == null){
         ptr.link = new CM_IntNode(200, null);
      }
      
      ptr = head;
   }
   
   //Add Middle
   public void addToMiddle(int x){
      System.out.println("\rAdd to Middle");
      ptr = head;
      
      while(ptr.data != x){
         ptr = ptr.link;     
      }
      
      ptr.link = new CM_IntNode(390, ptr.link);
      
      ptr = head;
   }
   
   //Print all
   public void printAll(){
      if(head == null){
         System.out.println("Empty");
      }
      else{
         while(ptr.link != null){
            System.out.println(ptr.data);
            ptr = ptr.link;
         }
         if(ptr.link == null){
            System.out.println(ptr.data);
         }
      }
   }
   
   //Remove a node
   public void deleteFrontNode(){
      ptr = head;
      
      System.out.println("\rDelete Front Node");
      
      if(head == null){
         System.out.println("Empty");
      }
      else{
         head = head.link;
      }
      
      ptr = head;
   }
   
   //Remove last node
   public void deleteLastNode(){
      ptr = head;
      
      System.out.println("\rDelete Last Node");
      
      if(head == null){
         System.out.println("Empty");
      }
      else if(head.link == null){
         head = null;
      }
      else{
         while(ptr.link.link != null){
            ptr = ptr.link;
         }
         if(ptr.link.link == null){
            ptr.link = null;
         }
      }
      ptr = head;
   }
   
   //Remove Middle
   public void deleteMiddleNode(int x){
      System.out.println("\rDelete Middle Node");
      ptr = head;
      
      if(head == null){
         System.out.println("Empty");
      }
      else if(head.data == x){
         head = head.link;
      }
      else{
         while(ptr.link.data != x){
            ptr = ptr.link;     
         }
         
         ptr.link = ptr.link.link;
      }
      ptr = head;
   }

}