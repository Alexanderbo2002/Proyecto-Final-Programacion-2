package com.api.api.controller;

import com.api.api.entity.Invitado;
import com.api.api.service.InvitadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/invitados")
public class InvitadoController {

    @Autowired
    private InvitadoService invitadoService;

    @GetMapping
    public List<Invitado> getAllInvitados() {
        return invitadoService.getInvitados();
    }

    @GetMapping("/{id}")
    public Invitado getInvitadoById(@PathVariable("id") long id) {
        return invitadoService.getInvitado(id);
    }

    @PostMapping
    public ResponseEntity<Invitado> saveOrUpdate(@RequestBody Invitado invitado) {
        Invitado createdInvitado = invitadoService.saveOrUpdate(invitado);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdInvitado);
    }

    @DeleteMapping("/{id}")
    public void deleteInvitado(@PathVariable("id") long id) {
        invitadoService.delete(id);
    }

    @PutMapping("/{idInvitado}")
    public ResponseEntity<Invitado> actualizarInvitado(
            @PathVariable Long idInvitado, @RequestBody Invitado invitadoActualizado) {
        Optional<Invitado> invitadoOpt = invitadoService.actualizarInvitado(idInvitado, invitadoActualizado);

        if (invitadoOpt.isPresent()) {
            return ResponseEntity.ok(invitadoOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
