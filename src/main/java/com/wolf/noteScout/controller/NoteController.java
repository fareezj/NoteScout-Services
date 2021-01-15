package com.wolf.noteScout.controller;

import com.sun.javafx.collections.MappingChange;
import com.wolf.noteScout.model.Note;
import com.wolf.noteScout.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/scoutnote")
    public List<Note> index() {return noteRepository.findAll();}

    @PostMapping("/scoutnote/")
    Note note(@RequestBody Note note){
        return noteRepository.save(note);
    }
}
