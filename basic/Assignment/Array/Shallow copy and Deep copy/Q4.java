public class Q4 {

    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void show(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        printn(new int[]{1,2,3,4,5});
        int b=89;
        show(b);
    }
}
