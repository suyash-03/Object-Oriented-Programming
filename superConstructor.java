class Box{
    public int h;
    public int w;
    public int l;
    
    Box(int h,int w,int l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
}

class BoxDimensions extends Box{
    int weight;
    BoxDimensions(int h,int w,int l,int weight){
        //Used to call the constructor of the superclass
        //always the first statement inside the subclass constructor
        super(h,w,l);
        this.weight = weight;
        //this.weight = super.h
    }
}

public class superConstructor {
    public static void main(String[] args) {
        BoxDimensions bd = new BoxDimensions(1,2,3,4);
        System.out.println(bd.h);
    }
}
