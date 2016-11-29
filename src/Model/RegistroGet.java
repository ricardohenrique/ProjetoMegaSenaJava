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
            //Conecta ao banco através da classe de conexão:
            Conexao con = new Conexao();
            con.getConexao();
 
            //Select na tablea de carros:
            String sql = "select * from registros;";
 
            //Executa a query
            PreparedStatement comando = con.getConexao().prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
 
            //Prepara a lista de carros para retornar
            List<Registros> listaDeRegistros = new ArrayList<Registros>();
 
            //para cada item retonrado no select, faça...
            while (resultado.next()) {
                Registros registro = new Registros(); //Cria um carro novo na memória
                registro.setNome(resultado.getString("nome")); //Seta o fabricante
                registro.setDezena01(resultado.getInt("dezena_01")); //Seta o modelo
                registro.setDezena02(resultado.getInt("dezena_02")); //Seta a cor
                registro.setDezena03(resultado.getInt("dezena_03")); //Seta a KM
                registro.setDezena04(resultado.getInt("dezena_04")); //Seta o valor do carro
                registro.setDezena05(resultado.getInt("dezena_05")); //Seta o ano de fabricação
                registro.setDezena06(resultado.getInt("dezena_06")); //Seta o ano de fabricação
 
                //insere o carro na lista local
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
