
import java.util.*;

public class Hi {
	
	
public static void main(String[] args){
	
	int a[]={1,2};
	int b[]={3,4};
	int c[]=new int [a.length+b.length];
	int count=0;
	
	for(int i=0; i<a.length;i++){
		
		c[i]=a[i];
		
		count++;
		
	}
	
	for(int j=0; j<b.length;j++){
		
		c[count++]=b[j];
		
		
	}
	
	for(int i=0;i<c.length;i++){
		
		System.out.println(c[i]);
		
	}
	
	
	
	
	
	
}
	

}
