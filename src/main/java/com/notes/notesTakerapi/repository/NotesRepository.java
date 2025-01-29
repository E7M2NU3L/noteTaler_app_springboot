package com.notes.notesTakerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.notesTakerapi.model.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {
    
}
