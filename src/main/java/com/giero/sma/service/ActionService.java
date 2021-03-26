package com.giero.sma.service;

import com.giero.sma.dto.ActionRequestDto;
import com.giero.sma.dto.ActionResponseDto;
import com.giero.sma.entity.Action;
import com.giero.sma.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

    private final ActionRepository actionRepository;

    @Autowired
    public ActionService(ActionRepository actionRepository) {
        this.actionRepository = actionRepository;
    }

    public ActionResponseDto createAction(ActionRequestDto actionRequestDto) {
        Action action = actionRepository.save(actionRequestDto.toAction());
        return ActionResponseDto.fromAction(action);
    }

}
