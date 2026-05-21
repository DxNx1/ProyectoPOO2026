public class InventarioLetras {
    //atributos
    int[] inventario = new int[26];
    int totalCount;
    int nonZeroCount;

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
}
