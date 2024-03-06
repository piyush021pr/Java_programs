class Employees{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Getter_and_Setter {
    public static void main(String[] args) {
        Employees obj = new Employees();
        obj.setName("Piyush raj");
        System.out.println(obj.getName());
        obj.setId(12);
        System.out.println(obj.getId());

    }
}


