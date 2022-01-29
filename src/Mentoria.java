import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private String titulo;
	private String descricao;
	private LocalDate data;

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return EXPERIENCIA_PADRAO + 20d;
	}
}