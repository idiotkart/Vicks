package interview_questions;

public class Remove_specialcharacters {
	
	public static void main(String[] args) {
		
		String s = "!@#$%^Karthik!@#$%";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}

}
