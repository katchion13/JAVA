import javax.swing.*;

public class DVD  extends Produto {
	private String diretor;
	private String duracao;
	private String censura;
		public DVD(){
		this("","",0,0,"","","");
	}
		public DVD(String descricao, String genero, int estoqueDisponivel, double precoCusto, String diretor, String duracao, String censura) {
			super(descricao, genero, estoqueDisponivel,precoCusto);	
			this.diretor = diretor;
			this.duracao = duracao;
			this.censura = censura;
		}
		public String getDiretor() {
			return diretor;
		}
		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}
		public String getDuracao() {
			return duracao;
		}
		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}
		public String getCensura() {
			return censura;
		}
		public void setCensura(String censura) {
			this.censura = censura;
		}
public void listarProduto(){
			
			JOptionPane.showMessageDialog(null,"Descrição: " + this.getDescricao() + "\n Genero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + 
					"\nPreço de Custo: " + this.getPrecoCusto() + "\nDiretor: " + this.getDiretor() + "\nDuração: " + this.getDuracao() + "\nCensura: " + this.getCensura());
}
}
