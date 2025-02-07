package Assignment1;

import java.util.Arrays;

public class callnonstaticparameterizedmethod {
	
		
	public static void main(String[] args)
	{
	int rollno[]=new int[4];

	rollno[0]=12;
	rollno[1]=12;
	rollno[2]=12;
	rollno[3]=12;
	int rollno1[]=new int[4];
	rollno1[0]=12;
	rollno1[1]=12;
	rollno1[2]=12;
	rollno1[3]=12;

	
	/*for(int i=0; i<=3;i++)
	{
		System.out.println(rollno[i]);
	}*/
System.out.println(Arrays.equals(rollno, rollno1));
	}
}