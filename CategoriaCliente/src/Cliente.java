import javax.swing.JOptionPane;


public class Cliente {
	
	private String nome;
	private double numeroConta;
	private double saldoMedia;
	/**
	 * 
	 */
	public Cliente() {
		this("",0,0);
	}
	

	public Cliente(String nome, double numeroConta, double saldoMedia) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldoMedia = saldoMedia;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldoMedia() {
		return saldoMedia;
	}


	public void setSaldoMedia(double saldoMedia) {
		this.saldoMedia = saldoMedia;
	}


	public void calcularSaldo(){
		this.setNome(JOptionPane.showInputDialog("Digite o nome"));
		this.setNumeroConta(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da Conta")));
		this.setSaldoMedia(Double.parseDouble(JOptionPane.showInputDialog("Digite a média do Saldo")));
		if (saldoMedia < 1000 ){
			JOptionPane.showMessageDialog(null,"Cliente Comum " + this.getSaldoMedia());
		}else{
		 if (saldoMedia >= 1000 && saldoMedia < 2500){
			 JOptionPane.showMessageDialog(null,"Cliente Prata " + this.getSaldoMedia());
		}else{
			if (saldoMedia >= 2500){
				JOptionPane.showMessageDialog(null,"Cliente Ouro " + this.getSaldoMedia());
			}
		}
	}		
}	
	}