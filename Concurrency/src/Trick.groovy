import java.util.concurrent.Callable

class Trick {
}
class Synmethod implements  Callable{
    private int A;
    public Synmethod()
    {
        A=0;
    }
    public synchronized void  Inscrease()
    {
        A++;
    }
    public prints()
    {
        println(A)
    }

    @Override
    Object call() throws Exception {
        Inscrease();
        return A;
    }
}
