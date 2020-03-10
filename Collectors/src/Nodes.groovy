class Nodes<T> {
    T data;
    Nodes<T> next;
    public Nodes(T data, Nodes<T> next)
    {
        this.data= data;
        this.next= next;
    }
    public void setData(T data)
    {
        this.data= data;
    }
    public void setNext(Nodes<T> next)
    {
        this.next=next;
    }
    public T getData()
    {
        return data;
    }

    public Nodes<T> getNext()
    {
        return next;
    }
}
