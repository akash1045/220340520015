class Linkedlist
{
   Node head;
   Node temp;
   class Node
   {
     int data;
	 Node next;
	 Node(int data)
	 {
	   this.data=data;
	   next=null;
	  }
	  
	}
	
	void insertFront(int data1)
	{
	  Node newNode=new Node(data1);
	  if(head==null)
	  {
	    head=newNode;
		return;
	  }
	  newNode.next=head;
	  head=newNode;
	}
	
	void insertLast(int data2)
	{
	  Node newNode=new Node(data2);
	  {
	    if(head==null)
		{
		  head=newNode;
		  return;
		}
		  temp=head;
		  while(temp.next!=null)
		  {
		    temp=temp.next;
		  }
		  temp.next=newNode;
		  newNode.next=null;
		}
	}
	
	void reverselinklist(Node head)
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		while(prev!=null)
		{
			System.out.print(prev.data+" ");
			prev=prev.next;
		}
	}
	
	void display()
	{
	  Node n=head;
	  while(n!=null)
	  {
	    System.out.print(n.data+" ");
		n=n.next;
	  }
	  
	}
	
	public static void main(String args[])
	{
	
	  Linkedlist l1=new Linkedlist();
	  l1.insertFront(10);
	  l1.insertFront(20);
	  l1.insertFront(30);
	  l1.insertLast(40);
	  l1.insertLast(50);
	  l1.insertLast(60);
	  System.out.println("Singly linklist is:-");
	  l1.display();
	  System.out.println();
	  System.out.println("Reverse linklist is:-");
	  l1.reverselinklist(l1.head);
	}
	
}
	  
	