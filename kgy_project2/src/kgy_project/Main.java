package kgy_project;

public class Main {

	//메인 클래스의 메인 함수
	public static void main(String[] args) {
		 // 청약홈 인스턴스 가져오기
		 Applyhome applyhome = Applyhome.getInstance();
		 // 아파트 객체 생성
		 Apartment ramian = new Apartment("래미안");
		 Apartment xi = new Apartment("자이");
		 Apartment prugio = new Apartment("푸르지오");
		 // 청약홈에 아파트 등록
		 applyhome.addApartment(ramian);
		 applyhome.addApartment(xi);
		 applyhome.addApartment(prugio);
		 // 청약자 객체 생성
		    Person person1 = new Person(0001, "손흥민", 98);
			Person person2 = new Person(0002, "황희찬", 75);
			Person person3 = new Person(0003, "김민재", 63);
			Person person4 = new Person(0004, "안정환", 45);
			// 각 아파트에 청약신청자 등록  
			ramian.register(person1);
			ramian.register(person2);
			ramian.register(person3);
			ramian.register(person4);
			
			xi.register(person1);
			xi.register(person2);
			xi.register(person3);
			xi.register(person4);
		 
			prugio.register(person1);
			prugio.register(person2);
			prugio.register(person3);
			prugio.register(person4);
			// 각 아파트 당첨컷 설정
			ramian.setCutScore(80);
			prugio.setCutScore(60);
			xi.setCutScore(70);
			
	        // 아파트를 한개씩 불러옴
			for(int i=0; i< applyhome.getApartmentList().size(); i++)
			{
				Apartment anncApt = applyhome.getApartmentList().get(i);//i번째 있는 아파트를 가져옴.
				          //printf: 출력형식에 맞게 출력
				System.out.printf("%s 아파트의 청약 당첨자 발표 : \n", anncApt.getApartmentName());
				          //%s: string이라는 매개변수가 들어간다는 뜻 //아파트 이름이 %s 자리에 들어감
				
				for(int j =0; j < anncApt.getPersonList().size(); j++)
				{
					// 각 아파트에 청약자를 한명씩 불러옴
					Person checkPerson = anncApt.getPersonList().get(j);
					
					// 당첨컷보다 같거나 큰 청약점수를 가진 경우 당첨자의 이름을 출력
					if(checkPerson.getPersonScore() >= anncApt.getCutScore())
					{
						System.out.printf("%s \n", checkPerson.getPersonName());
					}
				}
			}
	}

}
