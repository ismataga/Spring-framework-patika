package com.ismataga.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//cdi -> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_named {
    private Long namedId;
    private String namedData="Mehabalar Named Cdi Bean";
}
