package EmployeeService;

import EmployeeModel.DepartmentModel;
import EmployeeRepository.DepartmentRepository;
import java.util.*;
public class DepartmentService {
	DepartmentRepository dr=new DepartmentRepository();
	public int addDepartment(DepartmentModel dm)
	{
		return dr.isDepartmentPresent(dm.getName())?-1:dr.addDepartment(dm)?1:0;
	}
	public List <String> getAllEmployee()
	{
		return dr.getAllDepartment();
	}
}
