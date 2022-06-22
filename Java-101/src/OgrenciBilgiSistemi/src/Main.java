public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Fatih Bulut","Fizik","532 286 98 80");
        Teacher t2 = new Teacher("Eren Gun","Grafik","531 231 31 31");
        Teacher t3 = new Teacher("Muhammed Karamuk","Bilgisayar","532 555 222 111");

        Course Grafik = new Course("Grafik","101","Grafik");
        Grafik.addTeacher(t2);

        Course fizik = new Course("Fizik","102","Fizik");
        fizik.addTeacher(t1);

        Course Bilgisayar = new Course("Bilgisayar","103","Bilgisayar");
        Bilgisayar.addTeacher(t3);

        Student s1 = new Student("Talha Aksoy","123","4",Grafik,fizik,Bilgisayar);
        s1.addBulkExamNote(100,100,100);
        s1.opinionNote(1,2,3);
        s1.isPass();

        Student s2 = new Student("Samim","666","5",Grafik,fizik,Bilgisayar);
        s2.addBulkExamNote(100,100,100);
        s2.opinionNote(4,5,6);
        s2.isPass();
    }
}
