package Problem_1;

public class ZigzagArray {

    public void zigZag(int a[], int n){
        // Code your solution here.
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(flag){
                if(a[i]>a[i+1]) {
                    swap(a, i);
                }
            }
            else{
                if(a[i]<a[i+1]) {
                    swap(a, i);
                }
            }
            flag=!flag;
        }
    }

    public void swap(int []a, int i){
        int temp=a[i+1];
        a[i+1]=a[i];
        a[i]=temp;
    }
}
