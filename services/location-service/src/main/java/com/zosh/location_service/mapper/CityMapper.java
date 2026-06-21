package com.zosh.location_service.mapper;

import com.zosh.location_service.model.City;
import com.zosh.payload.request.CityRequest;

public class CityMapper {
    public static City getCity(CityRequest request) {
        if(request == null) return  null;

        return City.builder()
                .name(request.getName())
                .cityCode(request.getCityCode())
                .countryCode(request.getCountryCode())
                .countryName(request.getCountryName())
                .timeZoneId(request.getTimeZoneOffset())
                .build();
    }
}
