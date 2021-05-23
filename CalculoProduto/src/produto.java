import javax.swing.JOptionPane;


public class produto {
	private String nome;
	private int qtde;
	private double valor;
	private double total;
	
	public produto() {
		// TODO Auto-generated constructor stub
	}
	
	public produto(String nome, int qtde, double valor, double total) {
		super();
		this.nome = nome;
		this.qtde = qtde;
		this.valor = valor;
		this.total = total;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void calcularTotal() {
	this.setNome(JOptionPane.showInputDialog("Digite o nome do Produto : " ));
	this.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto : ")));
	this.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor : ")));
	this.setTotal((this.getQtde()*this.getValor()));
	JOptionPane.showMessageDialog(null,"Produto Total é : " + this.getTotal());
	}	
}