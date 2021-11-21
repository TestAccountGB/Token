package token;

import java.util.Scanner;

public class TokensTest {
	public static void main(String[] args) {
		
		//Meu amigo, token e o scanner nao e nada do que voce pensava kkkkk, vamos primeiramente explicar o basico do
		//Token...
		
		//Token significa algo como uma String que foi dividida em pequenos pedacos (tokens).
		
		String nomes = "Augusto, César, Noélia, Julio";
		String[] tokens = nomes.split(",");
		System.out.println(tokens[0]);
		
		//Aqui criamos um array, e vamos alocar os espacos do array com os nomes, ou seja, cada espaco no array vai ser um
		//Token, mas como o java vai saber quando ele tem que ir pra outro espaco do array? Com um demilitador amigo,
		//no metodo .split() da String ele pede uma regex que vamos chamar de delimitador, ou seja, toda vez que tiver
		//Uma virgula ele vai ir pra outra String no array.
		
		System.out.println("\nTodos os Tokens...");
		for(String array : tokens) {
			System.out.println(array);
		}
		
		//Aqui como podemos ver ele deixou um espaco no comeco de cada String porque nosso delimitador ta usando
		//Apenas uma virgula, poderiamos fazer assim nomes.split(", "); Dando espaco, mas isso seria bem ruim, por isso
		//Vamos usar apenas um metodo .trim() que tira os espacos do comeco e do final.
		
		System.out.println("\nTodos os Tokens Arrumados...");
		for(String array : tokens) {
			System.out.println(array.trim());
		}
		
		//Poderiamos fazer isso tambem...
		
		System.out.println("\n\nTeste...");
		
		String nomes2 = "Augusto2 César3 Noélia4 Julio";
		String[] tokens2 = nomes2.split("\\d");
		System.out.println(tokens2[0]);
		
		//Ok, agora entendi o que significa token e como separar Strings usando um delimitador, mas voce tambem tinha
		//Falado do Scanner nao e? Sim, por incrivel que pareca o Scanner foi feito feito pra praticamente isso kkk
		
		//Observe...
		
		Scanner scan = new Scanner(System.in); //Sabe o que esta acontecendo aqui? A gente ta passando algum parametro
		//Para o construtor do Scanner, mas o que ele significa? O System.in no Scanner significa que ele vai aceitar valores
		//Digitados no teclado, mas ele nao serve apenas para isso.
		
		//Explicando o Scanner mais a fundo...
		
		Scanner scanner = new Scanner("1 true Caralho");//Ue, como a gente ta conseguindo passar uma String? Por causa
		//Da sobrecarga do construtor, mas o que ele vai fazer com essa String? O Scanner ele pode escanear (Scannar kkk,
		//Agora o nome faz sentido ne?) uma String, usando um delimitador.
		
		//O Delimitador padrao do Scanner e o espaco (" "), entendeu o porque daquele bug desgracado? Quando o Scanner
		//Ve um espaco na String ele acha que ele tem que pular pra outra ;-;, por isso buga pra kraio quando a gente da
		//Espaco em um Scanner com (System.in).
		
		//Mas o que o Scanner tem de tanto especial em fazer tokens? E que ele consegue armazenar os valores da String
		//Em variaveis com seus respectivos tipos
		
		//OBZERVE...
		System.out.println("\n\nScanner...");
		int Int = 0;
		boolean Boolean = false;
		String string = "";
		
		@SuppressWarnings("resource")
		Scanner scanner2 = new Scanner("1 true Caralho");//Vo criar outro Scanner para demonstrar como funciona o
		//.next()
		
		while(scanner2.hasNext()) {//Ou seja, quando o delimitador achar outro valor.
			
			System.out.println(scanner2.next());//Ou seja, ele vai mostrar o proximo valor
			
			//KKKK, ta surpreso ne? Esse metodo nao serve apenas parar digitar nao amigo
			//Aqui ele vai mostrar um Token, mas ele ta retornando tudo em String (Porque o metodo .next() retorna String),
			//Mas como eu faco pra ele retornar os valores respectivos aos seus tipos, por exemplo: 1 = int? OBZERVE...
		}
		
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {//Ou seja, se o proximo valor for um int ele vai executar o if. Mesma coisa com o resto
				
				Int = scanner.nextInt();//Aqui ele vai pegar o proximo valor e vai botar dentro da variavel, como a gente ja sabe
				//Que o proximo valor vai ser int, por causa do if, ele vai pegar esse proximo valor (next) e botar na variavel
				//Como um int (nextInt()). Mesma coisa com os outros...
				
			} else if (scanner.hasNextBoolean()) {
				Boolean = scanner.nextBoolean();
				
			} else if (scanner.hasNext()) { //Temos que botar a String como a ultima, porque ele basicamente vai aceitar tudo
				//Kkk, ele pode roubar um valor que a gente quer colocar no int por exemplo.
				 string = scanner.next();
				 
			} else {
				System.err.println("Tipo nao reconhecido");
				
			}
		}
		System.out.println("\nUsando Variaveis...");
		System.out.println("Inteiro: " + Int + ", Booleano: " + Boolean + ", String: " + string);
		
		//Obs.: Se a gente precisar botar os tokens em variaveis, use o Scanner, mas se nao, use o .split() mesmo.
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("\nDigite algo com espaco: ");
		String stringTest = scan2.next();
		
		System.out.println("\nTchau");
		String stringTest2 = scan2.next();
		
		System.out.println("\nBugou? Eu sei que sim ;-;");
		//Como podemos ver o Scanner pulou o segundo .next(), por que? Como o delimitador dele e um espaco (" "),
		//Entao ele vai achar que o valor digitado depois do espaco e outro valor, e  entao vai botar no proximo .next(), 
		//Porque ele acha que e outro valor, um proximo (next) valor, entendeu?
		
		System.out.println("\nPrimeiro .next(): \"" + stringTest + "\", Segundo .next() (Valor depois do espaco): \"" + stringTest2+ "\"");
		
		scan2.useDelimiter("\r\n");//O que significa isso? Estou botando o demilitador so reconher outro valor quando
		//For pra outra linha, por exemplo o "\n" significa NewLine, e o "\r" Retorna para o comeco da nova linha, e os
		//Dois juntos significam o final de uma linha, ou seja, quando eu for pra outra linha ele vai reconher aquilo como
		//Outro valor, e como a gente vai pra proxima linha? Usando o Enter, criar uma nova linha ("\r\n") e a funcao do
		//Enter, se voce apertar Enter agora na IDE, ele vai criar outra linha("\n") e vai ir pra proxima ("\r"), agora tudo faz
		//Sentido ne? kkkkkk talvez voce so tenha se bugado mesmo ._.
		
		System.out.println("\nDigite algo com espaco: ");
		String stringTest3 = scan2.next();
		
		System.out.println("\nDigite denovo xD");
		String stringTest4 = scan2.next();
		
		System.out.println("\nBugou? Eu sei que nao :D");
		
		System.out.println("\nPrimeiro .next(): \"" + stringTest3 + "\", Segundo .next(): \"" + stringTest4 + "\"");
		
		scan.close();
		scanner.close();
		scan2.close();
	}
}