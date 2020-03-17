import org.junit.jupiter.api.extension.TestExecutionExceptionHandler

class CustomException   {
    void m() throws IOException {
        throw new IOException("device error");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
             println("exception handled");
        }
    }

    }
class TestExceptionPropagation {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            println("exception handled");
        }
    }
    public static void exceptionIOE() throws IOException
    {

        throw new IOException("Error final chain");
    }
    public static void main(String[] args) throws IOException {
        CustomException obj = new CustomException();
        obj.p();
       println("normal flow...");
        println("excption number");
        TestExceptionPropagation obj2 = new TestExceptionPropagation();
        obj2.p();
        println("Finsih!!!");
        exceptionIOE();



    }
}
