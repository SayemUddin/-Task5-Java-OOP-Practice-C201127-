public class Ice {
    public static void main(String []args){
        Teacher Teacher1 = new Teacher("Dr. Zafar Iqbal","Male",40,40000);
        Institution Institution1 = new Institution("International Islamic University ctg",120);
        Teacher1.detailsPrint(Teacher1.getName(),Teacher1.getSex(), Teacher1.getAge(), Teacher1.getSalary() );
        Institution1.detailsPrint(Institution1.getName(), Institution1.getSize());

        /*TO CHANGE OR EDIT:
        Teacher1.setName("Mrs. Shamsunnahar Alam");
        Teacher1.setSex("Female");
        Teacher1.setAge(35);
        Teacher1.setSalary(35000);
        Institution1.setName("IIUC");
        Institution1.setSize(120);
        Teacher1.detailsPrint(Teacher1.getName(),Teacher1.getSex(), Teacher1.getAge(), Teacher1.getSalary() );
        Institution1.detailsPrint(Institution1.getName(), Institution1.getSize());*/
    }
}
