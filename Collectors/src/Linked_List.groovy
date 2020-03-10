class Linked_List<T> implements Iterable<T> {
    Nodes<T> head, tail;
    public void add(T data) {
        Nodes<T> node = new Nodes<T>(data, null);
        if (head == null) {
            tail = head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }

    }

    public Nodes<T> gethead() {
        return head;
    }

    public Nodes<T> gettail() {
        return tail;
    }

    @Override
    Iterator<T> iterator() {
        return new ListIterator<T>(this);

    }
}
    class ListIterator<T> implements  Iterator<T>
    {
        Nodes<T> current;
        public ListIterator (Linked_List<T> list)
        {
            this.current= list.gethead();
        }
        @Override
        boolean hasNext() {
          return  current!=null;
        }

        @Override
        T next() {
            T data= current.getData();
            current=current.getNext();
            return data;
        }

        @Override
        void remove() {
            super.remove()
        }
    }

