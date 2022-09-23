package WhileLoop;

public class StringJoin {
    public static void main(String[] args) {
        String names = "Pesho Gosho Tosho";
       // за разделяне използваме сплит
        String[] nameArr = names.split(" ");
        // за създаване на стринг от арей използваме join метода
        String namesTogether = String.join(" ",nameArr);
        System.out.println(namesTogether);
    }
}
