package com.springcore;

public class Student {
	
	private int stuId;
	private String stuName;
	private String stuAddres;
	
	public Student() {
		super();
		
	}

	public Student(int stuId, String stuName, String stuAddres) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddres = stuAddres;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddres() {
		return stuAddres;
	}

	public void setStuAddres(String stuAddres) {
		this.stuAddres = stuAddres;
	}

	@Override
	public String toString() {
		return " [stuId=" + stuId + ", stuName=" + stuName + ", stuAddres=" + stuAddres + "]";
	}
	

}
