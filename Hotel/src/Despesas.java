import javax.swing.JOptionPane;


public class Despesas {
	
	private int dias;
	private double vDiaria;
	private double consumo;
	private double txServico;
	private String hospede;
	
	public Despesas(){
		this(0,0,0,0,"");
		}
	public Despesas(int dias, double diaria, double consumo, double txServico,
			String hospede) {
		this.dias = dias;
		vDiaria = diaria;
		this.consumo = consumo;
		this.txServico = txServico;
		this.hospede = hospede;
		
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getVDiaria() {
		return vDiaria;
	}
	public void setVDiaria(double diaria) {
		vDiaria = diaria;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public double getTxServico() {
		return txServico;
	}
	public void setTxServico(double txServico) {
		this.txServico = txServico;
	}
	public String getHospede() {
		return hospede;
	}
	public void setHospede(String hospede) {
		this.hospede = hospede;
	}
	public void cadastrarDespesas(){

	this.setDias(Integer.parseInt(JOptionPane.showInputDialog("Digite Dias Hospedado: ")));
	this.setVDiaria(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor diária: ")));
	this.setConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite Consumo: ")));
	this.setHospede(JOptionPane.showInputDialog("Digite o nome do hóspede"));
		}
	public void listarDespesas(){
				JOptionPane.showMessageDialog(null, "\n Dias Hospedado: " + this.getDias() + "\n Valor diária: " + this.getVDiaria() + "\n Consumo do hóspede: " + this.getConsumo() +  "\n Taxa de Serviço : " + this.getHospede());
	}
}


