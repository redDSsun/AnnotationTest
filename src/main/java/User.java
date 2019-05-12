public class User {
    @Validation(value = "sys")
    private String name;
    @Validation(min = 18, max = 65)
    private int age;

    public User(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
