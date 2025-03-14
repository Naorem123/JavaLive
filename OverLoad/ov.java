public class ov {
    void add(int a, int b){
        System.out.println("ans is"+(a+b));
    }
    void add(int a, int b,int c){
        System.out.println("ans is"+(a+b+c));
    }
    public static void main(String[] args) {
        ov obj = new ov();
        obj.add(10,20);
        obj.add(10,20,30);
    }
} 
