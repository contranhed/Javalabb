public class Person {
    private String name;
    private double salary;
    private String gender;

    public Person(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("\nName: %-2s\n Gender: %-2s\n Salary: %2f\n",
                getName(), getGender(), getSalary());
    }
}


