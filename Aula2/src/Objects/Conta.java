package Objects;


public class Conta{
        private int numero;
        private double saldo;
      
        //construtor default
        public Conta(){
            this.numero = 0;
            this.saldo = 0;
        }
      
        //construtor parametrizado
        public Conta(int numero, double saldo){
            this.numero = numero;
            this.saldo = saldo;
        }  
      
      
        public int getNumero(){
          return this.numero;
        }
      
        public double getSaldo(){
          return this.saldo;
        }
      
        public void creditar(double valor){
          this.saldo += valor;
        } 
        public void debitar(double valor){
          this.saldo -= valor;
        }
      
        public void setNumero(int numero){
          this.numero = numero;
        }
      
        public void setSaldo(double saldo){
          this.saldo = saldo;
        }

        public void transferir(Conta contaDestino, double valor){
          this.debitar(valor);
          contaDestino.creditar(valor);
        }
      
        @Override
        public String toString(){
          return "Conta: " + this.numero + "\n" + "Saldo: " + this.saldo;
        }
}
