/*
Notificador de Eventos
Crie um programa que seja capaz de enviar notificações de eventos.
a) O programa deverá receber como entrada o número de pessoas que vão ser notificadas,
em seguida deve receber o nome de cada uma das pessoas.
b) Após a inserção dos nomes, o programa deverá receber como entrada a mensagem que todos
receberão.
c)O programa deve exibir como saída o nome da pessoa seguido de "received a message: ->” e a
mensagem enviada!
d)O programa deve exibir como saída uma estrutura chave/valor com o nome das pessoas e a
mensagem que foi enviada!
e)Caso o usuário digite um novo valor de número de pessoas que serão notificadas, o programa
deve limpar todas as notificações anteriores.
f)O programa ficará em loop até que o número de pessoas como valor de entrada seja 0. Caso o
valor digitado seja 0 o programa deve encerrar imediatamente!
Segue abaixo um print da entrada e saída do programa!

FALTA RESOLVER:
1. Quando recebo mais de uma pessoa na lista a partir da segunda pessoa não recebe o nome.
2. no final, após o método receberQuantidadePessoasNotificadas(), quando digito o número de
pessoas ele dá bug.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<PessoaNotificada> pessoasNotificadas = new ArrayList<>();
        PessoaNotificada pessoaNotificada = new PessoaNotificada();

        int qtdPessoas = 0;

        receberQuantidadePessoasNotificadas();
        qtdPessoas = scanner.nextInt();

        do {
            pessoaNotificada.cadastrarNomeMensagemNotificado(qtdPessoas, pessoasNotificadas);

            //inserindo mensagem
            System.out.println("Digite a mensagem da notificação: ");
            scanner.nextLine();
            String mensagem = scanner.nextLine();
            for (PessoaNotificada cadaObjetoDaLista : pessoasNotificadas) {
                if (cadaObjetoDaLista.getNomeNotificado()!= null) {
                    cadaObjetoDaLista.setMensagemNotificado(mensagem);
                }
            }

            pessoaNotificada.exibirNomeMensagemNotificado();
            
            receberQuantidadePessoasNotificadas();
            qtdPessoas = scanner.nextInt();

//            if (qtdPessoas != 0) {
//                limparLista(pessoasNotificadas);
//            }

        } while(qtdPessoas != 0);

        System.out.println("Até a próxima!");
    }

    public static void receberQuantidadePessoasNotificadas () {

        System.out.println("Seja bem-vindo, Notificador de Eventos");
        System.out.println("Digite o número de pessoas que irá receber a notificação: ");

    }

    public static void limparLista(List<PessoaNotificada> pessoasNotificadas) {
        for (PessoaNotificada objetoPessoaNotificada : pessoasNotificadas) {
            pessoasNotificadas.remove(objetoPessoaNotificada);
        }

    }

}