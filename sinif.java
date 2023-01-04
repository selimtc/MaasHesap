public class sinif {
    String name;
    int hireYear;// işe başlangıç yılı

    double salary;// maaş
    int workHours;// çalışma saati

    sinif(String name, double salary, int workHours, int hireYear) {


        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void print() {
        System.out.println("Gülcan" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Çalışma saati" + this.workHours);
        System.out.println("Başlangınç yılı:" + this.hireYear);

    }

    public double tax() {
        double tax = 0;
        if (salary >= 1000) {
            tax = salary * 0.03;

        }
        return tax;
    }

    public int bonus() {
        int bonus = 0;
        if (workHours >= 40) {
            bonus = (workHours - 40) * 30;

        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0;
        if (2021 - hireYear < 10) {
            raise = salary * 0.05;

        }
        if (9 <= 2021 - hireYear && 2021 - hireYear <= 20) {
            raise = salary * 0.10;
        }
        if (2021 - hireYear >= 19) {
            raise = salary * 0.15;

        }

        return raise;
    }

    public String toString() {
        return
                "ADI: " + name +
                        "\nMAAŞI: " + salary +
                        "\nÇALIŞMA SAATİ: " + workHours +
                        "\n BAŞLANGIÇ YILI: " + hireYear +
                        "\nVERGİ: " + tax() +
                        "\nBonus: " + bonus() +
                        "\nMAAŞ ARTIŞI: " + raiseSalary() +
                        "\n VERGİ VE BONUSLAR İLE MAAŞ : " + (salary - tax() + bonus()) +
                        "\nTOPLAM MAAŞ: " + (salary + raiseSalary());


    }


}



