package chrisferdev.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.empleados.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{
    
}
