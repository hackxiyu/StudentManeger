/**
 * 
 * 定义数据主体模型
 * 
 */
package com.xr.bean;

public class Student {
	
	//定义底层对象模型
	private String name;
	private Integer age;
	private String address;
	
	//定义公有访问
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
	
	//定义构造初始化
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
	
	//定义自有方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "学生名字是："+this.name+'\t'+
				"年龄是："+this.age+'\t'+
				"地址是："+this.address+'\t';
	}
	
	
}
