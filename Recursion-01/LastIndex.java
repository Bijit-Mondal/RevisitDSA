public class LastIndex{
    public static int lastIndex(int[] list,int k,int index){
        if(index == list.length){
            return -1;
        }
        int idx = lastIndex(list,k,index+1);
        if(idx == -1){
            if(list[index] == k){
                return index;
            }else{
                return -1;
            }
        }else{
            return idx;
        }
    }
    public static void main(String[] args){
        System.out.println(lastIndex(new int[]{1,2,3,10,5,6,10,8,9,10},10,0));
    }
}
