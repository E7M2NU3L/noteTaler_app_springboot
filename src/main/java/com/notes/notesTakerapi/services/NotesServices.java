package com.notes.notesTakerapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.notes.notesTakerapi.model.Notes;
import com.notes.notesTakerapi.repository.NotesRepository;

@Service
public class NotesServices {

    private final NotesRepository notesRepository;

    public NotesServices(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }

    public void deletenoteByid(long id) {
        notesRepository.deleteById(id);
    }

    public void MakeNoteImportant(long id) {
        Notes notes = notesRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException(
            "Invalid note Id"
        ));

        notes.setImportant(!notes.isImportant());
        notesRepository.save(notes);
    }

    public void UpdateTask(long id, String title, String description) {
        Notes notes = notesRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid note Id"));

        notes.setTitle(title);
        notes.setDescription(description);

        notesRepository.save(notes);
    }

    public void createNote(String title, String description) {
        Notes note = new Notes();

        note.setTitle(title);
        note.setDescription(description);

        note.setImportant(false);

        notesRepository.save(note);
    }
}
