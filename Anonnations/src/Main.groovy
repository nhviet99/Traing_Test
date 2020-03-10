class Main {
    public static void main(String[] args)
    {
        ProccessAnnotaion annotaion= new ProccessAnnotaion();
        User user1= new User("Nguyen Van A",20,"TMA Solution");
        User user2= new User("Nguyen Van B", 15,"Tuong Minh Company");
        try {
            String json =annotaion.parsetoJson(user1)
            println("User 1: ${json}");
            json =annotaion.parsetoJson(user2);
            println("User 2: ${json}");


        }
        catch (Exception ex)
        {
            println(ex.toString());
        }
    }
}
