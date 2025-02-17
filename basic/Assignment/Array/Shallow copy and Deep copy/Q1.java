public class Q1 {

    public static void print(int a[]){
        int max = 0;
        int index = 0;
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                index = i;
            }
            count++;
        }
        System.out.println("Max element is "+max + " at index "+index);

        System.out.println("Number of elements "+count);
    }

    public static void main(String[] args) {
        
        int a[]={34,65,243,544,643,232,543,322};

        print(a);
    }
}