class Sort
{
   void insertionsort(int arr[],int n)
   {
      for(int i=0;i<n;i++)
	  {
	    int data=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>data)
		{
		  arr[j+1]=arr[j];
		  j=j-1;
		}
		arr[j+1]=data;
	  }
	  
	}
	
	void display(int arr[],int n)
	{
	  for(int i=0;i<n;i++)
	  {
	    System.out.print(arr[i]+" ");
	  }
	  
	}
	
}

class Demo
{
  public static void main(String args[])
  {
    Sort s1=new Sort();
    int arr[]={2,4,6,8,3};
	int n=arr.length;
	s1.insertionsort(arr,n);
	System.out.println("Sorted array using insertion sort is:");
	s1.display(arr,n);
  }
  
}
	