import java.util.Scanner;


public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int len=str.length();
      String array="";
       int j=1;
       int count=0,m=0;
       int k=array.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                array+=str.charAt(i);
                count++;
                j++;
                System.out.println(String.valueOf(array));
            }
            else {
                if ((str.charAt(i) == '}' && array.charAt(k) == '{') || (str.charAt(i) == ']' &&array.charAt(k) == '[') || (str.charAt(i) == ')' && array.charAt(k) == '(')) {
                    while(k==array.length()){
                        char temp=array.charAt(k);
                    }
                    j++;
                    count--;
                    System.out.println(String.valueOf(array) + "bb");
                }
            }
        }
        System.out.println(count+"ssssw");
        System.out.println(String.valueOf(array)+"hh");
        if(count==0){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
