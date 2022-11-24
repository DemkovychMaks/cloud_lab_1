package com.lab_for_cloud.lab_for_cloud.controller;

import com.lab_for_cloud.lab_for_cloud.DTO.SingerDTO;
import com.lab_for_cloud.lab_for_cloud.domain.Singer;
import com.lab_for_cloud.lab_for_cloud.mapper.SingerMapper;
import com.lab_for_cloud.lab_for_cloud.service.AbstractService;
import com.lab_for_cloud.lab_for_cloud.service.SingerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab_for_cloud.lab_for_cloud.mapper.AbstractMapper;

@RequestMapping(value = "/singer")
@RestController
@AllArgsConstructor
public class SingerController extends AbstractController<Singer, SingerDTO, Integer> {
    private final SingerService singerService;
    private final SingerMapper singerMapper;

    @Override
    public AbstractService<Singer, Integer> getService() {
        return singerService;
    }

    @Override
    public AbstractMapper<Singer, SingerDTO> getMapper() {
        return singerMapper;
    }
}
