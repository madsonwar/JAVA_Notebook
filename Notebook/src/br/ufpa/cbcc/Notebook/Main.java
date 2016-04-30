package br.ufpa.cbcc.Notebook;
import javax.swing.JOptionPane;

public class Main{
	 public static Computador pc;
	 public static  Computador[]maquinas=new Computador[10];
	 
	public static void main(String[] args){
		
		
		{
		
		for(int a=0; a<=9; a++){
			String str = JOptionPane.showInputDialog(null,"Escolha dez maquinas entre PC's ou Notebook's:\n"
					+"Notebook-1-\n"
					+"Computador pessoal -2-\n");
			int op = Integer.parseInt( str.trim() );
			switch (op){
			case 1:
				maquinas[a] = new Notebook();
			case 2:
				maquinas[a] = new ComputadorPessoal();
			}
		
			
		}
		
		}}
			
			static void menu(Computador[] maquinas){
				for(int a=0; a<=9; a++){
				
					
					
					
					maquinas[a].ligarDesligar();
					maquinas[a].aumentarVolume();
					maquinas[a].diminuirVolume();
				
					
					if(maquinas[a] instanceof Notebook){
						((Notebook) maquinas[a]).printfBateria();
					}
					else if(maquinas[a] instanceof ComputadorPessoal){
						((ComputadorPessoal) maquinas[a]).usarNavegador();
					}
						
							
							
									
						
					
					
		
		/*String str = JOptionPane.showInputDialog(null,"Escolha um PC ou Notebook:\n"
				+"Notebook-1-\n"
				+"Computador pessoal -2-\n");
		int op = Integer.parseInt( str.trim() );
		switch ( op ){
		case 1:
			pc = new Notebook();
			menu( pc);
			break;
		case 2:
			pc = new ComputadorPessoal();
			menu( pc);
			break;
		
		default:
			System.exit(0);
			
		} while( (op == 1)||(op == 2) );
  
		
	
  
  
	}
	
	static void menu(Computador pc){
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
					String str = JOptionPane.showInputDialog(null,"Escolha uma opção de ComputadorPessoal:\n"
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
						((ComputadorPessoal) pc).usarNavegador();
						break;
						
					
					default:
						
						System.exit(0);
		}
	}
}*/
}
		}}		
