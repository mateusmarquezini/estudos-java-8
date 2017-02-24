package ordenacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mmn on 22/02/17.
 */
public class RunApp {

    public static void main(String[] args) {

	Usuario usuario01 = new Usuario("Mateus Marquezini", 100, true);
	Usuario usuario02 = new Usuario("Ricardo Silva", 350, false);
	Usuario usuario03 = new Usuario("Milena Oliveira", 25, false);
	Usuario usuario04 = new Usuario("Sérgio Gomes", 90, false);
	Usuario usuario05 = new Usuario("Jaqueline Silva", 1200, false);
	Usuario usuario06 = new Usuario("Thomas Assis", 250, false);

	List<Usuario> usuarios = Arrays.asList(usuario01, usuario02, usuario03, usuario04, usuario05, usuario06);

	System.out.println("****** Todos os usuários: ******");
	usuarios.forEach(u -> System.out.println(u.getNome()));

	System.out.println("****** Usuarios com mais de 100 pontos ******");
	usuarios.stream()
			.filter(u -> u.getPontos() > 100)
			.forEach(u -> System.out.println(u.getNome()));

	System.out.println("****** Usuarios que são moderadores utilizando stream ******");
	usuarios.stream()
			.filter(Usuario::isModerador)
			.forEach(u -> System.out.println(u.getNome()));

	final List<Usuario> usuariosApenasModeradores = usuarios.stream()
			.filter(Usuario::isModerador)
			.collect(Collectors.toList());

	System.out.println("****** Usuarios que são moderadores utilizando Collectors ******");
	usuariosApenasModeradores.forEach(u -> System.out.println(u.getNome()));

	System.out.println("****** Listando pontos com map() ******");
	usuarios.stream()
			.map(Usuario::getPontos)
			.forEach(System.out::println);
    }
}
