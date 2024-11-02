package com.api.api.service;

import com.api.api.entity.Eventos;
import com.api.api.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventosService {

    @Autowired
    private EventosRepository eventosRepository;

    public List<Eventos> getEventos() {
        return eventosRepository.findAll();
    }

    public Eventos getEvento(long id) {
        return eventosRepository.findById(id).orElse(null);
    }

    public Eventos saveOrUpdate(Eventos evento) {
        return eventosRepository.save(evento);
    }

    public void delete(long id) {
        eventosRepository.deleteById(id);
    }

    public Optional<Eventos> actualizarEvento(Long id, Eventos eventoActualizado) {
        Optional<Eventos> eventoOpt = eventosRepository.findById(id);

        if (eventoOpt.isPresent()) {
            Eventos eventoExistente = eventoOpt.get();
            if (eventoActualizado.getNombreEvento() != null) {
                eventoExistente.setNombreEvento(eventoActualizado.getNombreEvento());
            }
            if (eventoActualizado.getFecha() != null) {
                eventoExistente.setFecha(eventoActualizado.getFecha());
            }
            if (eventoActualizado.getHora() != null) {
                eventoExistente.setHora(eventoActualizado.getHora());
            }
            if (eventoActualizado.getUbicacion() != null) {
                eventoExistente.setUbicacion(eventoActualizado.getUbicacion());
            }
            if (eventoActualizado.getNombreOrganizador() != null) {
                eventoExistente.setNombreOrganizador(eventoActualizado.getNombreOrganizador());
            }
            if (eventoActualizado.getApellidoOrganizador() != null) {
                eventoExistente.setApellidoOrganizador(eventoActualizado.getApellidoOrganizador());
            }
            if (eventoActualizado.getCorreo() != null) {
                eventoExistente.setCorreo(eventoActualizado.getCorreo());
            }
            if (eventoActualizado.getTelefono() != null) {
                eventoExistente.setTelefono(eventoActualizado.getTelefono());
            }
            return Optional.of(eventosRepository.save(eventoExistente));
        }

        return Optional.empty();
    }
}
