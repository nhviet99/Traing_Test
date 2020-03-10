import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
//TYPE
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity{};
// FIELD
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface  Column
{
     String name() default "";
};
//METHOD
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Redict{};
@Entity
public class User {
    @Column(name ="NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name ="CHILD")
    private boolean Child=true;
    @Redict
    private void Redict() {
        this.name = this.name.trim();
        if (this.age < 18) {
            println("Chua du 18 tuoi");
            Child=false;
        }
    }

    public User(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
