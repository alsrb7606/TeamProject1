package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class CarData {
	static Map hashMap = new HashMap<String, Data>();		//String이 자리번호 , Data객체가 실제 차량 주차정보로 연결.
	static String s;		//주차장 자리번호이자 버튼번호
	static int price;		//결제금액
}

class Data {
	
	boolean inorout = false;		//각 주차자리의 차량이 있는지 없는지 판단.
	
	public Data(String locationNumber) {		//실제 차량정보 저장.
		this.locationNumber = locationNumber;
	}
	LocalDate curDate;		//현재날짜
	String locationNumber;		//주차 자리번호
	String carNumber;		//차량번호
	LocalTime inTime;		//입차시간
	LocalTime curTime;		//현재 시간 추가
	LocalTime outTime;		//출차시간
	int price;				//결제금액
	
}