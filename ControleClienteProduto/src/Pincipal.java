import javax.swing.JOptionPane;


public class Pincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli = new Cliente();
		Produto prod = new Produto();		
		
		int op;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Cadastrar Cliente " + "\n2 - Listar Cliente" + "\n3 - Cadastrar Produto" + "\n4 - Listar Produto" + "\n5 Calcular Limite de Crédito" + "\n6 Vender" + "\n0 Sair "));

			switch (op) {
			case 1: 
				cli.cadastrarCliente(); 
				break;
			case 2:
				cli.listarCliente();
				break;
			case 3: 
				prod.cadastrarProduto();
				break;
			case 4:
				prod.listarProduto();
				break;
			case 5:
				cli.calcularLimiteCredito();
				break;
			case 6:
				prod.vender(qtd);
				break;
			case 0:
			JOptionPane.showMessageDialog(null,"Finalizando programa! ");
			break;
			default:
					JOptionPane.showMessageDialog(null, "Opção inválida ");
			}
	}while(op != 0);
	}			
		
	int qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
			prod.pedido(qtd);
				if(prod.confirmarPedido(qtd)){
					prod.pedido(qtd);	
					if(cli.confirmarCompra(prod.pedido(qtd)))prod.vender(qtd);
						 else
							   JOptionPane.showMessageDialog(null,"Limite de Crédito Indisponível");
							}
							else
								JOptionPane.showMessageDialog(null,"Quantidade Indisponível");
							break;	
	}
}
