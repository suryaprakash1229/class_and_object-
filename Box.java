public class Box {
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void display(){
        System.out.println("width of Box:"+width);
        System.out.println("Height of Box:"+height);
        System.out.println("depth of Box:"+depth);
    }
    public static void main(String[] args) {
        Box B =new Box(20,50,34);
        B.display();
    }
}  
