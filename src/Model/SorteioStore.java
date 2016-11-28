/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;

/**
 *
 * @author Ricardo Mota
 */
public class SorteioStore {
    public boolean insereSorteio(int jogo[]) {
        try {
            //Seta e abre a conexão
            Conexao conexao = new Conexao();
            conexao.getConexao();
 
            //Query de inserção (as aspas são muit importantes):
            String sql = "";
            sql += "insert into sorteios (`dezena_01`, `dezena_02`, `dezena_03`, `dezena_04`, `dezena_05`, `dezena_06`)";
            sql += " VALUES ";
            sql += " ('" + jogo[0]+ "', '" + jogo[1] + "', " + jogo[2] + ",'" + jogo[3] + "', " + jogo[4] + ", " + jogo[5] + ")";
 
            //Executa
            PreparedStatement comando = conexao.getConexao().prepareStatement(sql);
            comando.executeUpdate(sql);
            return true; //se inseriu, retorna verdadeiro.
 
        } catch (Exception e) { //Se deu algum erro...
            System.out.println(e.getMessage());
            return false;
        }
    }
}
