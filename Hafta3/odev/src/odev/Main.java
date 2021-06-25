package odev;

public class Main {

	public static void main(String[] args) {
		 for(int b=3; b>=0; b--){
			 System.out.println();
	          for(int c=0; c<=b; c++){
	              System.out.print("*");
	          }
	         
	      }
		 
		 System.out.print("-----------");
		 
		 for(int i=1; i<=10; i++){
			  System.out.println();
	           for(int j=1; j<=10; j++){
	               System.out.println(j+"*"+i+"="+(i*j));
	           }
	       }
	}

}
