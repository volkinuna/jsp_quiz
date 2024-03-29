package ch04.regist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistService {
	Map<String, Regist> customerList = new HashMap();
	
	public RegistService() {
		Regist r = new Regist("101", "김지우", "서울시", "silver", "010-1111-1111");
		customerList.put("101", r);
		
		r = new Regist("102", "홍길동", "인천시", "gold", "010-2222-2222");
		customerList.put("102", r);
		
		r = new Regist("103", "율곡", "김포시", "vip", "010-3333-3333");
		customerList.put("103", r);
	}
	
	public List<Regist> findAll() {
		return new ArrayList<>(customerList.values());
	}
	
	public Regist find(String id) {
		return customerList.get(id);
	}
}
