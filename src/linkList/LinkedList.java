package linkList;

public class LinkedList {

	    ListElement front;
	    ListElement back;
	    int size;

	    LinkedList()
	    {
	        front = null;
	        back = null;
	        size = 0;
	    }

	   

	    public void addElement(ListElement le)
	    {

	        ListElement temp = new ListElement(le.getData());
	        temp.setNext(front);

	        if(front != null)
	         front.setPrevious(temp);
	        
	        front = temp;
	        
	        if(back == null)
	            back = temp;

	        size++;
	    }

	    public ListElement getElement(int index)

	    {
	        if (index < 0 || index >= size)
	            throw new IndexOutOfBoundsException("invalid position");
	        else

	        {
	            int i;

	            ListElement trav = front;

	           // go to index th node
	            for( i = 1 ; i < index ; i++ )

	                // go to next node
	                trav = trav.getNext();

	            // return node
	            return trav;
	        }

	    }

	  
	    public ListElement deleteElement(int index)

	    {
	        if (index < 0 || index >= size)

	            throw new IndexOutOfBoundsException("invalid position");

	        else

	        {  
	            if(index == 0)

	            {

	                ListElement ans = front;
	                front = front.getNext();
  

	                if(front != null)

	                front.setPrevious(null);
	                size--;

	                return ans;
	            }
	            
	            ListElement trav = front;

	            int i;

	            for(i = 1 ; i < index ; i++)

	                trav = trav.getNext();

	            ListElement ans = trav.getNext();
	            trav.setNext(trav.getNext().getNext());

	            if(trav.getNext() != null)

	             trav.getNext().setPrevious(trav);
	             size--;	           
	             
	            return ans;

	        }

	    }

	    public void printLinkedListHead()

	    {

	        ListElement trav = front;

	       

	        // iterate the list backward

	        while(trav != null)

	        {

	            // print the node

	            // get its value using getData() function

	            System.out.print(trav.getData() + " ");

	           

	            // go to previous node

	            // get the previous using getPrevious() function

	            trav = trav.getNext();

	        }
	        System.out.println();
	    }

	    public void printLinkedListTail()

	    {

	        ListElement trav = back;

	        // iterate the list backward

	        while(trav != null)

	        {

	            // print the node
	            // get its value using getData() function
	            System.out.print(trav.getData() + " ");
	         
	            // go to previous node
	            // get the previous using getPrevious() function
	            trav = trav.getPrevious();
	        }

	        System.out.println();

	    }
	
}
