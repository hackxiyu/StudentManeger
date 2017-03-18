package com.xr.dao.impl;
import java.util.Scanner;
import com.xr.bean.Student;
import com.xr.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{
	
	Student[] stu = new ();
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生的名字：");
		String name = input.next();
		Student.setName(name);
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updataStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStudent() {
		// TODO Auto-generated method stub
		
	}
	
	

}
