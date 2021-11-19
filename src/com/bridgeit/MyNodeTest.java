package com.bridgeit;

class MyNodeTest {
    private static Node head=null;
	public static void main(String[] args) {

		Node n1= new Node(56);
		head=n1;
		Node n2= new Node(30);
		Node n3=new Node(70);
		n1.setNext(n2);
		n2.setNext(n3);
		
		System.out.println("Nodes of Linklist:");
		 	Node start = head;  
	        while (start != null)  
	        {  	
	        	start.printNodeData();  
	        	start = start.getNext();  
	        }  
		
	}

}
