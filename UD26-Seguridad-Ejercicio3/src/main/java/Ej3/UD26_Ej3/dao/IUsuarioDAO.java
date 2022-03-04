package Ej3.UD26_Ej3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import Ej3.UD26_Ej3.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}