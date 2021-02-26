import java.util.Scanner;


public class Main {
    public static int compare(char[] a , char[] b){
        int len,i,j=0;
        if(a.length<b.length){
            return  0;
        }
        else {
            len = a.length - b.length;
            for(i=len;i<a.length;i++){
                if(a[i]!=b[j])return 0;
                else j++;
            }
        }

    return  1;}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n = input.nextInt();
        for(i=0;i<n;i++){
            char[] a,b;
            a= input.next().toCharArray();
            b = input.next().toCharArray();
            int value = Main.compare(a,b);

           if(value==1)System.out.println("encaixa");
           else System.out.println("nao encaixa");

        }
    }


}
