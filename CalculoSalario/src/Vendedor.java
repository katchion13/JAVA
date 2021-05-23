import javax.swing.JOptionPane;

public class Vendedor extends Funcionario {

	private double valorComissao;
	public Vendedor(){
		this(0);
	}
	
	public Vendedor(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	public double getValorComissao() {
		return valorComissao;
	}
	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}
	public void calcularSalarioFinal(){
		
		this.setValorComissao(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor da Comissão: ")));
		this.setSalarioFinal(this.getValorComissao() + this.getSalarioBase() + this.getValorBonificacao());
	}	
				public void apresentarSalario(){
				
					JOptionPane.showMessageDialog(null, "\n Nome: " + this.getNome() + "\n Valor Salário Base: " + this.getSalarioBase()  + "\n Valor da Bonificação: " + this.getValorBonificacao() + "\n Valor da Comissão: " + this.getValorComissao() + "\n Valor do Salario Final: " + this.getSalarioFinal());
				}
		}


	
	
	
