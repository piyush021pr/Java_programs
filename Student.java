class stud{
    int id;
    String name;
    void insert(int r,String n){
        id=r;
        name=n;
    }
    void displayData(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class Student {
    public static void main(String[] args) {
        stud s1=new stud();
        stud s2=new stud();
        s1.insert(12,"Ravi");
        s2.insert(15,"Ayush");
        s1.displayData();
        s2.displayData();



    }
}
