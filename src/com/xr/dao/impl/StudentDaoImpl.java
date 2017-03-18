/**
 * 
 * 对接口规范的具体化实现
 * 
 */
package com.xr.dao.impl;
import com.xr.bean.Student;
import com.xr.dao.StudentDao;
import java.util.Scanner;
public class StudentDaoImpl implements StudentDao{

	
	@Override
	public int addStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		//增加学生的方法需要外部输入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生的名字：");
		String name = input.next();
		System.out.println("请输入学生的年龄：");
		int age = input.nextInt();
		System.out.println("请输入学生的地址：");
		String address = input.next();
		
		Student s = new Student(name,age,address);
		stus[index++] = s;
		return index;
	}

	@Override
	public int deleteStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		System.out.println("请输入要删除的学生所在的下标：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int index1=num;
		for(int i=num;i<index;i++){
			stus[num] = stus[num+1];
			index1++;
		}
		return (index1-1);
	}

	@Override
	public void updateStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入更新学生位置：");
		int num = input.nextInt();
		System.out.println("请输入学生的名字：");
		String name = input.next();
		System.out.println("请输入学生的年龄：");
		int age = input.nextInt();
		System.out.println("请输入学生的地址：");
		String address = input.next();
		
		Student s = new Student(name,age,address);
		stus[num] = s;
		
	}

	@Override
	public void findStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<index;i++){
			System.out.println("第"+i+"个学生是： ");
			System.out.println(stus[i].toString());		
					
		}
	}

}
