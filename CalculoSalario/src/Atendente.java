import javax.swing.JOptionPane;

public class Atendente extends Funcionario {
	
	private double adicionalNoturno;
	public Atendente(){
		this(0);
	}
		public Atendente(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}
	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

public void calcularSalarioFinal(){
		
		this.setAdicionalNoturno(Double.parseDouble(JOptionPane.showInputDialog("Digite Adicional Noturno: ")));
		this.setSalarioFinal(this.adicionalNoturno + this.getSalarioBase()+ this.getValorBonificacao());
	}	
				public void apresentarSalario(){
				
					JOptionPane.showMessageDialog(null, "\n Nome: " + this.getNome() + "\n Valor Salário Base: " + this.getSalarioBase()  + "\n Valor da Bonificação: " + this.getValorBonificacao() + "\n Adicional Noturno: " + this.getAdicionalNoturno() + "\n Valor do Salario Final: " + this.getSalarioFinal());
				}
		}
	