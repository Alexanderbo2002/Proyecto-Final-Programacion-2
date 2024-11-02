package com.api.api.service;

import com.api.api.entity.Invitado;
import com.api.api.repository.InvitadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvitadoService {

    @Autowired
    private InvitadoRepository invitadoRepository;

    public List<Invitado> getInvitados() {
        return invitadoRepository.findAll();
    }

    public Invitado getInvitado(long id) {
        return invitadoRepository.findById(id).orElse(null);
    }

    public Invitado saveOrUpdate(Invitado invitado) {
        return invitadoRepository.save(invitado);
    }

    public void delete(long id) {
        invitadoRepository.deleteById(id);
    }

    public Optional<Invitado> actualizarInvitado(Long id, Invitado invitadoActualizado) {
        Optional<Invitado> invitadoOpt = invitadoRepository.findById(id);

        if (invitadoOpt.isPresent()) {
            Invitado invitadoExistente = invitadoOpt.get();
            if (invitadoActualizado.getNombre() != null) {
                invitadoExistente.setNombre(invitadoActualizado.getNombre());
            }
            if (invitadoActualizado.getApellido() != null) {
                invitadoExistente.setApellido(invitadoActualizado.getApellido());
            }
            if (invitadoActualizado.getCorreo() != null) {
                invitadoExistente.setCorreo(invitadoActualizado.getCorreo());
            }
            if (invitadoActualizado.getTelefono() != null) {
                invitadoExistente.setTelefono(invitadoActualizado.getTelefono());
            }
            return Optional.of(invitadoRepository.save(invitadoExistente));
        }

        return Optional.empty();
    }
}
