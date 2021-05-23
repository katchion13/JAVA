import javax.swing.JOptionPane;


public class Cliente {

	private int id;
	private String nome;
	private String endereco;
	private String email;
	private int rendaMensal;
	private double limiteCredito;
	/**
	 * 
	 */
	public Cliente() {
		this (0,"","","",0,0);
	}
	
	public Cliente(int id, String nome, String endereco, String email,
			int rendaMensal, double limiteCredito) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.rendaMensal = rendaMensal;
		this.limiteCredito = limiteCredito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(int rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void cadastrarCliente(){
		this.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		this.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		this.setEndereco(JOptionPane.showInputDialog("Digite o Endereço"));
		this.setEmail(JOptionPane.showInputDialog("Digite o E-mail"));		
		this.setRendaMensal(Integer.parseInt(JOptionPane.showInputDialog("Digite a Renda Mesal")));		
		
	}
	public void listarCliente(){
		JOptionPane.showMessageDialog(null, "\n ID: " + this.getId() + "\n Nome: " + this.getNome() + "\n Endereço: " + this.getEndereco() + "\n E-mail: " + this.getEmail() + "\n Renda Mensal: " + this.getRendaMensal());
	}
	public void calcularLimiteCredito(){
	this.setLimiteCredito(this.getRendaMensal() * 0.40);
	JOptionPane.showMessageDialog(null, "O limite de crédito é: " + this.getLimiteCredito());
	
	}	
		
	}
	
