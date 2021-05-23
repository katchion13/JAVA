import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
Livro l1 = new Livro("Título de livro","Suspense", 10, 80.00, "Nome do Artista", "Nome da Editora", "6 edicao" );
CD c1 = new CD("Titulo do CD", "Rock", 20, 40.00, "Nome do Artista", "Nome da Gravadora", "Pais de Origem");
DVD d1 = new DVD("Titulo do DVD", "Terror", 15, 120.00, "Nome do diretor", "Tempo de duracao", "18 anos" );

int opOperacao, opProd = 0;  

opProd = Integer.parseInt(JOptionPane.showInputDialog("Digite o produto desejado: \n1 - Livro \n2 - CD \n3 - DVD \n0 - Sair"));
if(opProd != 0){
do{ 	
	opOperacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção: \n1 -Listar Produto: " + "\n2 - Comprar: " + "\n3 - Vender: " + "\n0 - Sair" ));
	
switch (opProd) {

	case 1: 
			if(opOperacao == 1){
			l1.listarProduto();
		}
		if(opOperacao == 2){
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Comprada: "));
			l1.comprar(quantidade);
		}
		if(opOperacao == 3){
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Vendida: "));
			l1.vender(quantidade);
				}
break;

	case 2:
		if(opOperacao == 1){
			c1.listarProduto();
			}
		if(opOperacao == 2){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Comprada: "));
		c1.comprar(quantidade);
		}			
		if(opOperacao == 3){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Vendida: "));
		c1.vender(quantidade);
				}
break;

	case 3:
		if(opOperacao == 1){
			d1.listarProduto();
			}
		if(opOperacao == 2){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Comprada: "));
		d1.comprar(quantidade);
		}			
		if(opOperacao == 3){
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade Vendida: "));
		d1.vender(quantidade);
				}
break;
}
}while(opOperacao !=0);

}
while(opProd != 0);
}

}
