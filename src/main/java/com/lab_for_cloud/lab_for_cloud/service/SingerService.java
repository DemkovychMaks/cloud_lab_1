package com.lab_for_cloud.lab_for_cloud.service;

import com.lab_for_cloud.lab_for_cloud.repository.SingerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.lab_for_cloud.lab_for_cloud.domain.Singer;

@AllArgsConstructor
@Service
public class SingerService extends AbstractService<Singer, Integer> {
    public SingerRepository singerRepository;

    @Override
    protected JpaRepository<Singer, Integer> getRepository() {
        return singerRepository;
    }
}