package phase2;

public class main {

	public static void main(String[] args) {

		// creating an object 
		   DLList list = new DLList();
	       ListElement ob = new ListElement();
	       ob.setData(4);
	       list.addElement(ob);

	      
	       // print form head 
	       // print form tail
	       list.printLinkedListHead();
	       list.printLinkedListTail();

	       // ceating an object 
	       ListElement ob1 = new ListElement();

	       ob1.setData(15);
	       list.addElement(ob1);
	       list.printLinkedListHead();
	       list.printLinkedListTail();

	     
	       list.deleteElement(1);
	       list.printLinkedListHead();
	       list.printLinkedListTail();
	   }
	}
