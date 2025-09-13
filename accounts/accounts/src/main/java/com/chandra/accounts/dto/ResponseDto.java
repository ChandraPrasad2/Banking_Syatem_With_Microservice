package com.chandra.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;


@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@Data 
@NoArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status code of the response"
    )
    private String statusCode;
    @Schema(
            description = "Status message of the response"
    )
    private String statusMsg;
    
    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
