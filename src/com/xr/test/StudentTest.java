/**
 * 
 * ѧ���˵���ʾ�߼�
 * ѧ���ӿڹ��ܵĵ���
 * 
 */
package com.xr.test;
import java.util.Scanner;
import com.xr.dao.impl.StudentDaoImpl;
import com.xr.view.StudentView;
import com.xr.bean.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		//ʵ������ʾ��
		StudentView show = new StudentView();
		//ʵ�������ݿ��Ʋ�ӿ�
		StudentDaoImpl sdi = new StudentDaoImpl();
		//�½����ݱ�������,index�����һ��ѧ���±�
		int index =0;
		Student[] sd = new Student[100];
		
		
		while(true){
			show.showMenu();
			System.out.println("��ѡ��0-4����");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			if(choice == 0){
				System.out.println("ллʹ�ã�");
				break;
			}
			switch(choice){
				case 1:{
					index = sdi.addStudent(sd,index);
					break;
				}
				case 2:{
					index = sdi.deleteStudent(sd, index);
					break;
				}
				case 3:{
					sdi.updateStudent(sd, index);
					break;
				}
				case 4:{
					sdi.findStudent(sd, index);
					break;
				}
				default:{
					System.out.println("����ˣ�");
					break;
				}
			}
		}
	}
}
