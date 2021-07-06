package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class CarData {
	static Map hashMap = new HashMap<String, Data>();
	static String s;		//주차장 자리번호이자 버튼번호
	static int price;		//결제금액
}

class Data {
	
	boolean inorout = false;
	
	public Data(String locationNumber) {
		this.locationNumber = locationNumber;
	}
	LocalDate curDate;
	String locationNumber;
	String carNumber;
	LocalTime inTime;
	LocalTime curTime;		//현재 시간 추가
	LocalTime outTime;
	int price;
	
}