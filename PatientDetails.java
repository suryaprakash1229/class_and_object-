public class PatientDetails {
    String name;
    double height;
    double width;
    double weight;
    void display(String name,double height,double width){
        this.name=name;
        this.height=height;
        this.width=width;
        System.out.println("patient name:"+name);
        System.out.println("patient height:"+height+" metres");
        System.out.println("patient wdth:"+width+" metres");
    }
    void  computeBMI(double weight,double height){
        this.weight=weight;
        this.height=height;
        double computeBMI=weight/(height*height); 
        System.out.println("patient BMI:"+computeBMI); 
    }
    public static void main(String[] args) {
        PatientDetails pd = new PatientDetails();
        pd.display("ranjith", 5.6, 3);
        pd.computeBMI(60,5.6);
    }
}
