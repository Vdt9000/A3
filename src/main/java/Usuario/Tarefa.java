
package Usuario;


public class Tarefa {

    public Tarefa() {
    }
    private String Descrição;
    private int Id;

    public String getDescrição() {
        return Descrição;
    }

    public int getId() {
        return Id;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Tarefa(String Descrição, int Id) {
        this.Descrição = Descrição;
        this.Id = Id;
    }
    
}
