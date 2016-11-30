/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControllerRegistros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Mota
 */
public class ModelRegistro {
   
    public void insereRegistro(ControllerRegistros registro) throws SQLException {
        String sql = "";
        sql += "insert into registros (`nome`, `dezena_01`, `dezena_02`, `dezena_03`, `dezena_04`, `dezena_05`, `dezena_06`)";
        sql += " VALUES ";
        sql += "(?,?,?,?,?,?,?);";
        
        try {
            ModelConexao conexao = new ModelConexao();
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

   //Método que retorna a lsta de carros, com todos os carros do sistema
    public List<ControllerRegistros> getRegistros() {
 
        try {
            ModelConexao con = new ModelConexao();
            con.getConexao();
            
            String sql = "select * from registros order by id desc;";
            
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            List<ControllerRegistros> listaDeRegistros = new ArrayList<ControllerRegistros>();
 
            while (resultado.next()) {
                ControllerRegistros registro = new ControllerRegistros();
                registro.setNome(resultado.getString("nome"));
                registro.setDezena01(resultado.getInt("dezena_01"));
                registro.setDezena02(resultado.getInt("dezena_02"));
                registro.setDezena03(resultado.getInt("dezena_03"));
                registro.setDezena04(resultado.getInt("dezena_04"));
                registro.setDezena05(resultado.getInt("dezena_05"));
                registro.setDezena06(resultado.getInt("dezena_06"));
 
                listaDeRegistros.add(registro);
            }
 
            //Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
 
            //Retorna a lista de carros
            return listaDeRegistros;
 
        } catch (Exception e) { //Se der algum exessão...
            System.out.println(e.getMessage());
            return null;
        }
    }  
}
