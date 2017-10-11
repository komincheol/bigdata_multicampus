package oop.exam3;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("고민철");
		h.setGender(1);
		h.setYear(1992);
		h.setJob("bussiness");
		h.setMarried(false);
		h.setHeight(180);
		h.setWeight(76);
		h.setHobby("운동");
		System.out.println(h);
		
		Animallover al = new Animallover();		
		al.setName("JB");
		al.setGender(1);
		al.setYear(1991);
		al.setJob("AI 트레이딩 알고리즘 개발자");
		al.setMarried(true);
		al.setWeight(70);
		al.setHeight(180);
		al.setHobby("테니스");
		al.setAnimalType("고양이");
		al.setAyear(2016);
		System.out.println(al);
	}

}
