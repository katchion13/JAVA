import javax.swing.JOptionPane;


public class Produto {
	
	private int id;
	private String descricao;
	private int estoqueDisponivel;
	private double precoUnitario;

	public Produto(){
		this(0,"",0,0);
	}

	public Produto(int id, String descricao, int estoqueDisponivel,
			double precoUnitario) {
		this.id = id;
		this.descricao = descricao;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoUnitario = precoUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}

	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	
	
	public void cadastrarProduto(){			
		this.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		this.setDescricao(JOptionPane.showInputDialog("Digite a Descrição"));
		this.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Digite o Estoque Disponível")));
		this.setPrecoUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço Unitário")));
	}
	public void listarProduto(){
		JOptionPane.showMessageDialog(null, "\n ID: " + this.getId() + "\n Descrição: " + this.getDescricao()+ "\n Estoque Disponível: " + this.getEstoqueDisponivel() + "\n Preço Unitário: " + this.getPrecoUnitario());	
	}
 public boolean confirmarPedido(int qtd){
			if(qtd >= this.getEstoqueDisponivel()){
				JOptionPane.showMessageDialog(null,"Estoque Disponível" + this.getEstoqueDisponivel());
						return true;
			}else{
				return false;
			}
	  }
 public double pedido(int qtd){
	 double valor;
	 valor = (qtd * this.getPrecoUnitario());
		 JOptionPane.showMessageDialog(null,"O valor da Compra é" + valor);
		 return valor;
	
	 }
 
 public void vender(int qtd){
	this.setEstoqueDisponivel(this.getEstoqueDisponivel() - qtd);
		 JOptionPane.showMessageDialog(null,"Venda Realizada com Sucesso!!");
			 }
 		}
