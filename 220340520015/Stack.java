class Stack
{
  int size=10;
  int arr[]=new int[size];
  int Top1,Top2;
    Stack()
	{
	  Top1=(size/2)+1;
	  Top2=size/2;
	}
	
	void push1(int x)
	{
	 if(Top1>0)
	 {
	   Top1--;
	   arr[Top1]=x;
	  }
	  else
	  {
	    System.out.println("Stack Overflow");
		return;
	  }
	  }
	  void push2(int x)
	  {
	    if(Top2<size-1)
		{
		  Top2++;
		  arr[Top2]=x;
		}
		else
		{
		  System.out.println("Stack overflow");
		  return;
		}
		
	}
	
	int pop1()
	{
	  if(Top1<=size/2)
	  {
	    int x=arr[Top1];
		Top1++;
		return x;
	  }
	  else
	  {
	    System.out.println("Stack Underflow");
		System.exit(1);
	  }
	  return 0;
	}
	
	int pop2()
	{
	   if(Top2>size/2+1)
	   {
	     int x=arr[Top2];
		 Top2--;
		 return x;
		}
		else
		{
		  System.out.println("Stack Underflow");
		 System.exit(1);
		}
		return 0;
    }
}	

class Demo{
	public static void main(String args[])
	{
	  Stack s1=new Stack();
	  s1.push1(5);
	  s1.push2(10);
	  s1.push2(15);
	  s1.push1(11);
	  s1.push2(7);
	  s1.push2(40);
	  System.out.println("Popped element from stack is  "+s1.pop1());
	  System.out.println("popped element from stack is "+s1.pop2());
	}
	
	
}
	
	