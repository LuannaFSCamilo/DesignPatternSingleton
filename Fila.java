public class Fila {
    // Instância única da classe Fila
    private static Fila instance;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private Fila() {

    }

    // Método estático para obter a instância única da classe Fila
    public static Fila getInstance(){
// Lazy initialization: a instância é criada apenas quando necessário
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    // Métodos para operações na fila de impressão
    public void ImprimeDocumento() { }

    public void RemoveDocumento() { }

    public void RemoveTodosDocumentos() { }
}
