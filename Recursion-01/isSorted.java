import java.util.*;
public class isSorted{
    public static boolean sorted(List<Integer> list){
        int size = list.size();
        if(size == 0 || size == 1){
            return true;
        }
        if(list.get(0) > list.get(1)){
            return false;
        }
        return sorted(list.subList(1, size));
    }
    public static void main(String[] args){
        System.out.println(sorted(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2)));
    }
}
