package com.bridgeit;
public class LinkedList {
 
    private Node currentHead = null;
    private Node head=null;
    
    public boolean isEmpty() {
        return (currentHead == null);
    }
    
   
    public void addFirstElement(int data) {
    		 Node newNode = new Node(data);
    		 currentHead = newNode;
    		 head=newNode;

    }
    
    
    public void appendElement(int data) {
    	
    	if(!isEmpty()) {
    		Node newNode = new Node(data);
    		currentHead.setNext(newNode);
    		currentHead = newNode;
    	}
    	else {
    		System.out.println("The list is empty, please add first the element to the list using addFirstElement(int data) method");

    	}
    	
    }
    
    public void display()  
    {  
        Node start = head;  
        while (start != null)  
        {  
        	start.printNodeData();  
        	start = start.getNext();  
        }  
    
    }
}