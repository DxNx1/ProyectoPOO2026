public class InventarioLetras {
    //atributos
    private int[] inventario = new int[26];
    private int totalCount;
    private int nonZeroCount;
    //constructor
    public InventarioLetras(String data){
        for(int i = 0; i < data.length(); i++) {
            char letra = data.charAt(i);
            char letraMin = Character.toLowerCase(letra);

            if (letraMin >='a' && letraMin <='z'){
                int indice = letraMin - 'a';
                if(inventario[indice] == 0 ){
                    nonZeroCount++;
                }
                inventario[indice]++;
                totalCount++;
            }
        }
    }
    //metodo para saber la cantidad de caracteres totales
    public int size(){
        return totalCount;
    }
    //metodo para verificar si el inventario esta vacio
    public boolean isEmpty(){
        if (nonZeroCount == 0){
            return true;
        }
        else {
            return false;
        }
    }
    //retorna la cantidad de veces que aparece x letra
    public int get(char letra){
        char letraMin = Character.toLowerCase(letra);
        if (letraMin >= 'a' && letraMin <= 'z'){
            int indice = letraMin - 'a';
            return inventario[indice];
        }
        else {
            throw new IllegalArgumentException("Carácter no alfabético: " + letra);
        }
    }
    //establece una determinada cantidad de apariciones a una letra especifica
    public void set(char letra, int valor) {
        char letraMin = Character.toLowerCase(letra);
        if (letraMin < 'a' || letraMin > 'z' || valor < 0) {
            throw new IllegalArgumentException("Carácter no alfabético o valor negativo: " + letra + valor);
        } else {
            int indice = letraMin - 'a';
            totalCount = totalCount - inventario[indice] + valor;
            if (inventario[indice] == 0 && valor > 0) {
                nonZeroCount++;
            }
            if (inventario[indice] > 0 && valor == 0) {
                nonZeroCount--;
            }
            inventario[indice] = valor;
        }
    }
//retorna los caracteres que aparecen ordenados de manera alfabetica
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < 26; i++){
            if (inventario[i] > 0){
                int aux = inventario[i];
                char letra = (char) ('a' + i);
                for (int j = 0; j < aux; j++){
                    resultado += letra;
                }
            }
        }
        resultado += "]";
        return resultado;
    }
    //metodo que encripta una letra en especifico a 3 casillas a la derecha
    public char encriptarCesar(char letra){
        char letraMin = Character.toLowerCase(letra);
        int indice = letraMin - 'a';
        indice = (indice + 3) % 26;
        char enc = (char) ('a' + indice);
        return enc;
    }
    //metodo que desencripta la letra encriptada moviendola 3 casillas a la izquierda
    public  char desencriptarCesar(char letra){
        char letraMin = Character.toLowerCase(letra);
        int indice = letraMin - 'a';
        indice = (indice - 3 + 26) % 26;
        char desEnc = (char) ('a' + indice);
        return desEnc;
    }
    //metodo que encriptara una palabra con un determinado numero de casillas a desplazar
    public String encriptarPalabra(String palabra, int desplazamiento) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letraMin = Character.toLowerCase(palabra.charAt(i));
            int indice = letraMin - 'a';
            indice = (indice + desplazamiento) % 26;
            char encPal = (char) ('a' + indice);
            resultado += encPal;
        }
        return resultado;
    }
    //metodo utilizado para desencriptar una palabra usando una cantidad determinada de casillas a mover
    public String desencriptarPalabra(String palabra, int desplazamiento) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letraMin = Character.toLowerCase(palabra.charAt(i));
            int indice = letraMin - 'a';
            indice = (indice - desplazamiento + 26) % 26;
            char desEncPal = (char) ('a' + indice);
            resultado += desEncPal;
        }
        return resultado;
    }
    //metodo que crea una nueva lista que junta 2 listas y retorna la cantidad de caracteres ordenados de manera alfabetica
    public InventarioLetras add(InventarioLetras otro) {
        InventarioLetras nuevo = new InventarioLetras("");
        for (int i = 0; i < 26; i++) {
            int aux = this.inventario[i] + otro.inventario[i];
            char letra = (char) ('a' + i);
            nuevo.set(letra, aux);
        }
        return nuevo;
    }
    //metodo que multiplica las cantidades de letras existentes y las retorna
    public InventarioLetras amplifies(int n){
        InventarioLetras nuevo = new InventarioLetras("");
        for (int i = 0; i < 26; i++){
            int aux = this.inventario[i] * n;
            char letra = (char) ('a' + i);
            nuevo.set(letra, aux);
        }
        return nuevo;
    }
    //metodo que resta 2 inventarios de letras y retorna el resultante
    public InventarioLetras subtract(InventarioLetras otro){
        InventarioLetras nuevo = new InventarioLetras("");
        for (int i = 0; i < 26; i++) {
            int aux = this.inventario[i] - otro.inventario[i];
            if (aux < 0){
                return null;
            }
            char letra = (char) ('a' + i);
            nuevo.set(letra, aux);
        }
        return nuevo;
    }
}
