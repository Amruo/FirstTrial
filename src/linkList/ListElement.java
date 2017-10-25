/**
 * This program demonstrates the functionality of a Double Linked List, the program does
 * different operation such as add a node, retrieve a node or deleting the node, also can print form one side 
 * head or tail as sigle link list. the program consist of 3 classes, first class is for the element list, second
 * class is for the double link list and the last one is to test the program, first class called ListElement which 
 * contain constructor and setter and getter method to get the element and 3 varilbles
 * 
 * @author Amruo
 *
 */

package linkList;

public class ListElement {
	
	     // varibles used with the link list
	     ListElement next;
	     ListElement previous;
	     int data;
	     
	    // constructor
	    ListElement()

	    {

	        // Initialize the attributes
	        this.data = 0;
	        this.next = null;
	        this.previous = null ;
	    }

	    ListElement(int data)

	    {

	        // Initialize the attributes
	        this.data = data;
	        this.next = null;
	        this.previous = null ;
	    }


	    // method to set data
	    public void setData(int data)
	    {
	        this.data = data;
	    }

	    
	    // method to set data
	    public int getData()

	    {
	        return this.data ;
	    }

	    
	    // method to set data
	    public void setNext(ListElement next)

	    {
	        this.next = next;
	    }

	    
	    // method to get next
	    public ListElement getNext()
	    {
	        return this.next;
	    }

	    // method to set previous
	    public void setPrevious(ListElement previous)
	    {
	        this.previous = previous;
	    }

	    // method to get previous
	    public ListElement getPrevious()
	    {
	        return this.previous;
	    }
	}

