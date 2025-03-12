package command;
public class demo1 {
    /*
     1 cmd file
     2 using variable 
      
     */
    public void add(int x,int y) {
        int z=x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        demo1 obj=new demo1();
        obj.add(10,20);
    }
}