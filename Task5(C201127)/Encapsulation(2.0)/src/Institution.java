public class Institution {
    private String name;
    private double size;

    public Institution() {
    }

    public Institution(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void detailsPrint(String name, double size) {
        System.out.println(name + " " + size);

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public double getSize(){
        return this.size;
    }


    public void setSize(double size){
         this.size = size;
    }

}
//Md. Sayem Uddin
//C201127
