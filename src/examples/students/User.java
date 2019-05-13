package examples.students;

public class User implements UserI {
    private String name;
    private String phone;
    public int someValue = 56;
    public User(String phone) {
        this.phone = phone;
    }
    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void aaaaa (){
        System.out.println("HELLO");
    }
    public int bbbbb (int a, int b) {
        return  a + b;
    }
}
