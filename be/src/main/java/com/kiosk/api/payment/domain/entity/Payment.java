package com.kiosk.api.payment.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Payment {
    private Long paymentId;
    private Long orderId;
    private Integer totalPrice;
    private PaymentMethod method;
}
