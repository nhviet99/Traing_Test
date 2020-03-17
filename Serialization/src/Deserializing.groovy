class Deserializing {
    public static  void PrintObject() {
        Student std = new Student();
        FileInputStream fin = new FileInputStream("Student.data")
        ObjectInputStream out = new ObjectInputStream(fin);
        while (true)
        {
            try {
                std=out.readObject()
                println(std);
            }
            catch (EOFException ex)
            {

                break;
            }
        }
        out.close();
        fin.close()
    }
}
