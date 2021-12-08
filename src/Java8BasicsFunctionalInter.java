
@FunctionalInterface
interface java8Inter
{
    void getData(int a,int b);
}


public class Java8BasicsFunctionalInter {
    public static void main(String[] args) {
        java8Inter j8i=(a1,b1)->{
            System.out.println((a1+b1));

        };
        j8i.getData(20,20);
    }
}
