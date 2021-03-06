package com.Educord97.github.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Educord97.github.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNome(String Nome);
	List<Cliente> findByNomeContaining(String Nome);
	Optional<Cliente> findByEmail(String email);
}
