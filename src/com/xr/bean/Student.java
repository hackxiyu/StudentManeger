package com.xr.bean;

public class Student {
	//����ӿڵ�˽������
	private String name;
	private String address;
	private Integer age;
	
	//����˽�����Եķ��ʷ���
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}
	public Integer getAge(){
		return this.age;
	}
	
	//���幹�췽��
	public Student(){
		super();
	}
	public Student(String name,String address, Integer age){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//�������з���
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name=" + name + ", age=" + age + ", sex=" + 
				",address=" + address + "]";
	}
	
	
}
