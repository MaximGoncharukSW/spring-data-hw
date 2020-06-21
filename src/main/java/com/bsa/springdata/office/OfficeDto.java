package com.bsa.springdata.office;

import java.util.UUID;

public class OfficeDto {
    private final UUID id;
    private final String city;
    private final String address;

    public static OfficeDto fromEntity(Office office) {
        return OfficeDto
                .builder()
                .id(office.getId())
                .address(office.getAddress())
                .city(office.getCity())
                .build();
    }
}
