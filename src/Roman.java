import java.util.HashMap;
import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str= input.nextLine();
       String[] symbol={"I","V","X"};
               int[] value={1,5,10};
               int output=0;
       int len=str.length()-1;

        for(int i=0;i<str.length();i++){
            for(int j=0;j< symbol.length;j++){
                if(String.valueOf(str.charAt(i)).equals(symbol[j])){
                   output+=value[j];

                }
            }
        }
        System.out.println(output);
    }
}
