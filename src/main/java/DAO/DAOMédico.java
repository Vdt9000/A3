
package DAO;

import Usuario.Médico;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
public class DAOMédico {
    
        public boolean login (Médico med) throws Exception {
        String sql = "SELECT * FROM tb_medico WHERE login = ? AND senha = ?";
try (Connection conn = ConnectionFactory.obtemConexao(); 
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, med.getLogin());
            ps.setString(2, med.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public void inserir() {
//1: Definir o comando SQL
        String sql = "INSERT INTO tb_paciente (nome, email) VALUES (?, ?, ?)";
//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
//3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
//4: Preenche os dados faltantes
            ps.setString(1, "");
            ps.setString(2, "");
            ps.setString(3, "");
//5: Executa o comando
            ps.execute();
        } catch (SQLException e) {
          
        }
    }
}




