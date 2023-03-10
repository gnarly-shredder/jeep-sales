package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Color {
  private Long colorPK;
  private String colorId;
  private String color;
  private BigDecimal price;
  private boolean isExterior;
  private Engine engine;
}
