import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;    

public class Exemplo {    

   public static void main (String args[]){     
   	
   	double input1 = Double.parseDouble(args[0]);
   	double input2 = Double.parseDouble(args[1]);
   	int input3 = Integer.parseInt(args[2]); 
   	
   	double num1 = input1;
   	double num2 = input2;
   	int op = input3;   	
   	int operacao;

           operacao = op;

	    System.out.println(
        "RESULTADO: O resultado da operacao " + 
        getNomeOperacao(op) + 
        " eh " + 
        Calcular(operacao, num1, num2) +
        "\n");
	      escreverTexto(
          "Parâmetros enviados: " + 
          num1 + 
          " e " + 
          num2 + 
          "\n" + 
          "Operacao: " + 
          getNomeOperacao(op) + 
          "\n" + 
          "Resultado : " + 		    
          Calcular(operacao, num1, num2) + "\n");
   }

   static double Calcular (int op, double num1, double num2) {
    double resultado = 0;
    switch (op) {
     case 1:
      resultado = num1 + num2;
      break;

     case 2:
      resultado = num1 - num2;
      break;

     case 3:
      resultado = num1 * num2;
      break;

     case 4:
      resultado = num1 / num2;

      break;
    }

    return resultado;
   }
   
   
    public static void escreverTexto(String escreverTexto){
   
      try(	
        FileWriter criandoArquivo = new FileWriter("DivShell01/resultado.txt",true);
        BufferedWriter buffer = new BufferedWriter(criandoArquivo);
        PrintWriter escrita = new PrintWriter(buffer); 
 	    ){	  
 	
   	escrita.append(escreverTexto);
   	escrita.close();   	
	
	}catch(IOException e){
	  e.printStackTrace();
	}   
   }
	 public static void escreverTextoSeExistir(String texto){   
 	FileWriter fw = null; 
 	boolean exists = (new File("DivShell02/resultado.txt")).exists();
 	if(exists){
 	  System.out.println("O arquivo existe!");
 	 try{ 	 
 	    fw = new FileWriter("DivShell02/resultado.txt",true);
 	    fw.write(texto);
 	 }catch(IOException e){ 	 
 	   System.out.println(e);
 	 }   
    } else {   
   
    escreverTexto(texto);
   System.out.println("entrou aqui!");   
   }
   }  

   static String getNomeOperacao (int op) {

    switch (op) {
  case 1:
    return "soma";

  case 2:
    return "subtracao";

  case 3:  
    return "multiplicacao";

  case 4:  
    return "divisao";

  default:
    return "undefined";
    }
  }
}


