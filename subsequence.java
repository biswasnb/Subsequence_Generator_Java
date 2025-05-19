import java.util.Scanner;
class subsequence{
    public static void print(String str,String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch1=str.charAt(0);

        print(str.substring(1), ans + ch1);
        
        print(str.substring(1), ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        String str = sc.nextLine();
        
        print(str, "");
        sc.close();
    }
}



