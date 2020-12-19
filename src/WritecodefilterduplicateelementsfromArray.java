import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WritecodefilterduplicateelementsfromArray {

	public static void main(String[] args) {
		// Write code to filter duplicate elements from an array and print as a list
		ArrayList<String> list= new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			list.add(String.valueOf(i));
		}

		for(int i=0;i<5;i++)
		{
			list.add(String.valueOf(i));
		}
		System.out.println(list.size());
		findlist(list);
		
	}

	private static void findlist(List<String> list) {
		Set<String> resset=new HashSet<String>();
		for(String val:list)
		{
			resset.add(val);
			
		}
		
		System.out.println(resset);
		
	}

}
