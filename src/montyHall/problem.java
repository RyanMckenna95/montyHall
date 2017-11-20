package montyHall;

import java.util.Random;

public class problem {
	
	int stayWin=0;
	int switchWins=0;
	static Random num=new Random();
	
	
	public static void main(String []args){
		
		
		for(int goes=0; goes<1000; goes++)
		{
			int doors[]={0,0,0};
			doors[num.nextInt(3)]=1;
			
			
		}
	}
	
}
