/**
 * 
 * ������������ģ��
 * 
 */
package com.xr.bean;

public class Student {
	
	//����ײ����ģ��
	private String name;
	private Integer age;
	private String address;
	
	//���幫�з���
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//���幹���ʼ��
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//�������з���
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ�������ǣ�"+this.name+'\t'+
				"�����ǣ�"+this.age+'\t'+
				"��ַ�ǣ�"+this.address+'\t';
	}
	
	
}
