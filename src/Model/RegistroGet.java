/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Registros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Mota
 */
public class RegistroGet {
    
   //Método que retorna a lsta de carros, com todos os carros do sistema
    public List<Registros> getRegistros() {
 
        try {
            Conexao con = new Conexao();
            con.getConexao();
            
            String sql = "select * from registros;";
            
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            List<Registros> listaDeRegistros = new ArrayList<Registros>();
 
            while (resultado.next()) {
                Registros registro = new Registros();
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
