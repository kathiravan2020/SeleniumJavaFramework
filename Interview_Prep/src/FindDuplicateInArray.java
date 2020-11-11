import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateInArray {

	public static void main(String[] args) {      
        
       /* //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7,7, 8, 8, 3};   
          
        System.out.println("Total elements in the array "+arr.length);
       
        System.out.println("Array elements are: "+ Arrays.toString(arr));
        
        System.out.println("Duplicate elements in given array: ");
        
        
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  */
		
/*		String[] str=new String[7];
		
		str[0]="Mon";
		str[1]="Tue";
		str[2]="Wed";
		str[3]="Thu";
		str[4]="Fri";
		str[5]="Sat";
		str[6]="Sun";
			
		System.out.print(str[4]);*/
		
/*		int[][] colrow=new int[3][3];
		
		int[] test={11,1,2,3};
		
		colrow[0][0]=10;
		colrow[1][0]=20;
		colrow[2][0]=30;
		
		colrow[0][1]=11;
		colrow[1][1]=21;
		colrow[2][1]=31;
		
		colrow[0][2]=12;
		colrow[1][2]=22;
		colrow[2][2]=32;
		
		
		System.out.println(colrow[2][2]);*/
		
		
	
		
		//public class ReverseNumber {

		    //public static void main(String[] args) {
/*
		        int num = 12345, reversed = 0;

		        for(;num != 0;num/=10) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		         
		        }

		        System.out.println("Reversed Number: " + reversed);*/
		
		String str="beautiful beach";
		
		char[] carray=str.toCharArray();
		
		
		System.out.println(str);
		
		System.out.println("Duplicate letters from the above word");
		
		for (int i=0; i< str.length(); i++){
			
			for (int j=i+1; j<str.length(); j++){
				
				if (carray[i]==carray[j])
					System.out.print(carray[j]+"    ");
					
				}
		}
		System.out.println("***************************");
		int num=1234, reverse = 0;
		
		while(num !=0){
			int Digit = num%10;
			reverse = reverse*10+Digit;
			num/=10;
		}
		System.out.print(reverse);
					
		}
		
	{
	int num=7;
	int f=0;
	int s=1;
	int t = 0;
	{
	
	while(num<7){
	
		t=f+s;
		f=s;
		s=t;
		
	}
	
	System.out.println(t);
		
		
	
	}
		
	//System.out.println("****************************");
			//StringBuffer a=new StringBuffer("Welcome to the java world");
			
			//System.out.print(a.reverse());
			
		
	}
}

			
		

