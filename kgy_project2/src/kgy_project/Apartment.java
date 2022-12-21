package kgy_project;

import java.util.ArrayList;

// 이 클래스에서는 아파트명, 청약신청자, 당첨컷을 정의.
public class Apartment {
	private int cutScore; 
	private String apartmentName; 
	
	// 아파트명을 넣어 생성
	public Apartment(String apartmentName) { 
		super();
		this.apartmentName = apartmentName;
	}
	// 아파트에 청약 신청한 청약자 리스트
		private ArrayList<Person> personList = new ArrayList<Person>(); 

	// 당첨컷을 가져오는 함수
	public int getCutScore() {
		return cutScore;
	}
    // 당첨컷을 지정하는 함수
	public void setCutScore(int cutScore) {
		this.cutScore = cutScore;
	} 
	// 아파트명을 가져오는 함수
	public String getApartmentName() {
		return apartmentName;
	}
    // 아파트명을 지정하는 함수
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName; 
	}
	// 청약자를 추가하는 함수
	public void register(Person person) {
		personList.add(person);              
	}
	// 아파트에 청약한 청약자들을 가져오는 함수
	public ArrayList<Person> getPersonList() {
		return personList;
	}
}
