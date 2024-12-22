public class Pattern38 {
    
    public static void main(String[] args) {
        
        int a = 1;
        int b = 5;
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                if(i == a && j == b ){  //j == n - i + 1 [Can also use]
                    System.out.print("*");
                    a++;
                    b--;
                } else if(i==1 || j==5 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
