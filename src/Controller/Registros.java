/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RegistroStore;
import Model.RegistroGet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ricardo Mota
 */
public class Registros {
    private String nome;
    private int dezena01;
    private int dezena02;
    private int dezena03;
    private int dezena04;
    private int dezena05;
    private int dezena06;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDezena01() {
        return dezena01;
    }

    public void setDezena01(int dezena01) {
        this.dezena01 = dezena01;
    }

    public int getDezena02() {
        return dezena02;
    }

    public void setDezena02(int dezena02) {
        this.dezena02 = dezena02;
    }

    public int getDezena03() {
        return dezena03;
    }

    public void setDezena03(int dezena03) {
        this.dezena03 = dezena03;
    }

    public int getDezena04() {
        return dezena04;
    }

    public void setDezena04(int dezena04) {
        this.dezena04 = dezena04;
    }

    public int getDezena05() {
        return dezena05;
    }

    public void setDezena05(int dezena05) {
        this.dezena05 = dezena05;
    }

    public int getDezena06() {
        return dezena06;
    }

    public void setDezena06(int dezena06) {
        this.dezena06 = dezena06;
    }
    
    public void store() throws SQLException{
        RegistroStore registroStore = new RegistroStore();
        registroStore.insereRegistro(this);
    }
    
    public List<Registros> getRegistros(){
        String dados[] = new String[7];
        RegistroGet registroGet = new RegistroGet();
        
        List<Registros> listaDeRegistros = new ArrayList<Registros>();
        listaDeRegistros = registroGet.getRegistros();
        return listaDeRegistros;
    }
}
