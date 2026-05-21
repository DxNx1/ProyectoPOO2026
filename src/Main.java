public class Main {
    public static void main(String[] args) {
        InventarioLetras inv = new InventarioLetras("Hola Mundo");
        System.out.println("size: " + inv.size());
        System.out.println("isEmpty: " + inv.isEmpty());
        System.out.println("get(o): " + inv.get('o'));

        inv.set('o', 5);
        System.out.println("get('o') despues: " + inv.get('o'));
        System.out.println("size despues: " + inv.size());
        System.out.println(inv.toString());
    }
}