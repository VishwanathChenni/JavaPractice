package practice;

import java.util.Comparator;

public class Employee implements Comparable <Employee>{
    int id;
    String sName;

    public Employee(int iID, String sName) {
        this.id=iID;
        this.sName=sName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
//    To Sort By Name
//    public static Comparator<Employee> NameComparator=new Comparator<Employee>() {
//        public int compare(Employee o1, Employee o2) {
//            return o1.getsName().compareTo(o2.getsName());
//        }
//    };

    public static Comparator<Employee> NameComparator=new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o1.getsName().compareTo(o2.getsName());
        }
    };
//    To Sort By ID
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    public String toString(){
        return "[id ="+this.id+",name="+this.sName+"]";
    }


}
