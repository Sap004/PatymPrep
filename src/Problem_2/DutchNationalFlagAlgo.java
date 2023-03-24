package Problem_2;

public class DutchNationalFlagAlgo {
    public static void sort012(int a[], int n)
    {
        // code here
        int l=0,m=0;
        int r=n-1;
        int p=1;
        while(m<=r){
            if(a[m]<p){
                swap(a,l,m);
                l++;m++;
            }
            else if(a[m]>p){
                swap(a,m,r);
                r--;
            }
            else{
                m++;
            }
        }
    }

    public static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
