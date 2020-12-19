
public class reversewordinString {

	public static void main(String[] args) {
		String str="am a girl baby";
		String[] str2=str.split(" ");
		String[] revword=new String[str2.length];
		int j=0;
		
		for(int i=str2.length-1;i>=0;i--)
		{
			StringBuilder sb=new StringBuilder(str2[i]);
			sb.reverse();
			revword[j]=sb.toString();
			System.out.println(revword[j]);
	         j++;
		}
	}

}
