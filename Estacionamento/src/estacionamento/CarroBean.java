/*
Projeto: Estacionamento
Autor: Wallace Lima dos Santos
RA: 2090782021037
21/05/2021
Objetivo: Classe de dados equivalente a tabela carro
 */
package estacionamento;

public class CarroBean {
    //variaveis de instância
    private String placa;
    private String cor;
    private String descricao;
    
    //metodo construtor
    public void CarroBean () { 
        this.placa = "";
        this.cor = "";
        this.descricao = "";       
    }
    
    //metódos set's e get's
    //metódos modificadores / acessores
    
    public void setPlaca (String placa) {
        this.placa = placa;       
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
 
    
    
    }

    
