import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Despesas des = new  Despesas();
		ContaFinal cf = new ContaFinal();
		
		int op;
		do{ 
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n1 - Cadastrar Despesas " + "\n2 - Listar Despesas " + "\n3 - Calcular Conta Final " + "\n4 - Sair ") );
		switch (op) {
			case 1: 
				des.cadastrarDespesas();
			break;
			case 2:
				des.listarDespesas();
				break;
			case 3: 
				cf.calcularContaFinal(des);
				break;
			case 4:
			JOptionPane.showMessageDialog(null,"Finalizando programa! ");
			break;
			default:
					JOptionPane.showMessageDialog(null, "Opção inválida ");
			}
	}while(op != 4);
	}			
			}
