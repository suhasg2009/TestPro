
import java.util.*;

public class Helo {

	
	
	
public static void main(String[] args)

{
	
	
	int a[]={1,2,3,4,4,5};
	
	int k=0;
	int v=a[0];
	
	for(int i=0;i<a.length;i++){
		
	k+=a[i];	
	if(a[i]>v)	v=a[i];
		
	
	}
	

	System.out.println("greater nu is:"+v);

	System.out.println("sum is"+k);
	
	
	
}	
}
