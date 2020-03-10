class Maps {
    public static void main(String[] args)
    {
        Map<String, String> data= new HashMap<String,String>();
        data.put("Name","Nguuyen Van A");
        data.put("Age","18");
        data.put("Address","TMA Solution");
        Set<String> set= data.keySet();
        for (String it : set )
        {
            println("${it}: ${data.get(it)}");
        }
        Linked_List<String> list =new Linked_List<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for( String it : list)
        {
            println(it);
        }
    }
}
