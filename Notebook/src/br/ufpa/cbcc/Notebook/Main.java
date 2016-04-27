package br.ufpa.cbcc.Notebook;
import javax.swing.JOptionPane;

public class Main{
	 public static Computador pc;

	public static void main(String[] args){
		
		
		String str = JOptionPane.showInputDialog(null,"Escolha um PC ou Notebook:\n"
				+"Notebook-1-\n"
				+"Computador pessoal -2-\n");
		int op = Integer.parseInt( str.trim() );
		switch ( op ){
		case 1:
			pc = new Notebook();
			break;
		case 2:
			pc = new ComputadorPessoal();
			break;
		
		default:
			System.exit(0);
			
		} while( (op == 1)||(op == 2) );
  
		
	
  
  
	}
	
	void menu(Computador pc){
		if(pc instanceof Notebook){
			String str = JOptionPane.showInputDialog(null,"Escolha uma opção de Nootebook:\n"
					+"-1-Ligar desligar "
					+"-2-Aumentar volume"
					+"-2-Diminuir volume"
					+"-3-Carga da Bateria");
			int op = Integer.parseInt( str.trim() );
			switch ( op ){
			case 1:
				pc.ligarDesligar();
				break;
			case 2:
				pc.aumentarVolume();
				break;
			case 3:
				pc.diminuirVolume();
				break;
			case 4:
				((Notebook) pc).printfBateria();
				break;
				
					
						
							
				
			
			default:
				System.exit(0);
			}
		}
	
				if(pc instanceof ComputadorPessoal){
					String str2 = JOptionPane.showInputDialog(null,"Escolha uma opção de ComputadorPessoal:\n"
							+"-1-Ligar desligar "
							+"-2-Aumentar volume"
							+"-2-Diminuir volume"
							+"-3-Carga da Bateria");
					int op2 = Integer.parseInt( str2.trim() );
					switch ( op2 ){
					case 1:
						pc.ligarDesligar();
						break;
					case 2:
						pc.aumentarVolume();
						break;
					case 3:
						pc.diminuirVolume();
						break;
					case 4:
						((ComputadorPessoal) pc).usarNavegador();
						break;
						
					
					default:
						System.exit(0);
		}
	}
}
}		
