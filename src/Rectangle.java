import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // System.out.println("ENter l1");
        int[] l1={0,10};
        int[] l2={5,5};
        //l2[x] should be <= to r1[x] ==true
        //r1[x] should be <= to l2[y] ==true
        //r2[x] should be <= to l1[y]
        int[] r1={10,0};
        int[] r2={15,0};
       int x=0,y=1;
//            if(l2[x]==r2[x] || l2[y]==r2[y] || l1[x]==r1[x] || l1[y]==r1[y]){
//                System.out.println("No");
//            }
            if(l1[x]>=r2[x] || l2[x]>=r1[x] ) {
                System.out.println("No");
                System.exit(0);
            }
            if(r2[y]>=l1[y] || r1[y]>=l2[y]){
                System.out.println("No");
                System.exit(0);
            }
            else{
                System.out.println("Yes");
            }
        }

}
