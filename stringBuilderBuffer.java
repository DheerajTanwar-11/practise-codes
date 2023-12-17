public class stringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder sbtr = new StringBuilder();
        sbtr.append("Hello!");
        sbtr.insert(6, ", World");
        sbtr.replace(7, 8, "");
        System.out.println("String Builder: " + sbtr);
        StringBuffer sbtrB = new StringBuffer();
        sbtrB.append("Hello!");
        sbtrB.insert(6, ", World");
        sbtrB.replace(7, 8, "");
        System.out.println("StringBuffer: " + sbtrB);
    }
}
