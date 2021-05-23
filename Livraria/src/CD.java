import javax.swing.*;
		public class CD extends Produto {
	private String artista;
	private String gravadora;
	private String paisOrigem;
		public CD(){
			this("","",0,0,"","","");
		}

		public CD(String descricao, String genero, int estoqueDisponivel, double precoCusto,
				String artista, String gravadora, String paisOrigem) {
			super(descricao, genero, estoqueDisponivel,precoCusto);		
			this.artista = artista;
			this.gravadora = gravadora;
			this.paisOrigem = paisOrigem;
		}

		public String getArtista() {
			return artista;
		}

		public void setArtista(String artista) {
			this.artista = artista;
		}

		public String getGravadora() {
			return gravadora;
		}

		public void setGravadora(String gravadora) {
			this.gravadora = gravadora;
		}

		public String getPaisOrigem() {
			return paisOrigem;
		}

		public void setPaisOrigem(String paisOrigem) {
			this.paisOrigem = paisOrigem;
		}
		public void listarProduto(){
			
			JOptionPane.showMessageDialog(null,"Descrição: " + this.getDescricao() + "\n Genero: " + this.getGenero() + "\nEstoque: " + this.getEstoqueDisponivel() + 
					"\nPreço de Custo: " + this.getPrecoCusto() + "\nArtista: " + this.getArtista() + "\nGravadora: " + this.getGravadora() + "\nPaís Origem: " + this.getPaisOrigem());
	}
}

