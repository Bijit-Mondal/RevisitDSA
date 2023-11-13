public class CharRemove{
    public static String remove(String s,char toRemove){
        if(s.length() == 0){
            return s;
        }
        String smallString = remove(s.substring(1),toRemove);
        if(s.charAt(0) == toRemove){
            return smallString;
        }else{
            return s.charAt(0) + smallString;
        }
    }
    public static void main(String[] args){
        System.out.println(remove("abacd",'a'));
    }
}
