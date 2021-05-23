import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cli = new Cliente();
			
		int op;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastrar Cliente " + "\n2 - Listar Cliente" + "\n3 - Calcular limite de créditoo" + "\n0 - Sair "));

			switch (op) {
			case 1: 
				cli.cadastrarCliente(); 
				break;
			case 2:
				cli.listarCliente();
				break;
			case 3: 
				JOptionPane.showMessageDialog(null, "Limite de Crédito é: " + cli.calcularLimiteCredito());
				break;
			case 0:
				JOptionPane.showMessageDialog(null,"Finalizando programa! ");
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida ");
			}
	}while(op != 0);
	}	
		
		
	}

}
