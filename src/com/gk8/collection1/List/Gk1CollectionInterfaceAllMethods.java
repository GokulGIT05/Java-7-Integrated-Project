package com.gk8.collection1.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Gk1CollectionInterfaceAllMethods {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List arrayListMainObj = new ArrayList<>();
		
		//Collection Interface 12 Methods using ArayList
		
		// 1.boolean add(Object o)
		arrayListMainObj.add("GkString");
		arrayListMainObj.add(27);
		arrayListMainObj.add("Gk5");
		arrayListMainObj.add(36);
		arrayListMainObj.add(99);
		arrayListMainObj.add("Gk5");
		System.out.println("1. boolean add(Object o): "+arrayListMainObj);
		System.out.println("**************************************");
		
		// 2.boolean addAll(Collection c)
		List addAllDemo = Arrays.asList("Gk1","Gk2","Gk3","Gk4"); // Returns ArrayList
		boolean isAddAll = arrayListMainObj.addAll(addAllDemo);
		System.out.println("2. boolean addAll(Collection c): "+isAddAll);
		System.out.println("Main Obj : "+arrayListMainObj);
		System.out.println("**************************************");
		
		// 3. boolean remove(Object o)
		boolean isRemove = arrayListMainObj.remove("Gk1"); // If i give number it throw ArrayIndexOutOfBound Exception.
		System.out.println("3. boolean remove(Object o): "+isRemove);
		System.out.println("Main Obj : "+arrayListMainObj);
		System.out.println("**************************************");
		
		// 4. boolean removeAll(Collection c)
		List removeALObj = new ArrayList<>();
		removeALObj.add(27);
		removeALObj.add("Gk1");
		boolean isRemoveAll = arrayListMainObj.removeAll(removeALObj);
		System.out.println("4. boolean removeAll(Collection c): "+isRemoveAll);
		System.out.println("Main Obj : "+arrayListMainObj);
		System.out.println("**************************************");
		
		// 5. boolean retainAll(Collection c)
		List retailAllObj = new ArrayList<>();
		retailAllObj.add("Gk5");
		retailAllObj.add("Gk4");
		retailAllObj.add(36);
		retailAllObj.add("Gkkk3");
		boolean isRetailAll = arrayListMainObj.retainAll(retailAllObj);
		System.out.println("5. boolean retainAll(Collection c): "+isRetailAll);
		System.out.println("Main Obj : "+arrayListMainObj);
		System.out.println("**************************************");
			
		// 6. boolean contains(Object o)
		boolean isContains = arrayListMainObj.contains("Gk4");
		System.out.println("6. boolean contains(Object o): "+isContains);
		System.out.println("**************************************");
		
		
		// Adding Some Dummy Data to Main List
		arrayListMainObj.addAll(Arrays.asList("Rk1","Rk2","Rk3"));
		
		// 7. boolean containsAll(Collection c)
		List containsAllObj = new ArrayList<>();
		containsAllObj.add("Gk4");
		containsAllObj.add("Rk2");
		boolean isContainsAll = arrayListMainObj.containsAll(containsAllObj);
		System.out.println("7. boolean containsAll(Collection c): "+isContainsAll);
		System.out.println("**************************************");
		
		// 8. boolean isEmpty();
		boolean isEmptyList = arrayListMainObj.isEmpty();
		System.out.println("8. boolean isEmpty(): "+isEmptyList);
		System.out.println("**************************************");
		
		// 9. int Size();
		int sizeOfList = arrayListMainObj.size();
		System.out.println("9. int Size(): "+sizeOfList);
		System.out.println("**************************************");
		
		// 10. Object[] toArray;
		Object[] toArrayFromList = arrayListMainObj.toArray();
		System.out.println("10. Object[] toArray: "+toArrayFromList);
		System.out.println("**************************************");
		
		// 11. Iterator iterator();
		Iterator itr = arrayListMainObj.iterator();
		System.out.println("11. Iterator iterator(): "+itr);
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.print(object+" : ");
		}
		System.out.println();
		System.out.println("**************************************");
		
		// 12. void clear()
		arrayListMainObj.clear();
		System.out.println("12. void clear(): "+arrayListMainObj);
		
	}
}
