package kgy_project;

//이 클래스에서는 청약자를 정의.
public class Person 
{
		private int personId;
		private String personName;
		private int score;
		
	    // 청약자 생성(이슈: Person class(6-8 line)과 아래 매개변수를 같게 썼다가 오류나서 변경)
		public Person(int pId, String pName, int pScore) {
		super();
		this.personId = pId;
		this.personName = pName;
		this.score = pScore;
		}
		// 청약자Id를 가져오는 함수
		public int getPersonId() {
			return personId;
		}
		// 청약자이름을 가져오는 함수
		public String getPersonName() {
			return personName;
		}
		// 청약점수를 가져오는 함수
		public int getPersonScore() {
			return score;
		}
}