package az.abb.etaskifyapp.response;

import az.abb.etaskifyapp.enums.BRStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {

    private BRStatus status;
    private String error;
    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(BRStatus status, Object data) {
        this.status = status;
        this.data = data;
    }
}
