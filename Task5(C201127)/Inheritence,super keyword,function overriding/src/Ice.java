public class Ice {
    public static void main (String []args){
        Institution Institution1 = new Institution("Muslim High School",360000);
        Teacher Teacher1 = new Teacher("Shamsul Alam",36000);




        Institution1.setName("Collegiate school");
        Institution1.setSize(37000);
        Teacher1.setName("Tanveer Hossain");
        Teacher1.setSalary(340000);

        Institution1.detailsPrint(Institution1.getName(),Institution1.getSize());//read
        Teacher1.detailsPrint(Teacher1.getName(),Teacher1.getSalary());//read



        //Md. Sayem Uddin
        //C201127

    }
}
