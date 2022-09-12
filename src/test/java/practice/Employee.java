package practice;

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



    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    public String toString(){
        return "[id="+this.id+",name="+this.sName+"]";
    }
}
