package com.xr.bean;

public class Student {
	//定义接口的私有属性
	private String name;
	private String address;
	private Integer age;
	
	//定义私有属性的访问方法
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
	
	//定义构造方法
	public Student(){
		super();
	}
	public Student(String name,String address, Integer age){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//定义特有方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name=" + name + ", age=" + age + ", sex=" + 
				",address=" + address + "]";
	}
	
	
}
