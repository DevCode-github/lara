package pack1_ArrayList_sort_lambda_iterator;

import java.util.ArrayList;

public class M7_get {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.1);
		list.add('d');
		list.add(true);
		//int i = list.get(0);
		Object obj = list.get(0);
		int j = (Integer)list.get(0);
		
		//double d1 = list.get(1);
		Object obj1 = list.get(1);
		double d2 = (Double)obj1;
		double d3 = (Double)list.get(1);
		System.out.println(list.get(1));
		
		//char c1 = list.get(2);
		Object obj2 = list.get(2);
		char c2 = (Character) obj2;
		char c3 = (Character)list.get(2);
		System.out.println(list.get(2));
		
		//boolean b1 = list.get(3);
		Object obj3 = list.get(3);
		boolean b3= (Boolean)obj3;
		boolean b2 = (Boolean)list.get(3);
		System.out.println(list.get(3));
		//list.remove(0);
		//list.remove(90);
		list.remove(Integer.valueOf(90));
		//System.out.println(list);
		
		list.remove(9.1);
		
		//list.remove('d');
		list.remove(Character.valueOf('d'));
		System.out.println(list);
	}

}
