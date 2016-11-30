/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;
import javax.swing.DefaultListModel;
import Model.ModelSorteio;
import java.sql.SQLException;

/**
 *
 * @author Ricardo Mota
 */
public class ControllerSorteios {
    public int linha;
    public int coluna;
    public int matriz[][] = new int[3000][6];
    public int quantidadeDeNumeroSorteado;
    private int id;
    private int dezena01;
    private int dezena02;
    private int dezena03;
    private int dezena04;
    private int dezena05;
    private int dezena06;
    
    public ControllerSorteios(){
        this.linha = 0;
        this.coluna = 0;
        this.quantidadeDeNumeroSorteado = 6;
    }
    
    public DefaultListModel gerarSorteios() throws SQLException{
        String result = ""; 
        Random random = new Random();
        ModelSorteio store = new ModelSorteio();
        
        for (this.linha = 0; this.linha < 3000; this.linha++) {
            final int[] sorteio = random.ints(1, 61).distinct().limit(this.quantidadeDeNumeroSorteado).toArray();
            for (this.coluna = 0; this.coluna < this.quantidadeDeNumeroSorteado; this.coluna++) {
                this.matriz[this.linha][this.coluna] = sorteio[this.coluna];
            }
        }
        
        store.insereSorteio(this.matriz);
        return this.mostrarSorteios();
    }
    
        
    public DefaultListModel mostrarSorteios(){
        ControllerFerramentas sort = new ControllerFerramentas();
        String resultado = "", resultadoFinal, resultadoOrdenado = "", strReturn = "";
        int vetorOrdenado[] = new int[6];
        DefaultListModel dml = new DefaultListModel();
        
        for (this.linha = 0; this.linha < 3000; this.linha++) {
            for(this.coluna = 0; this.coluna < this.quantidadeDeNumeroSorteado; this.coluna++){
                resultado = resultado + String.format("%1$02d ", this.matriz[this.linha][this.coluna]);
                vetorOrdenado[this.coluna] = this.matriz[this.linha][this.coluna];
            }
            sort.bubbleSort(vetorOrdenado, this.quantidadeDeNumeroSorteado);
            for (this.coluna = 0; this.coluna < this.quantidadeDeNumeroSorteado; this.coluna++) {
                resultadoOrdenado = resultadoOrdenado + String.format("%1$02d ", vetorOrdenado[this.coluna]);
            }
            resultadoFinal = String.format("Sorteio[%1$04d]: " + resultado + "[ " + resultadoOrdenado + "]", (this.linha+1));;
            strReturn += resultadoFinal + "\n";
            resultado = "";
            resultadoOrdenado = "";
            dml.addElement(resultadoFinal);
        }
        
        return dml;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
