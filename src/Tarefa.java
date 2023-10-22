public class Tarefa {
    
    public String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa (" + " descrição " + descricao + ")";
    }
}

   