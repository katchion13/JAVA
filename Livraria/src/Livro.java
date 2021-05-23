import javax.swing.*;

public class Livro extends Produto{
	
	private String autor;
	private String editora;
	private String edicao;
	
	public Livro(){
		this("","",0,0,"","","");
		}

	public Livro(String descricao, String genero, int estoqueDisponivel, double precoCusto, String autor, String editora, String edicao) {
		super(descricao, genero, estoqueDisponivel,precoCusto);		
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
		}	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public void listarProduto(){
	
		JOptionPane.showMessageDialog(null,"Descrição: " + this.getDescricao() + "\n Genero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + 
				"\nPreço de Custo: " + this.getPrecoCusto() + "\nAutor: " + this.getAutor() + "\nEditora: " + this.getEditora() + "\nEdição: " + this.getEdicao());
	
	}
}
	
	
		
	
	