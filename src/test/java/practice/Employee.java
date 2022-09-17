package practice;

import java.util.Comparator;

class Employee implements Comparable <Employee>{
    private int id;
    private String sName;

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

    private String getsName() {
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

    public static Comparator<Employee> NameComparator= (o1, o2) -> o1.getsName().compareTo(o2.getsName());
//    To Sort By ID
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    public String toString(){
        return "[id is ="+this.id+",name="+this.sName+"]";
    }


}
