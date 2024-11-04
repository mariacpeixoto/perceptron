
public class Main {
    public static void main(String[] args) {
        // Instanciando o Perceptron
        Perceptron perceptron = new Perceptron();
        
        // Treinando o Perceptron
        System.out.println("Treinando o perceptron...");
        perceptron.treinar();
        System.out.println("Treinamento concluído após " + perceptron.getCount() + " épocas.");
        
        // Testando o perceptron com diferentes entradas
        System.out.println("Testando o perceptron:");
        
        int[][] entradasDeTeste = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };
        
        for (int[] entrada : entradasDeTeste) {
            int resultado = perceptron.executar(entrada[0], entrada[1]);
            System.out.println("Entrada: (" + entrada[0] + ", " + entrada[1] + ") -> Saída: " + resultado);
        }
    }
}

