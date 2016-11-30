/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ricardo Mota
 */
public class ModelSorteio {

    public void insereSorteio(int jogos[][]) throws SQLException {
        String sql = "";
        sql += "insert into sorteios (`id`, `dezena_01`, `dezena_02`, `dezena_03`, `dezena_04`, `dezena_05`, `dezena_06`)";
        sql += " VALUES ";
        sql += "(?,?,?,?,?,?,?);";
        
        try {
            ModelConexao conexao = new ModelConexao();
            String delete = "delete from sorteios where id != 0;";
            PreparedStatement comando = conexao.getConexao().prepareStatement(delete);
            comando.executeUpdate(delete);
        }catch(SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }finally{
            ModelConexao conexao = new ModelConexao();
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            for (int i = 0; i < 3000; i++) {
                stmt.setInt(1, (i+1));
                stmt.setInt(2, jogos[i][0]);
                stmt.setInt(3, jogos[i][1]);
                stmt.setInt(4, jogos[i][2]);
                stmt.setInt(5, jogos[i][3]);
                stmt.setInt(6, jogos[i][4]);
                stmt.setInt(7, jogos[i][5]);
                
                stmt.addBatch();
                System.out.println(sql);
            }
            stmt.executeBatch();
            stmt.close();
            conexao.getConexao().close();
        }
    }
}
