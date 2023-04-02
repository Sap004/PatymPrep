package Problem_6;

import java.util.ArrayList;

public class SpiralMatrix {

    public ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int n=matrix.length;
        int i=0;
        int row=0,col=0;
        while(i<=n){
            for(col=i;col<n-i;col++){
                ans.add(matrix[row][col]);
            }col--;
            i++;
            for(row=i;row<n-i;row++){
                ans.add(matrix[row][col]);
            }
            for(col=row;col>i;col--){
                ans.add(matrix[row][col]);
            }
            i++;
            for(row=n-i-1;row>=i;row--){
                ans.add(matrix[row][col]);
            }
        }
        return ans;
    }
}
