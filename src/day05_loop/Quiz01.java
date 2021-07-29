package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
	
		// Quiz1
		for(int i=1; i<=4; i++) {
			System.out.println(i+". hello");
		}
		
		// Quiz2
		int sum=0,n1;
		for(int i=1;i<=100;i++) {
			n1= sum+=i;
			if(n1 == 528) {
				System.out.println(i);
			}
		}
		
		//Quiz3
		
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");
			if(i%5 ==0){
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
