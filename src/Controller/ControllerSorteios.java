/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;
import javax.swing.DefaultListModel;
import Model.SorteioStore;
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
    
    public ControllerSorteios(){
        this.linha = 0;
        this.coluna = 0;
        this.quantidadeDeNumeroSorteado = 6;
    }
    
    public DefaultListModel gerarSorteios() throws SQLException{
        String result = ""; 
        Random random = new Random();
        SorteioStore store = new SorteioStore();
        
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
}
