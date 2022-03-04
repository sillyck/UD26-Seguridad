package T26.PiezasProveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import T26.PiezasProveedores.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}