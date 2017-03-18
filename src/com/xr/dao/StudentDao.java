/**
 * 
 * 封装底层数据，创建对外使用接口
 * 
 */
package com.xr.dao;
import com.xr.bean.*;
public interface StudentDao {
	
	//封装学生，只暴露对外使用方法的接口规范
	public int addStudent(Student[] stus, int index);
	public int deleteStudent(Student[] stus, int index);
	public void updateStudent(Student[] stus, int index);
	public void findStudent(Student[] stus, int index);
	
}
