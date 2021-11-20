public class Teacher {
    private String name,sex;
    private int age;
    private double salary;

    public Teacher(){
    }

    public Teacher(String name,String sex,int age,double salary){
        this.name = name;
        this.sex=sex;
        this.age=age;
        this.salary = salary;
    }


    public void detailsPrint(String name,String sex,int age, double salary) {
        System.out.println("Teachers details:"+"\n"+name + "\n "+sex+"\n "+age+"\n " + salary);

    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
}

