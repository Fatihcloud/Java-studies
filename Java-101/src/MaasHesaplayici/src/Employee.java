public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax1;
    double bonus1;
    int nowYear = 2021;
    int serviceTime;
    double interest;

    Employee(String name,int salary, int workHours ,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary >= 1000)
        {
            tax1 = (this.salary * 3) / 100;
        }
        else
        {
            tax1 = 0.0;
        }
        return tax1;
    }

    double bonus(){
        if (this.workHours >= 40)
        {
            bonus1 = (this.workHours - 40) * 30;
        }
        else
        {
            bonus1 = 0;
        }
        return bonus1;
    }

    double raiseSalary(){
        serviceTime = nowYear - hireYear;
        if (serviceTime < 10)
        {
            interest = (this.salary * 5) / 100;
        }
        if (serviceTime >= 10 && serviceTime < 20)
        {
            interest = (this.salary * 10) / 100;
        }
        if (serviceTime >= 20)
        {
            interest = (this.salary * 15) / 100;
        }
        return interest;
    }
    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maaş :" + ((-this.tax()+this.bonus())+this.salary));
        System.out.println("Toplam maaş : " + ((-this.tax()+this.bonus()+this.raiseSalary())+this.salary));
        return null;
    }
}
