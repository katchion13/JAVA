import javax.swing.JOptionPane;


public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salarioBase;
	private double salarioFinal;
	private double valorBonificacao;
	
	public Funcionario(){
		this("","",0,0,0);
	}
	public Funcionario(String nome, String cpf, double salarioBase,
			double salarioFinal, double valorBonificacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
		this.salarioFinal = salarioFinal;
		this.valorBonificacao = valorBonificacao;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	public double getValorBonificacao() {
		return valorBonificacao;
	}
	public void setValorBonificacao(double valorBonificacao) {
		this.valorBonificacao = valorBonificacao;
	}
	public void cadastrarFuncionario(){
		this.setNome(JOptionPane.showInputDialog("Digite nome: "));
		this.setCpf(JOptionPane.showInputDialog("Digite CPF: "));
		this.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Digitite Salário Base: ")));
		
	}
public void calcularBonificacao(){
	
	this.setValorBonificacao( salarioFinal * 0.05);
		}
}
