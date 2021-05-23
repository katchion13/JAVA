import javax.swing.JOptionPane;

public class Gerente extends Funcionario {

	private double gratificacao;
	public Gerente(){
		this(0);
	}

	public Gerente(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public double getGratificacao() {
	return gratificacao;
}
public void setGratificacao(double gratificacao) {
	this.gratificacao = gratificacao;
}
public void calcularSalarioFinal(){
	this.setGratificacao(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor da Gratificação: ")));
	this.setSalarioFinal(this.getGratificacao() + this.getValorBonificacao() + this.getSalarioBase());
}
	public void apresentarSalario(){
	
		JOptionPane.showMessageDialog(null, "\n Nome: " + this.getNome() + "\n Valor Salário Base: " + this.getSalarioBase()  + "\n Valor da Bonificação: " + this.getValorBonificacao() + "\n Valor da Gratificação: " + this.getGratificacao() + "\n Valor do Salario Final: " + this.getSalarioFinal());
				
	}
}
	