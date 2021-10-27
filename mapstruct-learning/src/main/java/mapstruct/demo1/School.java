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
public class School {

    private String name;
    private String location;

}
