/*public class Vizualizacao {
    
    //Atributos 

    private ContaCorrente espectador;
    private Video filme;

    //Método Construtor

    public Vizualizacao(ContaCorrente espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //Métodos Públicos

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //Métodos Especiais

    public ContaCorrente getEspectador(){
        return this.espectador;
    }

    public void setEspectador(ContaCorrente espectador){
        this.espectador = espectador;
    }

    public Video getFilme(){
        return this.filme;
    }

    public void setFilme(Video filme){
        this.filme = filme;
    }

    //Métodos Abstratos

    @Override
    public String toString(){
        return "Vizualização do espectador - " + espectador + "\n" + filme;
    }
}*/
