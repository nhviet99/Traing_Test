import java.sql.Array
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Nguyen Van A",100000,12));
        list.add(new Employee(6,"Nguyen Van B",124000,18));
        list.add(new Employee(5,"Nguyen Van C",190000,17));
        list.add(new Employee(3,"Nguyen Van D",240000,22));
        list.add(new Employee(4,"Nguyen Van E",240000,32));
        Collections.sort(list, Employee.ComamparewithSalary);
        println(Arrays.toString(list));

    }
}
