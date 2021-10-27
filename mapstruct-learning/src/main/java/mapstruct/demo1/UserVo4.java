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
public class UserVo4 {

    private String userId;
    private String username;
    private String createTime;
    private String updateTime;

}