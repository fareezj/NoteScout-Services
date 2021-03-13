package com.wolf.noteScout.controller;

import com.wolf.noteScout.model.Group;
import com.wolf.noteScout.model.Note;
import com.wolf.noteScout.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Group addNewGroup(@PathVariable int groupId, @PathVariable String groupOwner) {
//        Group group = new Group(
//                groupId,
//                groupOwner
//        );
//
//        return groupRepository.save(group);

        List<Group> result = groupRepository.findByGroupId(groupId);
        Group group = new Group(
                groupId,
                groupOwner
        );
        if(result.isEmpty()) {
            return groupRepository.save(group);
        }else {
           return null;
        }
    }
}
