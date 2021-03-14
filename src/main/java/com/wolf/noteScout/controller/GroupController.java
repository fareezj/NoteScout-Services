package com.wolf.noteScout.controller;

import com.wolf.noteScout.model.Group;
import com.wolf.noteScout.model.Note;
import com.wolf.noteScout.model.ResponseBody;
import com.wolf.noteScout.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @GetMapping("/scoutnote/checkGroup/{groupID}")
    public List<Group> checkGroupId(@PathVariable int groupID) {
        return groupRepository.findByGroupId(groupID);
    }

    @PutMapping("/scoutnote/addGroup/{groupId}/{groupOwner}")
    public ResponseEntity<?>  addNewGroup(@PathVariable int groupId, @PathVariable String groupOwner) {

        if(groupRepository.findByGroupId(groupId).isEmpty()) {
            Group group = new Group(
                    groupId,
                    groupOwner
            );
            groupRepository.save(group);
            return ResponseEntity.ok(new ResponseBody("SUCCESS"));
        }else {
           return ResponseEntity.ok(new ResponseBody("FAILED"));
        }
    }
}
