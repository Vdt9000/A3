package DAO;

import Usuario.Paciente;
import Usuario.Tarefa;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOTarefas {
    public void inserir(Tarefa t) {
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
     public Paciente [] obterPaciente(String cpf) throws Exception {
             String sql = "SELECT descricao FROM tb_tarefas where cpf = ?";
             
              ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao();
                PreparedStatement ps = c.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE);
                
                              
        
                                      ResultSet rs = ps.executeQuery()) {
        
             
            
            
            
            int totalDePacientes = rs.last () ? rs.getRow() : 0;
            Paciente [] paciente = new Paciente[totalDePacientes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()){
                String Cpf =rs.getString (cpf);
                
                paciente [contador++] = new Paciente (cpf);
            }
                      
        
        return paciente;
     }
}
            
            public void insert() throws SQLException {
//1: Definir o comando SQL
        String desc = "INSERT INTO tb_tarefa (id, descricao) VALUES (?, ?)";
//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection con = factory.obtemConexao()) {
            String sql = null;
//3: Pré compila o comando
            PreparedStatement ps = con.prepareStatement(sql);
//4: Preenche os dados faltantes
            ps.setString(1, "");
            ps.setString(2, "");
         
             
        }
       
            }
}