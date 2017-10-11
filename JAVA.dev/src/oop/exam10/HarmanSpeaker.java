package oop.exam10;

public class HarmanSpeaker implements Speaker{
	
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("HarmanSpeaker : 소리를 키웁니다.");
	}
	

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("HarmanSpeaker : 소리를 줄입니다.");
	}
}
