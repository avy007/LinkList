package com.linklist;
public class linklist {
		
Node head;
	
	class Node{		
		Object data;
		Node next;
		
		Node (Object data){
			this.data=data;
			this.next=null;		
		}
	}
	// add first
	  public void addFirst(Object data){

		    Node newNode = new Node(data);
		    if(head == null){
		    head = newNode;
		    return;
		   }
		   newNode.next = head;
		   head = newNode;
		   }
	  
	  //print
		   public void printNode(){
		    if(head==null){
		       System.out.println("Linked list is empty...");
		       return;
		   }
		    Node tempNode = head;
		    while(tempNode != null){
		    System.out.print(tempNode.data + "=>");
		    tempNode = tempNode.next;
		   }
		    System.out.println("null");
		   }  
		   
      // add last
		   public void addLast(Object data) {
		       Node newNode = new Node(data);
		        if(head==null){
		           System.out.println("Linked list is empty...");
		           return;
		           }
		        Node tempNode = head;
		        while(tempNode.next != null){
		        tempNode = tempNode.next;
		       }
		        tempNode.next=newNode;    
		   }
		   //delete first
		   public void  deletefirst() {
			   
			   if(head==null) {
				   System.out.println("list is empty");
				   return;
			   }	 
			   head =head.next; 
		   }


	public static void main(String[] args) {
		linklist ll=new linklist();
		ll.addFirst(30);
		ll.addFirst(56);
		ll.addLast(70);
		ll.printNode();
		ll.deletefirst();
		ll.printNode();

	}

}
