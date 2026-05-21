public class InventarioLetras {
    //atributos
    int[] inventario = new int[26];
    int totalCount;
    int nonZeroCount;
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
    //metodos
    public int size(){
        return totalCount;
    }
    public boolean isEmpty(){
        if (nonZeroCount == 0){
            return true;
        }
        else {
            return false;
        }
    }
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

}
