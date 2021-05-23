import javax.swing.JOptionPane;


public class Produto {
	
	private String descricao;
	private String genero;
	private int estoqueDisponivel;
	private double precoCusto;
	
	public Produto(){
		this("","",0,0);
		}
	public Produto(String descricao, String genero, int estoqueDisponivel,
			double precoCusto) {
		this.descricao = descricao;
		this.genero = genero;
		this.estoqueDisponivel = estoqueDisponivel;
		this.precoCusto = precoCusto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEstoqueDisponivel() {
		return estoqueDisponivel;
	}
	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public void comprar(int qtde){
		JOptionPane.showMessageDialog(null, "Estoque anterior: " + this.getEstoqueDisponivel()+ "\nQuantidade comprada: " + qtde + "\n Estoque Atual: " + (this.getEstoqueDisponivel()+ qtde));
		this.setEstoqueDisponivel(this.estoqueDisponivel + qtde);
	}
	public void vender(int qtde){
			JOptionPane.showMessageDialog(null, "Estoque anterior: " + this.getEstoqueDisponivel()+ "\nQuantidade comprada: " + qtde + "\n Estoque Atual: " + (this.getEstoqueDisponivel()-qtde));
			this.setEstoqueDisponivel(this.estoqueDisponivel - qtde);
					
		}
		
	}
	
