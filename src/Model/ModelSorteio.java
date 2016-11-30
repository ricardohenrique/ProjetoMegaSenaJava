/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControllerSorteios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Mota
 */
public class ModelSorteio {
    public List<ControllerSorteios> getSorteios() {
 
        try {
            ModelConexao con = new ModelConexao();
            con.getConexao();
            
            String sql = "select * from sorteios";
            
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            List<ControllerSorteios> listaDeSorteios = new ArrayList<ControllerSorteios>();
 
            while (resultado.next()) {
                ControllerSorteios sorteios = new ControllerSorteios();
                sorteios.setId(resultado.getInt("id"));
                sorteios.setDezena01(resultado.getInt("dezena_01"));
                sorteios.setDezena02(resultado.getInt("dezena_02"));
                sorteios.setDezena03(resultado.getInt("dezena_03"));
                sorteios.setDezena04(resultado.getInt("dezena_04"));
                sorteios.setDezena05(resultado.getInt("dezena_05"));
                sorteios.setDezena06(resultado.getInt("dezena_06"));
 
                listaDeSorteios.add(sorteios);
            }
 
            //Ao terminar o laço, fecha a conexão
            resultado.close();
            comando.close();
            con.getConexao().close();
 
            //Retorna a lista de carros
            return listaDeSorteios;
 
        } catch (Exception e) { //Se der algum exessão...
            System.out.println(e.getMessage());
            return null;
        }
    }  

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
