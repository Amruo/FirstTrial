package phase2;


// DLList mean double link list 
public class DLList {

	   private ListElement head;
	   
	   public DLList() {
	       head = null;
	   }

	   
	   // add new node at head
	   public void addElement(ListElement le) {

	       le.setNext(head);
	       
	       if(head != null) {
	           head.setPrevious(le);
	       }
	       head = le;
	   }

	   public ListElement getElement(int index) {
	       if(head == null || index < 0)
	           return null;
	       
	       int count = 0;
	       ListElement temp = head;

	       while(temp != null && index <= count) {

	           if(index == count)

	           return temp;
	           count++;
	           temp =temp.getNext();

	       }

	       return null; // index is greater than totla element

	   }

	   public ListElement deleteElement(int index) {

	       if(head == null || index < 0)
	           return null;

	       if(index == 0) {

	           ListElement t = head;
	           head = head.getNext();
	           head.setPrevious(null);

	           return t;

	       }

	       int count = 0;
	       ListElement temp = head;
	       
	       while(temp != null && count < index) {
	           count++;
	           temp =temp.getNext();      

	       }

	       if(temp == null)// index is greater than totla element

	           return null;

	       temp.getPrevious().setNext(temp.getNext()); // setting next of previous of temp to next of temp

	       // setting previous of next of temp to previous of temp

	       if(temp.getNext() != null) {
	    	   
	           temp.getNext().setPrevious(temp.getPrevious());
	       }

	       return temp;

	   }

	   public void printLinkedListTail() {

	       if(head == null)
	           return;
	       
	       ListElement t = head;

	       // reaching to last element
	       while(t.getNext() != null)

	           t = t.getNext();

	       // printing from last
	       while(t != null) {

	           System.out.print(t.getData()+" ");
	           t = t.getPrevious();
	       }

	       System.out.println();
	   }

	   public void printLinkedListHead() {

	       if(head == null)
	           return;
	       
	       ListElement t = head;  

	       // reaching to last element
	       while(t != null){

	           System.out.print(t.getData()+" ");
	           t = t.getNext();

	       }
	       System.out.println();
	   }
	}