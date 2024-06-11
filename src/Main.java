// Interface Dispositivo
interface Dispositivo {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe ReprodutorMusical
class ReprodutorMusical implements Dispositivo {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos não utilizados
    @Override
    public void ligar(String numero) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void atender() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void exibirPagina(String url) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void adicionarNovaAba() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void atualizarPagina() {
        throw new UnsupportedOperationException("Função não suportada.");
    }
}

// Classe AparelhoTelefonico
class AparelhoTelefonico implements Dispositivo {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos não utilizados
    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void exibirPagina(String url) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void adicionarNovaAba() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void atualizarPagina() {
        throw new UnsupportedOperationException("Função não suportada.");
    }
}

// Classe NavegadorNaInternet
class NavegadorNaInternet implements Dispositivo {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos não utilizados
    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void pausar() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void ligar(String numero) {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void atender() {
        throw new UnsupportedOperationException("Função não suportada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        throw new UnsupportedOperationException("Função não suportada.");
    }
}

// Classe principal para testar as funcionalidades
public class Main {
    public static void main(String[] args) {
        // Testando ReprodutorMusical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bohemian Rhapsody");

        // Testando AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Testando NavegadorNaInternet
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
