package com.wolf.noteScout.repository;

import com.wolf.noteScout.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findByGroupID(int groupID);

}
