
       public class Teacher extends Person {

        private double salary;


        public Teacher(String name,double salary) {
            super(name);
            this.salary= salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void detailsPrint(String name, double salary) {
            System.out.println("Teacher name: " +  name  + "   " + "salary: "  + salary); //function overriding

        }
    }
//Md. Sayem Uddin
//C201127

