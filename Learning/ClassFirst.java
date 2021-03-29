public  class ClassFirst {
    static class student{
        int id;
        String name;
        student(int i,String n){
            id = i;
            name = n;
        }
        void print(){System.out.println(id+" "+name);}
    }
    public static void main(String[] args) {
        student s1 = new student(123,"abc");
        s1.print();
    }
}
