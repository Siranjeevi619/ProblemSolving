//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 
System.out.println("~");
}
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	void push(int x)
	{
	    // Your code here
	    if ((rear + 1) % arr.length == front) { 
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        rear = (rear + 1) % arr.length; 
        arr[rear] = x;
	} 

	int pop()
	{
	if (front == -1) { 
            return -1;
        }
        int item = arr[front]; 
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        return item;
	} 
}




