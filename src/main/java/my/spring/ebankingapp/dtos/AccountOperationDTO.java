package my.spring.ebankingapp.dtos;

import lombok.Data;
import my.spring.ebankingapp.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

