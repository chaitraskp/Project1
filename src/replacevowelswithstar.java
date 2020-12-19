
public class replacevowelswithstar {

	public static void main(String[] args) {
		String str="this is vowels aeiou";
		
		str=str.replaceAll("[aAeEiIoOuU]", "*");
			
		System.out.println(str);
	}

}
