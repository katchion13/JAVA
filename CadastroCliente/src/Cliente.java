import javax.swing.JOptionPane;


public class Cliente {
	private String nome;
	private String end;
	private String rg;
	public Cliente() {

		this("","","");	
}
		public Cliente(String nome, String end, String rg) {
		super();
		this.nome = nome;
		this.end = end;
		this.rg = rg;
	}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEnd() {
			return end;
		}
		public void setEnd(String end) {
			this.end = end;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
	
		public void cadastrarCliente() {
			this.setNome(JOptionPane.showInputDialog("Digite o nome: "));
			this.setEnd(JOptionPane.showInputDialog("Digite o endereço: "));
			this.setRg(JOptionPane.showInputDialog("Digite o rg"));
			
						}
		
		public void listarCliente(){
			JOptionPane.showMessageDialog(null,"Nome: " +this.getNome()+ "\n Endereço: " + this.getEnd()+ "\n RG: " + this.getRg());
		}
}


