package com.api.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeObj {
  List <Emp> employeeList=new ArrayList<Emp>();

public List<Emp> getEmployeeList() {
	return employeeList;
}

public void setEmployeeList(List<Emp> employeeList) {
	this.employeeList = employeeList;
}
  
}
