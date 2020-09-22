
class ReverseNumber {

	public static void main (String[] args){
		
		//reversing the string characters

		StringBuffer str=new StringBuffer("Welcome to the JAVA world");
		
		System.out.println("String reverse ="+str.reverse());
		
		System.out.println("**********************************");
		
	//reversing the number
    { 
      int num= 123456789, reverse= 0; 
      
      while(num!=0){
    	  
    	  
    	  int digit=num%10;
    	  
    	  reverse=reverse*10+digit;
    	  
    	  num/=10;
    	  
      }
                
        System.out.println("Number reverse  = " + reverse); 
    } 
}
}