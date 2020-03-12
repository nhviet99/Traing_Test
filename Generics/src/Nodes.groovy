class Nodes<T> {
    private Nodes<T> pleft, pright;
    private int priority;
    private T data;

    Nodes(int priority, T data) {
        this.pleft = null;
        this.pright = null;
        this.priority = priority
        this.data = data
    }

    Nodes<T> getPleft() {
        return pleft
    }

    void setPleft(Nodes<T> pleft) {
        this.pleft = pleft
    }

    Nodes<T> getPright() {
        return pright
    }

    void setPright(Nodes<T> pright) {
        this.pright = pright
    }

    int getPriority() {
        return priority
    }

    void setPriority(int priority) {
        this.priority = priority
    }

    T getData() {
        return data
    }

    void setData(T data) {
        this.data = data
    }
}
