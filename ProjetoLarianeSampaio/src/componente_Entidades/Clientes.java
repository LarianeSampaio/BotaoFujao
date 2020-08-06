/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente_Entidades;

import componente_BancoDados.Database;
import componente_Telas.Mess;
import org.omg.CORBA.MARSHAL;

/**
 *
 * @author User
 */
public class Clientes {
    private Database db = null;
    
    private int idcli;
    private String nome;
    private String dt_nasc;
    private String cpf;
    private String telefone;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;
    
  public Clientes(Database db) {
        this.db = db;
    }
  
    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int id) {
        this.idcli = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(String dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
   
     
     public boolean insere() {
        boolean ok = false;
        try {
            db.executaSQL("INSERT INTO cliente(nome, dt_nasc, cpf, telefone, endereco, numero, bairro, cidade, cep) VALUES('" + nome + "', '" + dt_nasc + "', '" + cpf + "','" + telefone + "','" + endereco + "','" + numero + "', '" + bairro + "','" + cidade + "','" + cep + "')");
            ok = true;
            Mess.aviso("Inserido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ok;
    }

    public boolean exclui(int idcli) {
        boolean ok = false;

        try {
            db.executaSQL("DELETE FROM cliente WHERE idcli='" + idcli + "'");
            ok = true;
            Mess.aviso("Excluido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ok;
    }

    public boolean altera() {
        boolean ok = false;
        try {
            db.executaSQL("UPDATE cliente SET "
                    + "nome = '" + nome + "', "
                    + "dt_nasc = '" + dt_nasc + "', "
                    + "cpf = '" + cpf + "', "
                    + "telefone = '" + telefone + "' "
                    + "endereco = '" + endereco + "', "
                    + "numero = '" + numero + "', "
                    + "bairro = '" + bairro + "', "
                    + "cidade = '" + cidade + "', "
                    + "cep = '" + cep + "', "
                    + "WHERE idcli = '" + idcli + "'"
            );
            ok = true;
            Mess.aviso("Alterado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ok;
    }

}
