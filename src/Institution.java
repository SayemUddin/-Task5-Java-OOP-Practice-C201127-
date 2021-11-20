public class Institution extends Person {
    private double size;

    public Institution(String name,double size){
        super(name);
        this.size=size;
    }

    public double getSize() {return size;}
    public void setSize(double size) {this.size = size;}

    public void detailsPrint(String name, double size) {
        System.out.println("Insitution details: "+"\n"+  " " +  name  + "\n" + "size"+ " "  + size); //function overriding
    }
}
