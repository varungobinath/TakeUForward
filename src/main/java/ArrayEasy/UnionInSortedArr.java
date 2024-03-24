package ArrayEasy;

import java.util.ArrayList;

public class UnionInSortedArr {
    private static ArrayList<Integer> union(int[] arr1,int[] arr2){
        int m = arr1.length,n = arr2.length;
        ArrayList<Integer> lst = new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                if(lst.size()==0 || lst.get(lst.size()-1)!=arr1[i])
                    lst.add(arr1[i]);
                i++;
            }else{
                if(lst.size()==0 || lst.get(lst.size()-1)!=arr2[j])
                    lst.add(arr2[j]);
                j++;
            }
        }
        while(i<m){
            if(lst.get(lst.size()-1)!=arr1[i])
                lst.add(arr1[i]);
            i++;
        }
        while(j<n){
            if(lst.get(lst.size()-1)!=arr2[j])
                lst.add(arr2[j]);
            j++;
        }
        return lst;
    }
    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> lst = union(arr1,arr2);
        for(int i : lst)
            System.out.print(i+" ");
    }
}
