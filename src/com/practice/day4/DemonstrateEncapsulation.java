package com.practice.day4;

public class DemonstrateEncapsulation {
	private int Student_Id;
    private String name;
    
    //getters, setters for Student_Id and name.
    public int getId() {
        return Student_Id;
    }
    public void setId(int sid) {
        this.Student_Id = sid;
    }
    public String getname() {
        return name;
    }
    public void setname(String sname) {
        this.name = sname;
    }
	public static void main(String[] args) {
		
		DemonstrateEncapsulation d=new DemonstrateEncapsulation();
		d.setId (30);
        d.setname("Ram");
                
        System.out.println("Student'details:  " + "Student's id:" + d.getId()
                            + " Student's name:" + d.getname());
	}

}
