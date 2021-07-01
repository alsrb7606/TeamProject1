package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class CarData {
	static Map hashMap = new HashMap<String, Data>();
	
}

class Data {
	LocalDate curDate;
	String locationNumber;
	String carNumber;
	LocalTime inTime;
	LocalTime outTime;
	int price;
	
}