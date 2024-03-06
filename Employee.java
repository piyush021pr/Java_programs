class Emp{
    int id;
    String name;
    float salary;
    void insert(int r,String n,float f){
        id=r;
        name=n;
        salary=f;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
        //System.out.println(name);
        //System.out.println(salary);
    }
}
public class Employee {
    public static void main(String[] args) {
   Emp e=new Emp();
   Emp e1=new Emp();
   e.insert(1,"Shubham",50000);
   e.display();
   e1.insert(2,"Govind",60000);
   e1.display();
    }
}
