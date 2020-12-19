import java.util.Arrays;
import java.util.HashMap;

public class duplicatewordandcount {

	public static void main(String[] args) {
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		int k=1;
		String str="the count the find the dulicate word and count it and print the count ";
		str=str.toLowerCase();
		String arrstr[]=str.split(" ");
		System.out.println(arrstr.length);
		for(int i=0;i<arrstr.length;i++)
		{
			for(int j=i+1;j<arrstr.length;j++)
			{
				if(arrstr[i].equals(arrstr[j]))
				{
					k=k+1;
					arrstr[j]="0";
				}
			}
			if(arrstr[i]!="0")
		         System.out.println(arrstr[i]+"--"+k); //Printing the word along with count
		         k=1;
		}
		
		

	}

}
