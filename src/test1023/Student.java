package test1023;

import java.util.*;

public class Student {
	public int StudentNum;
	public String name;
	
	public Student(int StudentNum, String name) {
		this.StudentNum=StudentNum;
		this.name=name;
	}
	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			return student.equals(student.StudentNum);
		}
		else {
			return false;
		}
		
	}
}
