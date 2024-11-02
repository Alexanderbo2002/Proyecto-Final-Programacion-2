package com.api.api.controller;

import com.api.api.entity.Eventos;
import com.api.api.service.EventosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/eventos")
public class EventosController {

    @Autowired
    private EventosService eventosService;

    @GetMapping
    public List<Eventos> getAllEventos() {
        return eventosService.getEventos();
    }

    @GetMapping("/{id}")
    public Eventos getEventoById(@PathVariable("id") long id) {
        return eventosService.getEvento(id);
    }

    @PostMapping
    public ResponseEntity<Eventos> saveUpdate(@RequestBody Eventos evento) {
        Eventos createdEvento = eventosService.saveOrUpdate(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEvento);
    }

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable("id") long id) {
        eventosService.delete(id);
    }

    @PutMapping("/{idEvento}")
    public ResponseEntity<Eventos> actualizarEvento(
            @PathVariable Long idEvento, @RequestBody Eventos eventoActualizado) {
        Optional<Eventos> eventoOpt = eventosService.actualizarEvento(idEvento, eventoActualizado);

        if (eventoOpt.isPresent()) {
            return ResponseEntity.ok(eventoOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
