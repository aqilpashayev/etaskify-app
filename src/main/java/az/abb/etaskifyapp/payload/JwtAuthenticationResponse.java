package az.abb.etaskifyapp.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtAuthenticationResponse {

    private String accessToken;
    private String tokenType = "Beare ";

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
