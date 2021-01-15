package com.wolf.noteScout.controller;

import com.wolf.noteScout.model.Note;
import com.wolf.noteScout.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/scoutnote")
    public List<Note> index() {return noteRepository.findAll();}

    @GetMapping("/scoutnote/{groupID}")
    public List<Note> getNoteGroupID(@PathVariable int groupID) {
        return noteRepository.findByGroupID(groupID);
    }

    @PutMapping("/scoutnote/save")
    Note note(@RequestBody Note note){
        return noteRepository.save(note);
    }

    @PutMapping("/scoutnote/isChecked/{id}")
    public Note note(@PathVariable int id, @RequestBody boolean checked){

        Note item = noteRepository.findOne(id);
        int validCheck = 0;

        if(item != null){
            if(checked){
                validCheck = 1;
                item.setIsChecked(validCheck);
            }else{
                item.setIsChecked(validCheck);
            }
            return noteRepository.save(item);
        }else{
            return null;
        }
    }

    @DeleteMapping("/scoutnote/{id}")
    public void deleteNote(@PathVariable int id){
        noteRepository.delete(id);
    }
}
