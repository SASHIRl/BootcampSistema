import java.time.LocalDate;

public class Main {
	public static void main(String[]args) {
		Curso c1 = new Curso();
		c1.setTitulo("Java");
		c1.setDescricao("Descrição");
		c1.setCargaHoraria(8);
		
		Curso c2 = new Curso();
		c2.setTitulo("Javascript");
		c2.setDescricao("Descrição");
		c2.setCargaHoraria(9);
		
		Conteudo c3 = new Curso();
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Mentoria Java");
		m1.setDescricao("Descrição");
		m1.setData(LocalDate.now());
		
		Bootcamp b1 = new Bootcamp();
		b1.setNome("Bootcamp Java");
		b1.setDescricao("Descrição");
		b1.getConteudos().add(c1);
		b1.getConteudos().add(c2);
		b1.getConteudos().add(m1);
		
		Dev d1 = new Dev();
		d1.setNome("Diego");
		d1.inscreverBootcamp(b1);
		System.out.println("Conteúdos: " + d1.getConteudosInscritos());
		d1.progredir();
		System.out.println("Conteúdos: " + d1.getConteudosConcluidos());
		System.out.println("XP: " + d1.calcularXp());
		
		Dev d2 = new Dev();
		d2.setNome("Larissa");
		d2.inscreverBootcamp(b1);
		System.out.println("Conteúdos: " + d2.getConteudosInscritos());
		d2.progredir();
		d2.progredir();
		System.out.println("Conteúdos: " + d2.getConteudosConcluidos());
		System.out.println("XP: " + d2.calcularXp());
	}
}
