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
	this.setGratificacao(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor da Gratifica��o: ")));
	this.setSalarioFinal(this.getGratificacao() + this.getValorBonificacao() + this.getSalarioBase());
}
	public void apresentarSalario(){
	
		JOptionPane.showMessageDialog(null, "\n Nome: " + this.getNome() + "\n Valor Sal�rio Base: " + this.getSalarioBase()  + "\n Valor da Bonifica��o: " + this.getValorBonificacao() + "\n Valor da Gratifica��o: " + this.getGratificacao() + "\n Valor do Salario Final: " + this.getSalarioFinal());
				
	}
}
	