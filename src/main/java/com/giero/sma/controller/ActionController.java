package com.giero.sma.controller;

import com.giero.sma.dto.ActionRequestDto;
import com.giero.sma.dto.ActionResponseDto;
import com.giero.sma.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actions")
public class ActionController {

    private final ActionService actionService;

    @Autowired
    public ActionController(ActionService actionService) {
        this.actionService = actionService;
    }

    @PostMapping
    ActionResponseDto postAction(@RequestBody ActionRequestDto actionRequestDto) {
        return actionService.createAction(actionRequestDto);
    }

}
