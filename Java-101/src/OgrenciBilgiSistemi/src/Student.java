public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;

    Double avarage;
    Double notlar;
    Double notlar2;
    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.notlar = 0.0;
        this.notlar2 = 0.0;
        this.isPass = false;
    }

    void opinionNote(int sozlu1, int sozlu2, int sozlu3)
    {
        if(sozlu1 >= 0 && sozlu1 <= 100)
        {
            this.c1.notes = sozlu1;
        }
        if(sozlu2 >= 0 && sozlu2 <= 100)
        {
            this.c2.notes = sozlu2;
        }
        if(sozlu3 >= 0 && sozlu3 <= 100)
        {
            this.c3.notes = sozlu3;
        }
    }

    void addBulkExamNote(int note1, int note2, int note3)
    {
        if (note1 >= 0 && note1 <= 100)
        {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100)
        {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100)
        {
            this.c3.note = note3;
        }
    }

    void isPass(){
        System.out.println("===================");
        this.notlar = (this.c1.note*0.80) + (this.c2.note*0.80) + (this.c3.note*0.80);
        this.notlar2 = (this.c1.notes*0.20) + (this.c2.notes*0.20) + (this.c3.notes*0.20);
        this.avarage = (this.notlar + this.notlar2) / 3.0;
        if (this.avarage > 55)
        {
            System.out.println("Helal Kardeşim Geçtin Sınıfı");
            this.isPass = true;
        }
        else
        {
            System.out.println("La Kardeş kaldın lan ");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println("+++++++++++++++++++++");
        System.out.println(this.c1.name + " Sözlü\t:" + this.c1.notes);
        System.out.println(this.c2.name + " Sözlü\t:" + this.c2.notes);
        System.out.println(this.c3.name + " Sözlü\t:" + this.c3.notes);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}
