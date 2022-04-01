package aufgabe_7_5;

import java.util.ArrayList;

public class ArrayIntegerList implements IntegerList {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	@Override
	public int getLength() {
		return list.size();
	}

	@Override
	public void insertLast(int value) {
		list.add(value);
	}

	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		try {
			return list.get(0);
		} catch(Exception e) {
			return 0;
		}
	}

	@Override
	public void deleteFirst() {
		// TODO Auto-generated method stub
		list.remove(0);
	}

	@Override
	public boolean search(int value) {
		// TODO Auto-generated method stub
		return list.contains(value);
	}
	
	public static void main (String[] args) {
		
		ArrayIntegerList a = new ArrayIntegerList();
		
		a.insertLast(5);
		a.insertLast(3);
		a.insertLast(7);
		a.insertLast(20);
		
		System.out.println(a.getLength() + " " + a.getFirst());
		
		a.deleteFirst();
		
		System.out.println(a.getLength() + " " + a.getFirst());
		
		System.out.println(a.search(7));
		
		
	}
}
