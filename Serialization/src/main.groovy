class Main {
    public static void main (String[] args)
    {
        ArrayList<Student> data= new ArrayList<>();
        data.add(new Student("1","Nguyen Van A","10000"));
        data.add(new Student("2","Nguyen Van B","20000"));
        data.add(new Student("3","Nguyen Van C","30000"));
        FileOutputStream fout = new FileOutputStream("Student.data");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        data.forEach(i -> {
            out.writeObject(i);
        })
        out.flush();
        out.close();
        fout.close();
        Deserializing.PrintObject();



    }
}
