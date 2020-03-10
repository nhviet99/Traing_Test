class Custom implements Cloneable {
    private String Id,Name;
    public Custom(String Id,String Name)
    {
        this.Id= Id;
        this.Name=Name;
    }

    @Override
    boolean equals(Object cs)  {
        if(cs instanceof Custom) {
            return this.Id.equals(cs.Id) && this.Name.equals(cs.Name);
        }
        return false;
    }
    public void prints()
    {
        println(Id+Name);
    }
    @Override
    int hashCode() {
        return Id.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    String getId() {
        return Id
    }

    void setId(String id) {
        Id = id
    }

    String getName() {
        return Name
    }

    void setName(String name) {
        Name = name
    }
}
