package com.notes.notesTakerapi.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.notes.notesTakerapi.model.Notes;
import com.notes.notesTakerapi.services.NotesServices;

@Controller
public class NotesController {

    // initialization of the service
    private final NotesServices notesService;

    public NotesController(NotesServices notesServices) {
        this.notesService = notesServices;
    }

    // mapping for fetching all the tasks
    @GetMapping
    public String getNotes(Model model) {
        List<Notes> notes = notesService.getAllNotes();
        model.addAttribute("notes", notes);
        return "notes";
    }

    @GetMapping("/{id}/delete")
    public String deleteNotes(@PathVariable long id) {
        notesService.deletenoteByid(id);
        return "redirect:/";
    }

    @PostMapping("/{id}/update")
    public String updateNotes(@PathVariable long id, @RequestParam String title, @RequestParam String description) {
        notesService.UpdateTask(id, title, description);
        return "redirect:/";
    }

    @PostMapping
    public String createNotes(@RequestParam String title, @RequestParam String description) {
        notesService.createNote(title, description);
        return "redirect:/";
    }

    @GetMapping("/{id}/important")
    public String MakeNoteImportant(@PathVariable long id) {
        notesService.MakeNoteImportant(id);
        return "redirect:/";
    }
}
