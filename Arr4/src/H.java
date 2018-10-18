import java.util.*;

public class H {

public static void main(String[] args){	
	
int total_num;

int[] numbers=new int []{1,2,3,4,6,7};

total_num=7;

int exp=total_num*((total_num+1)/2);
int num_sum=0;
for(int i:numbers){
	
	num_sum +=i;
	
}

System.out.println(exp-num_sum);
	
}
}
