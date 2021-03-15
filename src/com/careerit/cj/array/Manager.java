package com.careerit.cj.array;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



interface EmpService{
	
	void addEmpno(String empno);
	void deleteEmpno(String empno);
	boolean search(String empno);
}

class EmployeeServiceCollectionImpl implements EmpService {
	private List<String> list;
	
	public EmployeeServiceCollectionImpl() {
		list = new LinkedList<>();
	}
	public void addEmpno(String empno) {
		list.add(empno);
	}
	public void deleteEmpno(String empno) {
		list.remove(empno);
		
		Collections.sort(list);
	}
	@Override
	public String toString() {
		return String.format("EmployeeServiceWithCollection [list=%s]", list);
	}
	public boolean search(String empno) {
		return list.indexOf(empno) != -1;
	}

}

@Deprecated
/**
 * 
 * @author learn
 * Use EmployeeServiceCollectionImpl
 */
class EmployeeServiceArrayImpl implements EmpService {

	private int INIT_SIZE = 3;
	private String[] arr;
	private int count = 0;

	// C - Create D - Delete
	// Search
	// Delete only if empno is found

	public EmployeeServiceArrayImpl() {
		this.arr = new String[INIT_SIZE];
	}

	public void addEmpno(String empno) {
		if (count > arr.length - 1) {
			String[] temp = new String[arr.length + arr.length / 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		this.arr[count++] = empno;
	}

	public void deleteEmpno(String empno) {
		int index = indexOf(empno);
		if (index != -1) {
			if (index == 0) {
				String[] temp = new String[arr.length - 1];
				System.arraycopy(arr, index + 1, temp, 0, arr.length - 1);
				arr = temp;
			} else {
				String[] temp = new String[arr.length - 1];
				System.arraycopy(arr, 0, temp, 0, index);
				System.arraycopy(arr, index + 1, temp, index, arr.length - index - 1);
				arr = temp;
			}
			count--;

		}
	}

	public boolean search(String empno) {
		return indexOf(empno) != -1;
	}

	// If employee number is found then it returns location otherwise returns -1
	private int indexOf(String empno) {

		for (int i = 0; i < count; i++) {
			if (empno.equals(arr[i])) {
				return i;
			}
		}

		return -1;
	}

	public int size() {
		return count;
	}

	@Override
	public String toString() {

		if (arr.length == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				sb.append(arr[i] + ", ");
			} else {
				sb.append(arr[i]);
			}
		}
		sb.append("]");
		return sb.toString();
	}

}

public class Manager {

	public static void main(String[] args) {

		EmpService empService = new EmployeeServiceArrayImpl();
		empService.addEmpno("1001");
		empService.addEmpno("1002");
		empService.addEmpno("1003");
		empService.addEmpno("1009");
		System.out.println(empService);
		empService.deleteEmpno("1001");
	    empService.deleteEmpno("1002");
		System.out.println(empService);
		
		Calendar c =Calendar.getInstance();
		c.set(1984, 8, 6);
		System.out.println(c.get(Calendar.YEAR));

	}
}
