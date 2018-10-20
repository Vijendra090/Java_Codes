package objectclassdemo;

class Student implements Cloneable{
    String name;
    int age;
    Student(){}
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+this.name+"   Age:"+this.age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneDemo extends Student{
    public static void main(String[] args) {
        Student student1= new Student("ranita",25);
        student1.display();
        try {
            Student student2 = (Student) student1.clone();
            student2.display();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
