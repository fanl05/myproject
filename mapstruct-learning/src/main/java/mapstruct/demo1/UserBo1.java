package mapstruct.demo1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ryland
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserBo1 {

    private Integer id;
    private String name;

    private String school;
    private String location;

}
