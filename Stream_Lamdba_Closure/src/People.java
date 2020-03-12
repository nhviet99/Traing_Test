public class People {
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public People(String name, int age) {
        Name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "Name: "+this.getName() +" "+this.getAge();
    }
}
