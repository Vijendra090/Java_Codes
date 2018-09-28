package aggregationdemo;

public class Employee {
    int id;
    String name;
    Address address;

    Employee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void displayEmpInfo(){
        System.out.println("ID :"+id+"  Name:"+name);
        System.out.println("City:"+address.city+"  State:"+address.state+"  Country:"+address.country);
    }

    public static void main(String[] args){
        Address a1=new Address("Allahabad","UP","India");
        Address a2=new Address("Chandangad","Kolkatta","India");

        Employee e1=new Employee(111,"Vijendra",a1);
        Employee e2=new Employee(222,"Ranita",a2);
        e1.displayEmpInfo();
        e2.displayEmpInfo();
        }
}
