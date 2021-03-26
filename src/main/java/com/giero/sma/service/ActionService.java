package com.giero.sma.service;

import com.giero.sma.dto.ActionRequestDto;
import com.giero.sma.dto.ActionResponseDto;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

    public ActionResponseDto createAction(ActionRequestDto actionRequestDto) {
        return new ActionResponseDto();
    }

}
