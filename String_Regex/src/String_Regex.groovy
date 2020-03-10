import java.util.regex.*;

public class String_Regex {
    static void main(String[] args) {
        while(1)
        {
           def input= System.console().readLine"Please inpute date with format dd//mm//yyyy " ;
            if(Pattern.matches("\\d{1,2}[/]\\d{1,2}[/]\\d{4}",input))
            {
                break;
            }
            println("Error Syntax. Please input again!!!!");
        }
    }
}
