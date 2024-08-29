package EVENTOS;

public class Eventos {

private int CodEventos;    
private String Nome;
private int DataEvento;
private int HorarioInicio;
private int HorarioTermino;
private String LocalEvento;
private String Descrição;
private String PublicoAlvo;
private int CapacidadeMaxima;
private String Organizador;

    public int getCodEventos() {
        return CodEventos;
    }

    public void setCodEventos(int CodEventos) {
        this.CodEventos = CodEventos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getDataEvento() {
        return DataEvento;
    }

    public void setDataEvento(int DataEvento) {
        this.DataEvento = DataEvento;
    }

    public int getHorarioInicio() {
        return HorarioInicio;
    }

    public void setHorarioInicio(int HorarioInicio) {
        this.HorarioInicio = HorarioInicio;
    }

    public int getHorarioTermino() {
        return HorarioTermino;
    }

    public void setHorarioTermino(int HorarioTermino) {
        this.HorarioTermino = HorarioTermino;
    }

    public String getLocalEvento() {
        return LocalEvento;
    }

    public void setLocalEvento(String LocalEvento) {
        this.LocalEvento = LocalEvento;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public String getPublicoAlvo() {
        return PublicoAlvo;
    }

    public void setPublicoAlvo(String PublicoAlvo) {
        this.PublicoAlvo = PublicoAlvo;
    }

    public int getCapacidadeMaxima() {
        return CapacidadeMaxima;
    }

    public void setCapacidadeMaxima(int CapacidadeMaxima) {
        this.CapacidadeMaxima = CapacidadeMaxima;
    }

    public String getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(String Organizador) {
        this.Organizador = Organizador;
    }

}
