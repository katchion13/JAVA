import javax.swing.JOptionPane;


public class Aluno {
	
	private String nome;
	private String end;
	private double nota1;
	private double nota2;
	private double media;
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
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public void cadastrarAluno(){
		this.setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno"));
		this.setEnd(JOptionPane.showInputDialog("Digite o Endereço do Aluno"));
		this.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a Média1")));
		this.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a Média2")));
	}
	public void cadastrarNota(){
		this.setMedia((this.getNota1()+this.getNota2())/2);
		if(media>7){
			JOptionPane.showMessageDialog(null,"Aluno Aprovado");
		}else{
			JOptionPane.showMessageDialog(null,"Aluno Reprovado");	
		}
		}
	public void listarAluno(){
		JOptionPane.showMessageDialog(null,"Nome: " +this.getNome()+ "\n Endereço: " + this.getEnd()+ "\n Media: " + this.getMedia());
	}
	}
				

