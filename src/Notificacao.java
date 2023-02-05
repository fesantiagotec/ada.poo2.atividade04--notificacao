import java.util.List;

public interface Notificacao {

    void cadastrarNomeMensagemNotificado();

    void cadastrarNomeMensagemNotificado(int qtdPessoas);
    void cadastrarNomeMensagemNotificado(int qtdPessoas, List<PessoaNotificada> pessoaNotificada);

    void exibirNomeMensagemNotificado();

}
