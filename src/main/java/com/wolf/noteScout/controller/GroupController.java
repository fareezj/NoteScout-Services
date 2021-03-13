package com.wolf.noteScout.controller;

import com.wolf.noteScout.model.Group;
import com.wolf.noteScout.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

//    @PutMapping("/scoutnote/addNewGroup")
//    Group group(@RequestBody Group group) {
//        return groupRepository.save(group);
//    }

    @GetMapping("/scoutnote/checkGroup/{groupId}/{groupOwner")
    public Group group(@PathVariable int groupId, @PathVariable String groupOwner) {

        List<Group> result = groupRepository.findByGroupId(groupId);
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupOwner(groupOwner);
        if(result == null) {
            return groupRepository.save(group);
        }else {
           return null;
        }
    }
}
