import java.util.StringTokenizer;

public class removemultiplespace {

	public static void main(String[] args) {
		String str="the   black    box  testing ";
		StringTokenizer st=new StringTokenizer(str);
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens()) {
		sb.append(st.nextToken(" ")).append(" ");
	}
		System.out.println(sb);
	}

}
