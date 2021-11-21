package com.bridgeit;

class LinkedListMain {

	public static void main(String[] args) {

	        
	     LinkedList list = new LinkedList();
			list.addFirstElement(56);
			list.appendElement(70);
			list.display();
			list.insertInBetween(2, 30);
			list.display();
			list.deleteFirstElement();
			list.display();
	}

}
