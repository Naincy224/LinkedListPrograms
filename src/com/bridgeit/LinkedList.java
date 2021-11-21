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
    
    public void deleteFirstElement() {
    	int count=countElementInLinkedList() ;
    	if(count==0) {
    		System.out.println("List is empty");
    	}
    	else if(count==1){
    		head=null;
    	}
    	else {
    		head= head.getNext();
    	}
    	
    }
    
    public void deleteLastElement() {
    	int count=countElementInLinkedList() ;
    	if(count==0) {
    		System.out.println("List is empty");
    	}
    	else if(count==1){
    		head=null;
    	}
    	else {
    		 Node tempHead=head;
    		 int x=1;
    	        while (x < count)  
    	        {  
    	        	head = head.getNext();  
    	        	x++;
    	        }
    	        head.setNext(null);
    	        head=tempHead;
    	}
    	

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
    
    
    public void insertInBetween(int place, int data) {
    	int count=countElementInLinkedList() ;
		
    	if(place < 1 || count==0) {
			System.out.println("List is empty/Invalid position to add element");
			return;
		}
		
		if(place == 1) {
			addFirstElement(data);
		}
		else {
			Node node = new Node(data);
			Node tempHead=head;
			
			while(count < place) {
				tempHead = tempHead.getNext();
				count++;
			}
			
			Node current = tempHead.getNext();
			tempHead.setNext(node);
			node.setNext(current);
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
    
    public int countElementInLinkedList()  
    {  
    	int count=0;
        Node start = head;  
        while (start != null)  
        {  start = start.getNext();
           count=count+1;
        }
        return count;  
    }
}