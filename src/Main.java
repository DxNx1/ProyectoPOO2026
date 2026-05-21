public class Main {
    public static void main(String[] args) {
        InventarioLetras inv = new InventarioLetras("Hola Mundo");
        System.out.println("size: " + inv.size());
        System.out.println("isEmpty: " + inv.isEmpty());
        System.out.println("get(o): " + inv.get('o'));

        System.out.println(inv.encriptarCesar('a'));
        System.out.println(inv.desencriptarCesar('d'));
        System.out.println(inv.encriptarCesar('z'));

        System.out.println(inv.encriptarPalabra("zeroa", 4));
        System.out.println(inv.desencriptarPalabra("divse", 4));

        InventarioLetras inv1 = new InventarioLetras("Alan Turing");
        InventarioLetras inv2 = new InventarioLetras("Ada Lovelace");
        InventarioLetras suma = inv1.add(inv2);
        System.out.println(suma);

        InventarioLetras inv4 = new InventarioLetras("hola");
        System.out.println(inv4);
        System.out.println(inv4.amplifies(3));

        InventarioLetras inv5 = new InventarioLetras("aabbcc");
        InventarioLetras inv6 = new InventarioLetras("ab");

        System.out.println(inv5.subtract(inv6));
        System.out.println(inv6.subtract(inv5));

    }
}