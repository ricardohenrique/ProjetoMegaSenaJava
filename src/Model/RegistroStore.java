/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Controller.Registros;

/**
 *
 * @author Ricardo Mota
 */
public class RegistroStore {
    
    public void insereRegistro(Registros registro) throws SQLException {
        String sql = "";
        sql += "insert into registros (`nome`, `dezena_01`, `dezena_02`, `dezena_03`, `dezena_04`, `dezena_05`, `dezena_06`)";
        sql += " VALUES ";
        sql += "(?,?,?,?,?,?,?);";
        
        try {
            Conexao conexao = new Conexao();
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);

            stmt.setString(1, registro.getNome());
            stmt.setInt(2, registro.getDezena01());
            stmt.setInt(3, registro.getDezena02());
            stmt.setInt(4, registro.getDezena03());
            stmt.setInt(5, registro.getDezena04());
            stmt.setInt(6, registro.getDezena05());
            stmt.setInt(7, registro.getDezena06());

            stmt.addBatch();
            System.out.println(sql);
            
            stmt.executeBatch();
            stmt.close();
            conexao.getConexao().close();
        }catch(SQLException sqlEx){
            System.out.println(sqlEx.getMessage());
        }
    }
}
