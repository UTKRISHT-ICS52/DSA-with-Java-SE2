public class StringsBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Utkrisht");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0 
        sb.setCharAt(0, 'A');
        System.out.println(sb);
}
} 
