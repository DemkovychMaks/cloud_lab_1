package com.lab_for_cloud.lab_for_cloud.mapper;

public abstract class  AbstractMapper<T, DTO> {
     public abstract DTO mapObjectToDto(T object);
}
