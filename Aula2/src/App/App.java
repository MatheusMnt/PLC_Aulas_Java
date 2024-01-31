package App;
import Objects.Conta;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta();
        Conta c2 = new Conta(333, 0.0);
        c.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Conta")));
        c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo em Conta:")));
        JOptionPane.showMessageDialog(null, c.toString(), null, 0);
        c.transferir(c2, Double.parseDouble(JOptionPane.showInputDialog("Valor para Transferir:")));
        JOptionPane.showMessageDialog(null, c.toString(), null, 0); 
        JOptionPane.showMessageDialog(null, c2.toString(), null, 0);
        // c.creditar(Double.parseDouble(JOptionPane.showInputDialog("Creditar:")));
        // JOptionPane.showMessageDialog(null, c.toString(), null, 0);
        // c.debitar(Double.parseDouble(JOptionPane.showInputDialog("Debitar:")));
        // JOptionPane.showMessageDialog(null, c.toString(), null, 0);
    }
}
