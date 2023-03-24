import Problem_1.ZigzagArray;
import Problem_3.Sort0_N_1;

public class Main {
    public static void main(String[] args) {

        //int[] a={6202, 4625, 5469, 2038, 5916, 3405, 5533, 7004, 2469, 9853, 4992, 361, 9819, 3294, 7195, 4036, 9404, 8767, 5404, 1711, 3214, 3100, 3751, 2139, 5437, 4993, 1759, 9572, 6270, 3789, 9623, 2472, 9493};
        int[] a={2,3,1,2,3};
        int n=a.length;
//        System.out.println("Paytm problem 1 - Zigzag array !");
//        System.out.println("Original array");
//        printArray(a,n);
//        ZigzagArray za=new  ZigzagArray();
//        za.zigZag(a,n);
//        System.out.println();
//        System.out.println("Modified array");
//        printArray(a,n);

        System.out.println("Paytm problem 2 - Sort 0-(n-1)");
        System.out.println("Original array");
        printArray(a,n);
        System.out.println();
        System.out.println("Modified array");
        System.out.println(Sort0_N_1.duplicates(a,a.length));

    }

    public static void printArray(int [] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}