package EmployeeManagementSystem;

class PartTimeEmployee extends Employee implements Department{
    protected int workHours = 4;
    public PartTimeEmployee(String employeeId, String name, double baseSalary){
        super(employeeId,name,baseSalary);

    }

    @Override
    public double calculateSalary() {
        return workHours*this.getBaseSalary();
    }

    @Override
    public String assignDepartment(String department) {
        return department;
    }

    @Override
    public void getDepartmentDetails(){
        super.displayDetails();
        System.out.println("Assigned department  to part time employee :" +this.assignDepartment("PartTime"));
    }


}
