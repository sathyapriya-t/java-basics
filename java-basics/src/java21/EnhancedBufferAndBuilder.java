package java21;

public class EnhancedBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sathya");

        //new Enhanced method in stringBuffer and Builder
        stringBuilder.repeat("p",4);
        System.out.println(stringBuilder);
    }
}
