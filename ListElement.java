import java.util.*;

public class ListElement {

	public ListElement next;
	//private ListEl
	private int data;
	private ListElement prev;
	
	public ListElement()
	{
		this.next = null;
		this.data = 0;
		this.prev = null;
		
	}
	public ListElement(int d, ListElement n, ListElement p)
	{
		data = d;
		next = n;
		prev = p;
	}
	public void setLinkNext(ListElement n)
	{
		next = n;
	}
	public void setLinkPrev(ListElement p)
	{
		prev = p;
	}
	public ListElement getLinkNext()
	{
		return prev;
	}
	public ListElement getLinkPrev()
	{
		return prev;
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
}
class linkedlist
{
	protected ListElement start;
	protected ListElement end;
	public int size;
	public linkedlist()
	{
		start = null;
		end = null;
		size = 0;
	}
	public boolean isEmpty()
	{
		return start == null;
	}
	public int getSize()
	{
		return size;
	}
	public void insertAtStart(int val)
	{
		ListElement nptr = new ListElement(val, null, null);
		if(start == null)
		{
			start =nptr;
			end = start;
			
		}
		else 
		{
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start = nptr;
			
		}
		size++;
	}
	public void insertAtEnd(int val)
	{
		ListElement nptr = new ListElement(val, null, null);
		if(start== null)
		{
			start = nptr;
			end = start;
		}
		else 
		{
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			end =nptr;
		}
		size++;
	}
	
	
	public void insertAtPos(int val, int pos)
	{
		ListElement nptr = new ListElement(val,null,null);
		
		if(pos == 1)
		{
			insertAtStart(val);
			return;
			
		}
		ListElement ptr = start;
		for(int i = 2; i <= size; i++)
		{
			if(i== pos)
			{
				ListElement tmp=ptr.getLinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				nptr.setLinkNext(tmp);
				tmp.setLinkPrev(nptr);
			}
			ptr = ptr.getLinkNext();
		}
		size++;
	}
	
	public ListElement retrieveElement(int index)
	{
		ListElement p = null;
		if(index < this.data/2) {
			p = tmp.next;
			  for (int j = 0; j < index; j++)
	                p = p.next;
	        } else {
	            p = tmp;
	            for (int j = this.data; j > index; j--)
	                p = p.prev;
	        }
	        return p;
		}
		
	public void deleteAtPos(int pos)
	{
		if(pos == 1)
		{
			if(size == 1)
			{
				start = null;
				end = null;
				size = 0;
				return;
			}
			   start = start.getLinkNext();
	            start.setLinkPrev(null);
	            size--; 
	            return ;
	        }
	        if (pos == size)
	        {
	            end = end.getLinkPrev();
	            end.setLinkNext(null);
	            size-- ;
	        }
	        ListElement ptr = start.getLinkNext();
	        for (int i = 2; i <= size; i++)
	        {
	            if (i == pos)
	            {
	                ListElement p = ptr.getLinkPrev();
	                ListElement n = ptr.getLinkNext();
	 
	                p.setLinkNext(n);
	                n.setLinkPrev(p);
	                size-- ;
	                return;
	            }
	            ptr = ptr.getLinkNext();
	        }        
	    }    
	    /* Function to display status of list */
	    public void display()
	    {
	        System.out.print("\nDoubly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }
	        if (start.getLinkNext() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        ListElement ptr = start;
	        System.out.print(start.getData()+ " <-> ");
	        ptr = start.getLinkNext();
	        while (ptr.getLinkNext() != null)
	        {
	            System.out.print(ptr.getData()+ " <-> ");
	            ptr = ptr.getLinkNext();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
	}



