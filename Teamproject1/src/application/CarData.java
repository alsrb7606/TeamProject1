package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.Button;

public class CarData {
	static Map hashMap = new HashMap<String, Data>();
	
	static Map hashMap2 = new HashMap<Button, String>();
	
	static String s;		//������ �ڸ���ȣ���� ��ư��ȣ
}

class Data {
	
	public Data(String locationNumber) {
		this.locationNumber=locationNumber;
	}
	LocalDate curDate;
	String locationNumber;
	String carNumber;
	LocalTime inTime;
	LocalTime outTime;
	int price;
	
}