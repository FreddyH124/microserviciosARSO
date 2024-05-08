package org.arso.tests;

import org.arso.factory.FactoriaServicios;
import org.arso.interfaces.IServicioAlquileres;
import org.arso.repository.NotAllowedException;
import org.arso.repository.RepositorioException;

public class ProgramEjercicio2 {
    public static void main(String[] args) throws NotAllowedException, RepositorioException {
        //RepositorioUsuarios repositorio = FactoriaRepositorios.getRepositorio(Usuario.class);
        IServicioAlquileres servicio = FactoriaServicios.getServicio(IServicioAlquileres.class);

        //Reservar bicicleta con repositorio en memoria
        servicio.reservarBicicleta("1", "5");

        //Confirmar la reserva activa del usuario
        //servicio.confirmarReserva("1");

        //Alquilar bicicleta sin reserva previa
        //Para que funcione se deben comentar los dos metodos anteriores del servicio
        //ya que solo podemos alguilar directamente una bici si no tenemo ninguna reserva ni alquiler activo
        //servicio.alquilarBicicleta("1", "4");

        //Obtener el historial del usuario
        /*Usuario usuario = servicio.historialUsuario("1");
        System.out.println(usuario.toString());*/

        //Dejar la bicicleta en una estación
        //servicio.dejarBicicleta("1", "333");

        //Liberar al usuario del bloqueo.
        //Para ello primero creamos una reserva que se vaya a bloquear.
        /*Reserva r = new Reserva();
        r.setIdBicicleta("2");
        r.setCreada(LocalDateTime.now().minusMinutes(35));
        r.setCaducidad(LocalDateTime.now());

        usuario.addReserva(r);

        servicio.liberarBloqueo("1");*/
    }
}
