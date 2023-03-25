package Problem_3;

import java.util.ArrayList;

public class Sort0_N_1 {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
        }
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2)
                ans.add(i);
        }
        return ans;
    }
}
