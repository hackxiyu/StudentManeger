/**
 * 
 * ��װ�ײ����ݣ���������ʹ�ýӿ�
 * 
 */
package com.xr.dao;
import com.xr.bean.*;
public interface StudentDao {
	
	//��װѧ����ֻ��¶����ʹ�÷����Ľӿڹ淶
	public int addStudent(Student[] stus, int index);
	public int deleteStudent(Student[] stus, int index);
	public void updateStudent(Student[] stus, int index);
	public void findStudent(Student[] stus, int index);
	
}
