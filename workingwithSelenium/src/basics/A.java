package basics;

public class A {

	public static void main(String[] args) {
		String s="Rs 923ab12";
		s=s.replaceAll("[^0-9]","");
		System.out.println(s);
	}
}
