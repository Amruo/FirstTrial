package linkList;

public class main {

	public static void main(String[] args) {

		  LinkedList ob = new LinkedList();

	       

	        // add element to list

	        ob.addElement(new ListElement(10));
	        ob.addElement(new ListElement(20));
	        ob.addElement(new ListElement(30));
	        ob.addElement(new ListElement(40));
	        ob.addElement(new ListElement(50));

	      
	        System.out.print("List head to tail : ");

	        ob.printLinkedListHead();

	        System.out.print("List tail to head : ");

	        ob.printLinkedListTail();

	        // delete element at index = 20
	        ob.deleteElement(20);

	        System.out.print("List after deletion of element 20 is: ");
	        ob.printLinkedListHead();

	    }

	   
	}

