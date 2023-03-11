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
	  public void addFirst(Object data){

		    Node newNode = new Node(data);

		    if(head == null){

		    head = newNode;

		    return;

		   }

		   newNode.next = head;

		   head = newNode;

		   }
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


	public static void main(String[] args) {
		linklist ll=new linklist();
		ll.addFirst(70);
		ll.addFirst(30);
		ll.addFirst(56);
		ll.printNode();

	}

}
