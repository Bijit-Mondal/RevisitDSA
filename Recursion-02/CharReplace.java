public class CharReplace{
    public static String replace(String str,char toReplace,char replaceWith){
        if(str.length() == 0){
            return str;
        }
        String smallString = replace(str.substring(1),toReplace,replaceWith);
        if(str.charAt(0) == toReplace){
            return replaceWith + smallString;
        }else{
            return str.charAt(0)+ smallString;
        }
    }
    public static void main(String[] args){
        System.out.println(replace("abacd",'a','x'));
    }
}
