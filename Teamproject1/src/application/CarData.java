package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class CarData {
	static Map hashMap = new HashMap<String, Data>();		//String�� �ڸ���ȣ , Data��ü�� ���� ���� ���������� ����.
	static String s;		//������ �ڸ���ȣ���� ��ư��ȣ
	static int price;		//�����ݾ�
}

class Data {
	
	boolean inorout = false;		//�� �����ڸ��� ������ �ִ��� ������ �Ǵ�.
	
	public Data(String locationNumber) {		//���� �������� ����.
		this.locationNumber = locationNumber;
	}
	LocalDate curDate;		//���糯¥
	String locationNumber;		//���� �ڸ���ȣ
	String carNumber;		//������ȣ
	LocalTime inTime;		//�����ð�
	LocalTime curTime;		//���� �ð� �߰�
	LocalTime outTime;		//�����ð�
	int price;				//�����ݾ�
	
}