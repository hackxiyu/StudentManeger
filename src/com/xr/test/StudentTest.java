/**
 * 
 * 学生菜单显示逻辑
 * 学生接口功能的调用
 * 
 */
package com.xr.test;
import java.util.Scanner;
import com.xr.dao.impl.StudentDaoImpl;
import com.xr.view.StudentView;
import com.xr.bean.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		//实例化显示类
		StudentView show = new StudentView();
		//实例化数据控制层接口
		StudentDaoImpl sdi = new StudentDaoImpl();
		//新建数据保存数组,index是最后一个学生下标
		int index =0;
		Student[] sd = new Student[100];
		
		
		while(true){
			show.showMenu();
			System.out.println("请选择（0-4）：");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			if(choice == 0){
				System.out.println("谢谢使用！");
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
					System.out.println("输错了！");
					break;
				}
			}
		}
	}
}
