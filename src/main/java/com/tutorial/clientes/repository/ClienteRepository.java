
package com.tutorial.clientes.repository;

import com.tutorial.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
