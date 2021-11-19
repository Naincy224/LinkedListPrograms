package com.bridgeit;
public class LinkedList {
 
    private Node currentHead = null;
    private Node head=null;
    
    public boolean isEmpty() {
        return (currentHead == null);
    }
    
   
    public void addElement(int data) {
    	
    	if(!isEmpty()) {
    		Node newNode = new Node(data);
    		currentHead.setNext(newNode);
    		currentHead = newNode;
    	}
    	else {
    		 Node newNode = new Node(data);
    		 currentHead = newNode;
    		 head=newNode;
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