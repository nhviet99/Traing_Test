class Priority_Queue<T> {
   private  Nodes<T> phead;
    public Priority_Queue()
    {
        phead=null;
    }



    void setPhead(Nodes<T> phead) {
        this.phead = phead
    }

    public void Insert(Nodes<T> node)
    {
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
                curr.getProperty();
                if(curr.getProperty()<=node.getProperty())
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
