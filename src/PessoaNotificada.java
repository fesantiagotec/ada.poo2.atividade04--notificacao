import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaNotificada {

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

//    @Override
//    public void cadastrarNomeMensagemNotificado(PessoaNotificada objetoPessoaNotificada) {
//        //pessoasNotificadas.size() = qtdPessoas;
//
//
//    }
//
//
//    @Override
//    public void exibirNomeMensagemNotificado() {
//
//    }

//    @Override
//    public void toString () {
//    }



}
