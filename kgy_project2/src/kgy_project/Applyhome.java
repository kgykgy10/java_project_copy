package kgy_project;

import java.util.ArrayList;

// 이 클래스에서는 청약홈을 싱글톤 패턴으로 구현하고, 
// Main에서 청약홈에 아파트와 청약자를 넣을 때 사용할 함수 생성

public class Applyhome {
// 싱글톤 단계1: 생성자를 private으로 생성
		private Applyhome() {}

// 싱글톤 단계2: 청약홈은 여러 개를 만들 필요가 없는 유일한 객체이므로 static을 이용해 유일한 인스턴스 생성	
	private static Applyhome instance= new Applyhome();
	
// 싱글톤 단계3: 청약홈을 외부에서 참조할 수 있도록 메서드 생성
		public static Applyhome getInstance() {
			return instance;
		}

// 청약자 리스트와 아파트 리스트 생성
	private ArrayList<Person> personList = new ArrayList<Person>();
	private ArrayList<Apartment> ApartmentList = new ArrayList<Apartment>();

// 청약자를 추가하는 함수
		public void addPerson(Person person) {
			personList.add(person);
		}	
// 청약자를 가져오는 함수
	public ArrayList<Person> getPersonList() {
		return personList;
	}
// 아파트를 추가하는 함수
	public void addApartment(Apartment apartment) {
		ApartmentList.add(apartment);
	}
// 아파트를 가져오는 함수	
	public ArrayList<Apartment> getApartmentList() {
		return ApartmentList;
	}
}
