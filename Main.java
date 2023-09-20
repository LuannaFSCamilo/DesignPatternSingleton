public class Main {
    public static void main(String[] args) {
        /**
         * public -> Modificador de acesso que permite que esta classe seja acessível de qualquer lugar
         * static -> Modificador que indica que o método 'main' pertence à classe Main em vez de a uma instância específica da classe
         * void -> Tipo de retorno do método 'main', que significa que o método não retorna nenhum valor
         */
        // Criação de uma variável chamada 'fila' do tipo Fila para armazenar a instância da fila de impressão.
        Fila fila = Fila.getInstance();
        // 'getInstance()' é um método estático da classe Fila, que retorna a instância única da fila de impressão
        // conforme definido pelo Singleton Pattern
    }
}