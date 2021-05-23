import javax.swing.JOptionPane;

public class Principal {

		public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		Atendente atende = new Atendente();
		
		int op, esc = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n1 - Gerente" + "\n2 – Vendedor" + "\n3 – Atendente" + "\n0 – Sair"));
			if(op !=0){	
				do{
	esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n1 – Cadastrar funcionario" + "\n2 – Calcular salário " + "\n3 – Calcular bonificação" + "\n4 – Apresentar salário final " + "\n0 – Sair"));
		switch(op){ 

		case 1:
		if(esc == 1){
			gerente.cadastrarFuncionario();
		}
		if(esc == 2){
			gerente.calcularSalarioFinal();
		}
		if(esc == 3){
			gerente.calcularBonificacao();
				}
		if(esc == 4){
			gerente.apresentarSalario();
		}
			break;	
	
	case 2: 
		
		if(esc == 1){
			
			vendedor.cadastrarFuncionario();
		}
		if(esc == 2){
			vendedor.calcularSalarioFinal();
		}
		if(esc == 3){
			vendedor.calcularBonificacao();
				}
		if(esc == 4){
			vendedor.apresentarSalario();
		}
		break;
	case 3: 
		if(esc == 1){
			
			atende.cadastrarFuncionario();
		}
		if(esc == 2){
			atende.calcularSalarioFinal();
		}
		if(esc == 3){
			atende.calcularBonificacao();
				}
		if(esc == 4){
			atende.apresentarSalario();
		}
			break;	
			}
			}while(esc != 0);
			}
			}while(op != 0);
		}		
	}
	
		
		