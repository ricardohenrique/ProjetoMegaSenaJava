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
    public boolean insereSorteio(int jogos[][]) {
        try {
            //Seta e abre a conexão
            Conexao conexao = new Conexao();
            conexao.getConexao();
            
            String delete = "delete from sorteios where id != 1;";
            PreparedStatement comando = conexao.getConexao().prepareStatement(delete);
            comando.executeUpdate(delete);
 
            for (int i = 0; i < 3000; i++) {
                String sql = "";
                sql += "insert into sorteios (`dezena_01`, `dezena_02`, `dezena_03`, `dezena_04`, `dezena_05`, `dezena_06`)";
                sql += " VALUES ";
                sql += " ('" + jogos[i][0]+ "', '" + jogos[i][1] + "', " + jogos[i][2] + ",'" + jogos[i][3] + "', " + jogos[i][4] + ", " + jogos[i][5] + ")";
                comando = conexao.getConexao().prepareStatement(sql);
                comando.executeUpdate(sql);
            }
            //Executa
            return true; //se inseriu, retorna verdadeiro.
 
        } catch (Exception e) { //Se deu algum erro...
            System.out.println(e.getMessage());
            return false;
        }
    }
}
