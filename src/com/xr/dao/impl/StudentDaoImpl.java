/**
 * 
 * �Խӿڹ淶�ľ��廯ʵ��
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
		//����ѧ���ķ�����Ҫ�ⲿ����
		Scanner input = new Scanner(System.in);
		System.out.println("������ѧ�������֣�");
		String name = input.next();
		System.out.println("������ѧ�������䣺");
		int age = input.nextInt();
		System.out.println("������ѧ���ĵ�ַ��");
		String address = input.next();
		
		Student s = new Student(name,age,address);
		stus[index++] = s;
		return index;
	}

	@Override
	public int deleteStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫɾ����ѧ�����ڵ��±꣺");
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
		System.out.println("���������ѧ��λ�ã�");
		int num = input.nextInt();
		System.out.println("������ѧ�������֣�");
		String name = input.next();
		System.out.println("������ѧ�������䣺");
		int age = input.nextInt();
		System.out.println("������ѧ���ĵ�ַ��");
		String address = input.next();
		
		Student s = new Student(name,age,address);
		stus[num] = s;
		
	}

	@Override
	public void findStudent(Student[] stus, int index) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<index;i++){
			System.out.println("��"+i+"��ѧ���ǣ� ");
			System.out.println(stus[i].toString());		
					
		}
	}

}
