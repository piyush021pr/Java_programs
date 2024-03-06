class Student4{
    int id;
    String name;
    Float salary;
    void insert(int n,String m,Float s){
        id=n;
        name=m;
        salary=s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class Student2 {
    public static void main(String[] args) {
Student4 s=new Student4();
Student4 s2=new Student4();
s.insert(111,"Rajiv",45000.0f);
s.display();
s2.insert(2236,"Neha Sharma",65000.0f);
s2.display();
    }
}
