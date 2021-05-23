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
		
		this.setValorComissao(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor da Comiss�o: ")));
		this.setSalarioFinal(this.getValorComissao() + this.getSalarioBase() + this.getValorBonificacao());
	}	
				public void apresentarSalario(){
				
					JOptionPane.showMessageDialog(null, "\n Nome: " + this.getNome() + "\n Valor Sal�rio Base: " + this.getSalarioBase()  + "\n Valor da Bonifica��o: " + this.getValorBonificacao() + "\n Valor da Comiss�o: " + this.getValorComissao() + "\n Valor do Salario Final: " + this.getSalarioFinal());
				}
		}


	
	
	
