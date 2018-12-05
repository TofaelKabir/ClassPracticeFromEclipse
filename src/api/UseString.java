package api;

public class UseString { //if we use only "String", it doesn't work. have to use "UseString", then can get those method
  public static void main(java.lang.String[] args) {
		String st1 =new String ("we are java programmer");
		System.out.println(st1.toUpperCase());
		String st2 =new String ("VERY INTERESTING!");
		System.out.println(st2.toLowerCase());
		String st3 =new String ("VERYINTERESTINGTOPICS!");
		System.out.println(st3.substring(2, 9));

	}

}
