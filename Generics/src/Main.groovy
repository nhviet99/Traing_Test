class Main {
    public static void main(String[]args) {
      Priority_Queue<String> list= new Priority_Queue<>();
        list.Insert(new Nodes<String>(1,"Learn Code"));
        list.Insert(new Nodes<String>(5,"Sleeping"));
        list.Insert(new Nodes<String>(2,"Working"));
        list.Insert(new Nodes<String>(4,"Reading"));
        list.prints(list.gethead());

    }
}
