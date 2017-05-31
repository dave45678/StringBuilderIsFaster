import java.lang.StringBuilder;

public class Application {

	public static void main(String args[]) {

		int nmbrCats = 50000;


		final long startTime = System.currentTimeMillis();

		for(int i=0;i<=nmbrCats;i++){
			String s = "";
			s += "I have ";
			s += i;
			s += " cats.";
			System.out.println(s);
		}
		final long endTime = System.currentTimeMillis();
		String totalString  = "Total execution time: " + (endTime - startTime);

		final long startTime2 = System.currentTimeMillis();
		for(int i=0;i<=nmbrCats;i++){
			StringBuilder sb = new StringBuilder();
			sb.append("I have ");
			sb.append(i);
			sb.append(" cats.");
			System.out.println(sb);
		}
		final long endTime2 = System.currentTimeMillis();
		String totalStringBuilder  = "Total execution time: " + (endTime2 - startTime2);
		
		System.out.println(totalString);
		System.out.println(totalStringBuilder);
	}
}