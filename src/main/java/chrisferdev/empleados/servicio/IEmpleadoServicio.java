package chrisferdev.empleados.servicio;

import java.util.List;

import chrisferdev.empleados.modelo.Empleado;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscEmpleadoPorId(Integer idEmpleado);

    public void guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
