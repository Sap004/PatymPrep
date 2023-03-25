package Problem_5;

import java.util.ArrayList;

public class RearrangeArray {

    public void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negetive = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negetive.add(arr[i]);
            }
        }
        int i = 0, j = 0, c = 0;
        boolean flag = true;
        while (i < positive.size() && j < negetive.size()) {
            if (flag) {
                arr[c++] = positive.get(i++);
            } else {
                arr[c++] = negetive.get(j++);
            }
            flag = !flag;
        }
        while (i <positive.size()) {
            arr[c++] = positive.get(i++);
        }
        while (j < negetive.size()) {
            arr[c++] = negetive.get(j++);
        }
    }
}
