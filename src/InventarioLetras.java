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
}
