public class CalculatePower {
    static void powerInt(int a,int b){
         System.out.println("power integer:"+Math.pow(a, b));
    }
    static void powerDouble(double a,double b){
        System.out.println("power double: "+Math.pow(a, b));
    } 
    public static void main(String[] args) {
        CalculatePower cp=new CalculatePower();
        cp.powerInt(2, 4);
        cp.powerDouble(2.5, 3);
    }
}