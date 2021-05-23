import javax.swing.JOptionPane;


public class Aluno {
	
	private String nome;
	private double prova1;
	private double prova2;
	/**
	 * 
	 */
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getProva1() {
		return prova1;
	}
	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}
	public double getProva2() {
		return prova2;
	}
	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}
	
	public void calcularMedia(){
		this.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		this.setProva1(Double.parseDouble(JOptionPane.showInputDialog("Digte a nota da Prova1")));
		this.setProva2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova2")));
		 double media=((this.getProva1()+this.getProva2())/2);
		if(media<3){
			JOptionPane.showMessageDialog(null,"O Aluno está Reprovado");
		}else{
			if (media<5){
			JOptionPane.showMessageDialog(null,"Aluno está em Exame");	
		}else{
			if (media >=5){
			JOptionPane.showMessageDialog(null,"O Aluno está Aprovado");
	}
		}
		}
		
	}	
	public void listarSitucao(){
		
		JOptionPane.showMessageDialog(null,"Nome: " +this.getNome()+ "\n Prova1: " +this.getProva1() + "\n Prova2: " +this.getProva2());
		}
						
	}
