package com.chainsys.jfs6;

public class Apppojo {

	String name;
	String id;
	int classesAttend;
	String department;
	String password;
	double amountTobePaid;
	
    
  


    @Override
    public String toString() {
        return "Apppojo{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", classesAttend=" + classesAttend +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                 ", amountTobepaid=" + amountTobePaid +
                '}';
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getClassesAttend() {
        return classesAttend;
    }

    public void setClassesAttend(int classesAttend) {
        this.classesAttend = classesAttend;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


	public double getAmountTobePaid() {
		return amountTobePaid;
	}


	public void setAmountTobePaid(double amountTobePaid) {
		this.amountTobePaid = amountTobePaid;
	}
    
    
}
