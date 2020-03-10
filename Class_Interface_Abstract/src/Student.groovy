class Student implements  Great {
    public static final String SchoolName="TMA Solution";
    private String Mssv;
    private String NameSv;

    public Student(String mssv,String name )
    {
        this.Mssv= mssv;
        this.NameSv=name;
    }
    public void great()
    {
        println("Hello student ${NameSv} with id ${Mssv}");
    }
}
