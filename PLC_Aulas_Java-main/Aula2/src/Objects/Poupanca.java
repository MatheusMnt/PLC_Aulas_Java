package Objects;

public class Poupanca extends Conta {
    public Poupanca (int numero){
        super(numero);
    }

    public void renderJuros(double rendimento){
        double taxa = 1 + rendimento;
        double newSaldo = this.getSaldo() * taxa;
        this.setSaldo(newSaldo);
    }
}