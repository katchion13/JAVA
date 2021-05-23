import javax.swing.JOptionPane;
public class ContaFinal {

	private double contaFinal;
	
	public ContaFinal(){
		this(0);
		}
	public ContaFinal(double contaFinal) {
		this.contaFinal = contaFinal;
	}

	public double getContaFinal() {
		return contaFinal;
	}

	public void setContaFinal(double contaFinal) {
		this.contaFinal = contaFinal;
	}
	
	public void calcularContaFinal(Despesas d){
			 double vd;
		vd=(d.getDias()*d.getVDiaria()); 
		d.setTxServico(d.getConsumo()*0.10);
		this.contaFinal=(vd + d.getTxServico()+d.getConsumo());
		JOptionPane.showMessageDialog(null, "Valor da Conta Final: " + this.getContaFinal());
	}
	
}
