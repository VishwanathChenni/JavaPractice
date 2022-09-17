package practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortEmployee {
    @Test
    void fnSortEmployee(){
        Employee[] employees=new Employee[4];
        employees[0]=new Employee(5,"John");
        employees[1]=new Employee(9,"Paul");
        employees[2]=new Employee(1,"Vish");
        employees[3]=new Employee(10,"Ame");
//        Arrays.sort(employees,Employee.NameComparator);
        Arrays.sort(employees);
        System.out.println("Sorted By Name:-"+Arrays.toString(employees));

    }
}
