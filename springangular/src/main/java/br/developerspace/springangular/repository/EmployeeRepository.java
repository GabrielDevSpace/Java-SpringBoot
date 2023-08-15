package br.developerspace.springangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.developerspace.springangular.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
