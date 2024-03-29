package ch03;

import java.util.regex.Pattern;

public class Member {
	private String email;
	private String phone;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//이메일 정규식
	public static final String pattern1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	  
	 //전화번호 정규식
	public static final String pattern2 = "(02|010)-\\d{3,4}-\\d{4}";
	
//	public void result() {
//		if(emailCheck(email) && )
//	}
	
	public boolean emailCheck(String email) {
		if(Pattern.matches(pattern1, email)) {
			return true;
		}
		
		return false;
	}
	
	public boolean phoneCheck(String phone) {
		if(Pattern.matches(pattern2, phone)) {
			return true;
		}
		
		return false;
	}
	
}
