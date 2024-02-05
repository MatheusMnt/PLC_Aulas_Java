package Objects;

public class Banco {

    private Conta contas[];
    private int indice ;

    public Banco() {
        this.indice = 0;
        this.contas = new Conta[100];        
    }

    public void cadastrar(Conta newConta){
        this.contas[indice] = newConta;
        // this.contas[indice].setNumero(newConta.getNumero());
        // this.contas[indice].setSaldo(newConta.getSaldo());
        indice++;
    }

    public void creditar(int numConta, double valor){
        boolean achou = false;

        for(int i = 0;(!achou) && i <= indice; i++){
            if(this.contas[i].getNumero() == numConta){
                achou = true;
                this.contas[i].creditar(valor);
            }
        }
    }

    public void debitar(int numConta, double valor){
        boolean achou = false;

        for(int i = 0;(!achou) && i <= indice; i++){
            if(this.contas[i].getNumero() == numConta){
                achou = true;
                this.contas[i].debitar(valor);
            }
        }
    }

    public double getSaldo(int numConta){
        double saldo = 0.0;
        boolean achou = false; 
        for(int i = 0;(!achou) && i <= indice; i++){
            if(this.contas[i].getNumero() == numConta){
                saldo =  this.contas[i].getSaldo();
            }
        }
        return saldo;
    }
}
