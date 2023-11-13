public class FirstIndex{
    public static int helper(int[] list,int k,int index){
        if(index == list.length){
            return -1;
        }
        if(list[index] == k){
            return index;
        }
        return helper(list,k,index+1);
    }
    public static void main(String[] args){
        System.out.println(helper(new int[]{1,2,5,4,5,6,7,8,9,10},10,0));
    }
}
