package basic.exam16;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week){
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
                        
		}
		System.out.println(week);
		System.out.println("오늘 요일 : " + today.name());
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.WEDNESDAY));
		
		if(today== Week.SUNDAY){
			System.out.println("일요일에는 쉽시다.");
		}else if(today== Week.SATURDAY){
			System.out.println("토요일에는 놉시다.");
			
		}
		else
			System.out.println("열심히 자바공부합시다.");
	
		Week[] weeks = Week.values();
		for(Week w: weeks) {
			System.out.println(w);
		}
	}

}
