import java.util.stream.IntStream

class Main {
    public static void main(String[] args)
    {
        ArrayList<People> list= new ArrayList<>();
        list.add(new People(("Nguyen Van A"),27));
        list.add(new People(("Nguyen Van B"),23));
        list.add(new People(("Nguyen Van C"),21));
        list.add(new People(("Nguyen Van D"),30));
        list.add(new People(("Nguyen Van E"),29));
        list.sort((People p1, People p2)->{
            return p1.getAge()-p2.getAge();
        })
        list.forEach((People p1)->
        {
            println(p1);
        })
      Lamdba checkPrime = (int A)->{
          /*if(A<=2) return false;
          else {
              for(int i = 2; i<A;i++)
              {
                  if(A%i==0) return false;
              }
              return true;
          }*/
          return  (A>2 && IntStream.range(3,A).noneMatch(item -> { A%item== 0;} ));
      }
        int number = (new Random().nextInt())%200;
        if( checkPrime.isPrime(number))
        {
            println("${number} is Prime");
        }
        else {
            println("${number} is not Prime");
        }
        People people =list.stream().min((People p1,People p2) ->{p1.getAge()-p2.getAge()}).get();
        list.stream().filter(p1-> p1.getAge()>25).forEach(p1-> println(p1.getName()));
        println("Single stream");
        list.stream().forEach(p1-> println(p1));
        println("parallelStream ");
        list.parallelStream().forEach(p1-> println(p1));
        println(people);

    }
}
