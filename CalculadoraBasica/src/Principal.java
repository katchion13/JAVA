import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calc1 = new Calculadora();
	int op;
	double n1 = 0, n2 = 0;
	do{ 
	op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Somar " + "\n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n0 - Sair"));
	
	switch (op){
	case 1:
		calc1.somar();
		break;
	case 2:
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		calc1.subtrair(n1, n2);
		break;
	case 3:
		JOptionPane.showMessageDialog(null,"Resultado" + calc1.dividir(n1, n2));
		break;
	case 4:
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		JOptionPane.showMessageDialog(null,"Resultado: " + calc1.dividir(n1, n2));
		break;
	case 0:
		JOptionPane.showMessageDialog(null, "Programa finalizado!");
		break;
		default: 
		
		JOptionPane.showMessageDialog(null, "Op��o Inv�lida!");
	}	
	}while(op != 0);
	}
}

