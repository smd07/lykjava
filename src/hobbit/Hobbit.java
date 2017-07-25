package hobbit;

public class Hobbit {

	String name;
	public static void main(String[] args) {
		Hobbit[] hobbits=new Hobbit[3];
		
		
		int k=0;
		while(k<3)
		{
			hobbits[k]=new Hobbit();
			hobbits[k].name="frodo";
			
			if (k==1) {
				hobbits[k].name="sam";
			}
			if (k==2) {
				hobbits[k].name="bilbo";
			}
			
			System.out.println(hobbits[k].name+" lotr");
			k++;
		}
		

	}

}
