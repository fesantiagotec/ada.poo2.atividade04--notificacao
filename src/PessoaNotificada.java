import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaNotificada implements Notificacao{

    Scanner scanner = new Scanner(System.in);
    List<PessoaNotificada> pessoasNotificadas = new ArrayList();

    private String nomeNotificado;
    private String mensagemNotificado;

    //construtor
    public PessoaNotificada() {

    }

    //getters e setters
    public String getNomeNotificado() {
        return nomeNotificado;
    }

    public void setNomeNotificado (String nomeNotificado) {
        this.nomeNotificado = nomeNotificado;
    }

    public String getMensagemNotificado() {
        return mensagemNotificado;
    }

    public void setMensagemNotificado (String MensagemNotificado) {
        this.mensagemNotificado = MensagemNotificado;

    }

    @Override
    public void cadastrarNomeMensagemNotificado() {

    }

    @Override
    public void cadastrarNomeMensagemNotificado(int qtdPessoas) {

    }

    @Override
    public void cadastrarNomeMensagemNotificado(int qtdPessoas, List<PessoaNotificada> pessoasNotificadas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes: ");
        //inserindo os nomes
        for (int posicao = 0; posicao < qtdPessoas; posicao++) {
            PessoaNotificada pessoaNotificada = new PessoaNotificada();//objeto criado
            scanner.nextLine();
            pessoaNotificada.setNomeNotificado(scanner.nextLine());
            pessoasNotificadas.add(pessoaNotificada);
        }
    }

    @Override
    public void exibirNomeMensagemNotificado() {
        for (PessoaNotificada cadaObjetoDaLista : pessoasNotificadas) {
            System.out.println(getNomeNotificado() + " received a massage: -> " + getMensagemNotificado());
        }
    }

}
