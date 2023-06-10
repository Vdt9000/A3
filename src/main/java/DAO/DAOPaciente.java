
package DAO;

import Usuario.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOPaciente {
  
    public void inserir(Paciente paciente) {
//1: Definir o comando SQL
        String sql = "insert INTO tb_paciente (cpf, senha, nome, tipo, RG, dataNascimento, nomeMae, nomePai,"
                + "telefone, cidade, uf, endereço, bairro, numero)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
//3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
//4: Preenche os dados faltantes
            ps.setString(1, paciente.getCpf());
            ps.setString(2, paciente.getSenha());
            ps.setString(3, paciente.getNome());
           ps.setString(4, paciente.getTipo());
           ps.setString(5, paciente.getRg());
           ps.setString(6, paciente.getNasData());
           ps.setString(7, paciente.getMae());
           ps.setString(8, paciente.getPai());
           ps.setString(9, paciente.getCel());
           ps.setString(10, paciente.getCidade());
           ps.setString(11, paciente.getUf());
           ps.setString(12, paciente.getEndereco());
           ps.setString(13, paciente.getBairro());
           ps.setString(14, paciente.getEndnum ());
           
                               
                 
//5: Executa o comando
            ps.execute();
        } catch (SQLException e) {
            
        }
    }
 
    public boolean login (Paciente paciente) throws Exception {
        String sql = "SELECT * FROM tb_paciente WHERE cpf = ? AND senha = ?";
try (Connection conn = ConnectionFactory.obtemConexao(); 
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, paciente.getCpf());
            ps.setString(2, paciente.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
       
}


