class Student implements Serializable{
    private String Id;
    private String Name;
    private String Salary;

    Student(String id, String name, String salary) {
        Id = id
        Name = name
        Salary = salary
    }
    Student() {

    }
    String getId() {
        return Id
    }

    void setId(String id) {
        Id = id
    }

    String getName() {
        return Name
    }

    void setName(String name) {
        Name = name
    }

    String getSalary() {
        return Salary
    }

    void setSalary(String salary) {
        Salary = salary
    }

    @Override
    String toString() {
        return "Id ${Id}, Name: ${Name}, Salary ${Salary}";
    }
}
