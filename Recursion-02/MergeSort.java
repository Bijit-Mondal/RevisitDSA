import java.util.*;
public class MergeSort{
    public static void merge(List<Integer> left,List<Integer> right,List<Integer> list){
        int i=0,j=0,k=0;
        while(i<left.size() && j<right.size()){
            if(left.get(i)<right.get(j)){
                list.set(k,left.get(i));
                i++;
            }
            else{
                list.set(k,right.get(j));
                j++;
            }
            k++;
        }
        while(i<left.size()){
            list.set(k,left.get(i));
            i++;
            k++;
        }
        while(j<right.size()){
            list.set(k,right.get(j));
            j++;
            k++;
        }
    }
    public static void mergeSort(List<Integer> list){
        if(list.size() <= 1) return;
        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i=0;i<mid;i++){
            left.add(list.get(i));
        }
        for(int i=mid;i<list.size();i++){
            right.add(list.get(i));
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, list);
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(5,44,31,32,61));
        mergeSort(list);
        System.out.println(list);
    }
}
