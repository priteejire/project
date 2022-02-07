
public class LIFO {
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
    		return (top < 0); 
	} 
	LIFO() 
	{ 
    		top = -1; 
	} 
	boolean push(int x) 
	{ 
    		if (top >= (MAX-1)) 
    		{ 
        			System.out.println("Stack Overflow"); 
        			return false; 
    		} 
    		else
    		{ 
        			a[++top] = x; 
        			System.out.println(x + " pushed into stack"); 
        			return true; 
    		} 
	} 
int pop() 
	{ 
    		if (top < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int x = a[top--]; 
        			return x; 
    		} 
	} 

	public static void main(String args[])
{
    		LIFO s = new LIFO(); 
    		s.push(90); 
    		s.push(20); 
    		s.push(40); 
    		System.out.println(s.pop() + " Popped from stack"); 
	}
} 

