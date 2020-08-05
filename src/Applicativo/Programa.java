package Applicativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Postagem;

public class Programa {
	public static void main(String[]args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario comentario1 = new Comentario("Boa viagem!");
		Comentario comentario2 = new Comentario("Me levaaa...");
		Postagem post1 = new Postagem(
				sdf.parse("04/08/2020 20:45:32"),
				"Viagem",
				"Partiu viagem!",
				144);
		post1.addComentario(comentario1);
		post1.addComentario(comentario2);
		
		System.out.println(post1);
				
		Comentario comentario3 = new Comentario("Ficou muito lindo!");
		Comentario comentario4 = new Comentario("Parabéns!");
		Postagem post2 = new Postagem(
				sdf.parse("05/08/2020 14:55:25"),
				"Reforma do escritório",
				"Olhem meu novo escritório",
				131);
		
		post2.addComentario(comentario3);
		post2.addComentario(comentario4);
		
		System.out.println(post2);
				
	}

}
