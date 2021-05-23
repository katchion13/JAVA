import javax.swing.JOptionPane;


public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private double rendaMensal;
	private double limiteCredito;
	
	public Cliente(){
		this(0,"","",0,0);
	}
	public Cliente(int id, String nome, String endereco, double rendaMensal,
			double limiteCredito) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
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
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public void cadastrarCliente(){
		this.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite oID")));
		this.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		this.setEndereco(JOptionPane.showInputDialog("Digite o Endereço"));
		this.setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite a Renda Mensal")));
		this.setLimiteCredito(Double.parseDouble(JOptionPane.showInputDialog("Digite o Limite de Crédito")));
		}
	public void listarCliente(){
		JOptionPane.showMessageDialog(null, "\n ID: " + this.getId() + "\n Nome: " + this.getNome() + "\n Endereço: " + this.getEndereco() + "\n Renda Mensal: " + this.getRendaMensal()+ "\n Limite de Crédito: " + this.getRendaMensal());
	}
		public double calcularLimiteCredito(){
			this.setLimiteCredito(this.getRendaMensal() * 0.40);
			JOptionPane.showMessageDialog(null, "O limite de crédito é: " + this.getLimiteCredito());
			return this.getLimiteCredito();
					}
		
		
					public boolean confirmarCompra(double valor){
				if(valor <= this.getLimiteCredito()){
					JOptionPane.showMessageDialog(null,"Valor do Limite anterior" + this.getLimiteCredito());
					JOptionPane.showMessageDialog(null,"Novo Crédito" + this.getLimiteCredito());
					this.setLimiteCredito(valor - this.getLimiteCredito());
				return true;
				}else{
					return false;
				}							
			}			
	}
	
