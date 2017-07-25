package java2;

import java.util.Random;
import java.util.function.IntToDoubleFunction;

public class Java2 {
	public static void main(String[] args) {
		double x=0;
		double y=0;
		double icer=0;
		double disar=0;
		
		
		for (int i = 0; i < 100000; i++) {
			
		Random rand=new Random();
		
		x=rand.nextDouble();
		
		y=rand.nextDouble();
		
		
		
		if (((x*x)+(y*y))>1) {
			
			disar++;
			
		}
		else {
			icer++;
			
		}
		
		}
		System.out.println(icer+"  "+disar);
		
		
		System.out.println(String.valueOf((icer/(icer+disar))*4));
		
		
		
		
	}

}
