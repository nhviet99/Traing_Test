class Main {
    public static void main(String[] args) {
        Set<Custom> data = new HashSet<>();
        data.add(new Custom("1","2"));
        data.add(new Custom("1","2"));
        data.add(new Custom("1","3"));
        data.add(new Custom("1","4"));
        for (Custom cs : data)
        {   Custom newcs= cs.clone();
            newcs.setId("abc");
            println(cs.prints());
        }
    }

}
