package api;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest01 {
public static void main(String[] args) {
	
	List list = new ArrayList<String>();
	list.add("아");printStr(list);
	list.add("귀");printStr(list);
	list.add("찮");printStr(list);
	list.add("다");printStr(list);
	list.add("집");printStr(list);
	list.add("보");printStr(list);
	list.add("내");printStr(list);
	list.add("줘");printStr(list);
	
}
	private static void printStr(List list) {
	for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i)+"\t");
	}
	System.out.println("");
	}
	
	
	
}



