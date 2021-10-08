package br.com.willians.conversorcelsiusfarenheit.repository;

import br.com.willians.conversorcelsiusfarenheit.entity.Conversor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversorRepository extends JpaRepository<Conversor, Long> {

}
