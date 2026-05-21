public class Main {
    public static void main(String[] args) {
        InventarioLetras inv = new InventarioLetras("Hola Mundo");
        System.out.println("size: " + inv.size());
        System.out.println("isEmpty: " + inv.isEmpty());
        System.out.println("get(o): " + inv.get('o'));
        System.out.println("get(5): " + inv.get('5'));
    }
}