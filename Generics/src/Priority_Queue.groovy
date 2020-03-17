class Priority_Queue<T> {
   private  Nodes<T> phead;
    public Priority_Queue()
    {
        phead=null;
    }



    void setPhead(Nodes<T> phead) {
        this.phead = phead
    }

    public void Insert(int priority, T data)
    {
        Nodes<T> node = new Nodes<T>(priority, data);
        if(phead==null)
        {
            setPhead(node);
            return;
        }
        else
        {
            Nodes<T> curr= phead;
            while(curr!=null)
            {

                if(curr.getPriority()<=node.getPriority())
                {
                    curr=curr.getPright();
                }
                else
                {
                    curr=curr.getPleft();
                }
            }
            curr=node;
        }

    }
    public String prints(Nodes<T> current)
    {


        if(current!=null)
        {
            prints(current.getPright());
            println(current.getData());
            prints(current.getPleft());
        }
    }
    Nodes<T> gethead()
    {
        return phead;
    }

}
