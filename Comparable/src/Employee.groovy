class Employee implements Comparable<Employee>{

    private int ID;
    private String Name;
    private float Salary;
    private int Age;

    public Employee(int ID, String name, float salary, int age) {
        this.ID = ID
        Name = name
        Salary = salary
        Age = age
    }

    @Override
    int compareTo(Employee o) {
        return this.getID()- o.getID();
    }

    int getID() {
        return ID
    }

    void setID(int ID) {
        this.ID = ID
    }

    String getName() {
        return Name
    }

    void setName(String name) {
        Name = name
    }

    float getSalary() {
        return Salary
    }

    void setSalary(float salary) {
        Salary = salary
    }

    int getAge() {
        return Age
    }

    void setAge(int age) {
        Age = age
    }

    static Comparator<Employee> getComamparewithSalary() {
        return ComamparewithSalary
    }

    static void setComamparewithSalary(Comparator<Employee> comamparewithSalary) {
        ComamparewithSalary = comamparewithSalary
    }

    @Override
    String toString() {
        return "[ID: ${ID}; Name: ${Name}; Salary: ${Salary}; Age: ${Age}],";
    }
    public static Comparator<Employee> ComamparewithSalary = new Comparator<Employee>() {
        @Override
        int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    };
}
