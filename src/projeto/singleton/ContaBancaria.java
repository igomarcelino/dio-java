package projeto.singleton;

public class ContaBancaria {
    private static ContaBancaria instancia;
    private double saldo;

    // proibindo a criação da instancia fora da classe
    private ContaBancaria() {
        saldo = 0.0;
    }

    // Método estático para obter a única instância da classe
    public static ContaBancaria getInstancia() {
        if (instancia == null) {
            instancia = new ContaBancaria();
        }
        return instancia;
    }

    // Métodos para depositar 
    public  void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    // metodo para consultar saldo
    public  double consultarSaldo() {
        return saldo;
    }
}
