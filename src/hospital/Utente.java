
package hospital;

public class Utente {
    
    String nome;
    String DataNascimento;
    String observacoes;

    public Utente(String nome, String DataNascimento, String observacoes) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.observacoes = observacoes;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
}
